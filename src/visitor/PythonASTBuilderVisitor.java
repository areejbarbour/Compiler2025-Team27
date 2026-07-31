package visitor;

import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import ast.paython.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import symbol_table.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class PythonASTBuilderVisitor extends pythonParserBaseVisitor<ASTNode> {

    public SymbolTable symTab = new SymbolTable();
    private Set<String> semanticErrors = new HashSet<>();
    public static Set<String> flaskVariables = new HashSet<>();
    private boolean insideFunctionCall = false;
    public static Set<String> getFlaskVariables() {
        return flaskVariables;
    }

    @Override
    public ASTNode visitProg(pythonParser.ProgContext ctx) {
        ProgramNode program = new ProgramNode(ctx.start.getLine());
        symTab.enterscope("global");
        for (pythonParser.StatementContext stmt : ctx.statement()) {
            ASTNode child = visit(stmt);
            if (child != null) program.addChild(child);
        }
        symTab.exitscope();
        return program;
    }

    @Override
    public ASTNode visitAssignmentStmt(pythonParser.AssignmentStmtContext ctx) {
        int line = ctx.start.getLine();
        String varName = ctx.assignment().ID().getText();
        ASTNode value = visit(ctx.assignment().expr());
        SymbolEntry entry = symTab.lookup(varName);
        if (entry == null) entry = symTab.insert(varName, SymbolEntry.SymbolKind.VARIABLE);

        Type newType = resolveType(value);
        Type oldType = entry.getType();
        boolean isNewVariable = (oldType == null);

        if (!isNewVariable && typesIncompatible(oldType, newType)) {
            semanticErrors.add("Semantic Error: Type mismatch - cannot assign value of type '"
                    + toPythonTypeName(newType) + "' to variable '" + varName
                    + "' previously of type '" + toPythonTypeName(oldType) + "' at line " + line);
        } else {
            entry.setType(newType);
        }
        AssignmentNode node = new AssignmentNode(varName, line);
        if (value != null) node.addChild(value);
        return node;
    }

    @Override
    public ASTNode visitExprStmt(pythonParser.ExprStmtContext ctx) {
        int line = ctx.start.getLine();
        ExprStmtNode node = new ExprStmtNode(line);
        ASTNode expr = visit(ctx.expr());
        if (expr != null) node.addChild(expr);
        return node;
    }

    @Override
    public ASTNode visitDefStmt(pythonParser.DefStmtContext ctx) {
        String name = ctx.defFunction().ID(0).getText();
        SymbolEntry existing = symTab.lookupCurrentScope(name);
        if (existing != null) {
            semanticErrors.add("Semantic Error: function '" + name + "' already defined (line " + ctx.start.getLine() + ")");
        }
        symTab.insert(name, SymbolEntry.SymbolKind.FUNCTION);
        symTab.enterscope("function:" + name);
        for (int i = 1; i < ctx.defFunction().ID().size(); i++) {
            String paramName = ctx.defFunction().ID(i).getText();
            SymbolEntry param = symTab.insert(paramName, SymbolEntry.SymbolKind.PARAMETER);
            if (param == null) {
                semanticErrors.add("Semantic Error: duplicate parameter '" + paramName + "' (line " + ctx.start.getLine() + ")");
            }
        }
        DefNode node = new DefNode(name, ctx.start.getLine());
        ASTNode body = visit(ctx.defFunction().block());
        if (body != null) node.addChild(body);
        symTab.exitscope();
        return node;
    }

    @Override
    public ASTNode visitDecorate(pythonParser.DecorateContext ctx) {
        String module = ctx.ID(0).getText();
        String func = ctx.ID(1).getText();
        int line = ctx.start.getLine();
        SymbolEntry moduleEntry = symTab.lookup(module);
        if (moduleEntry == null) {
            semanticErrors.add("Semantic Error: object '" + module + "' not defined (line " + line + ")");
        }
        DecorateNode node = new DecorateNode(module, func, line);
        if (ctx.args() != null) {
            for (var arg : ctx.args()) {
                ASTNode child = visit(arg);
                if (child != null) node.addChild(child);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitDecorateStmt(pythonParser.DecorateStmtContext ctx) {
        return visit(ctx.decorate());
    }

    @Override
    public ASTNode visitReturnStmt(pythonParser.ReturnStmtContext ctx) {
        ReturnNode node = new ReturnNode(ctx.start.getLine());
        if (ctx.return_().expr() != null) {
            for (var exprCtx : ctx.return_().expr()) {
                ASTNode child = visit(exprCtx);
                if (child != null) node.addChild(child);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitForStmt(pythonParser.ForStmtContext ctx) {
        String var = ctx.for_().ID().getText();
        symTab.enterscope("loop_scope");
        SymbolEntry entry = symTab.insert(var, SymbolEntry.SymbolKind.LOOP_VARIABLE);
        ForNode node = new ForNode(var, ctx.start.getLine());
        ASTNode iterable = visit(ctx.for_().expr());
        if (iterable != null) node.addChild(iterable);

        Type iterableType = resolveType(iterable);
        if (!isIterableType(iterableType)) {
            semanticErrors.add("Semantic Error: '" + toPythonTypeName(iterableType) +
                    "' object is not iterable at line " + ctx.start.getLine());
        }

        Type elementType = inferElementType(iterableType);
        if (entry != null) entry.setType(elementType);
        ASTNode body = visit(ctx.for_().loopBlock());
        if (body != null) node.addChild(body);
        symTab.exitscope();
        return node;
    }

    @Override
    public ASTNode visitIfStmt(pythonParser.IfStmtContext ctx) {
        IfNode node = new IfNode(ctx.start.getLine());
        node.addChild(visit(ctx.if_().condition()));
        node.addChild(visit(ctx.if_().block()));
        for (var elifCtx : ctx.if_().elif()) node.addChild(visit(elifCtx));
        if (ctx.if_().else_() != null) node.addChild(visit(ctx.if_().else_()));
        return node;
    }

    @Override
    public ASTNode visitWhileStmt(pythonParser.WhileStmtContext ctx) {
        WhileNode node = new WhileNode(ctx.start.getLine());
        node.addChild(visit(ctx.while_().condition()));
        node.addChild(visit(ctx.while_().loopBlock()));
        return node;
    }

    @Override
    public ASTNode visitEmptyStmt(pythonParser.EmptyStmtContext ctx) { return null; }

    @Override
    public ASTNode visitBlock(pythonParser.BlockContext ctx) {
        BlockNode block = new BlockNode(ctx.start.getLine());
        for (pythonParser.StatementContext stmt : ctx.statement()) {
            ASTNode child = visit(stmt);
            if (child != null) block.addChild(child);
        }
        return block;
    }

    @Override
    public ASTNode visitList(pythonParser.ListContext ctx) {
        ListNode node = new ListNode(ctx.start.getLine());
        if (ctx.expr() != null) {
            for (var exprCtx : ctx.expr()) {
                ASTNode child = visit(exprCtx);
                if (child != null) node.addChild(child);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitDict(pythonParser.DictContext ctx) {
        DictNode node = new DictNode(ctx.start.getLine());
        if (ctx.keyValue() != null) {
            for (var kv : ctx.keyValue()) {
                ASTNode child = visit(kv);
                if (child != null) node.addChild(child);
            }
        }
        return node;
    }

//    @Override
//    public ASTNode visitKeyValue(pythonParser.KeyValueContext ctx) {
//        KeyValueNode node = new KeyValueNode(ctx.start.getLine());
//        node.addChild(new LiteralNode("STRING", ctx.STRING().getText(), ctx.start.getLine()));
//        node.addChild(visit(ctx.expr()));
//        return node;
//    }
@Override
  public ASTNode visitKeyValue(pythonParser.KeyValueContext ctx) {
    KeyValueNode node = new KeyValueNode(ctx.start.getLine());
    String rawKey = ctx.STRING().getText();
    String cleanKey = rawKey.substring(1, rawKey.length() - 1);
    node.addChild(new LiteralNode("STRING", cleanKey, ctx.start.getLine()));
    node.addChild(visit(ctx.expr()));
    return node;
}

    @Override
    public ASTNode visitDefFunction(pythonParser.DefFunctionContext ctx) { return super.visitDefFunction(ctx); }
    @Override
    public ASTNode visitArgExprStmt(pythonParser.ArgExprStmtContext ctx) { return visit(ctx.expr()); }
    @Override
    public ASTNode visitKeywordArgStmt(pythonParser.KeywordArgStmtContext ctx) { return visit(ctx.keywordArg()); }

    @Override
    public ASTNode visitKeywordArg(pythonParser.KeywordArgContext ctx) {
        String name = ctx.ID().getText();
        ASTNode value = visit(ctx.expr());
        if (value == null) semanticErrors.add("Semantic Error: null value for '" + name + "' (line " + ctx.start.getLine() + ")");
        return new KeywordArgNode(name, value);
    }

    @Override
    public ASTNode visitImportStmt(pythonParser.ImportStmtContext ctx) {
        return visit(ctx.importStatement());
    }
    @Override
    public ASTNode visitImportStatement(pythonParser.ImportStatementContext ctx) {
        for (int i = 1; i < ctx.ID().size(); i++) {
            String name = ctx.ID(i).getText();
            switch (name) {

                case "Flask":
                    symTab.insert(name, SymbolEntry.SymbolKind.CLASS);
                    break;

                case "request":
                    symTab.insert(name, SymbolEntry.SymbolKind.OBJECT);
                    break;

                case "render_template":
                case "redirect":
                case "url_for":
                    symTab.insert(name, SymbolEntry.SymbolKind.FUNCTION);
                    break;
            }
        }
        return null;
    }

    @Override
    public ASTNode visitReturn(pythonParser.ReturnContext ctx) {
        ReturnNode node = new ReturnNode(ctx.start.getLine());
        if (ctx.expr() != null) {
            for (pythonParser.ExprContext exprCtx : ctx.expr()) {
                ASTNode child = visit(exprCtx);
                if (child != null) node.addChild(child);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitElif(pythonParser.ElifContext ctx) {
        ElifNode node = new ElifNode(ctx.start.getLine());
        node.addChild(visit(ctx.condition()));
        node.addChild(visit(ctx.block()));
        return node;
    }

    @Override
    public ASTNode visitElse(pythonParser.ElseContext ctx) {
        ElseNode node = new ElseNode(ctx.start.getLine());
        node.addChild(visit(ctx.block()));
        return node;
    }

//    @Override
//    public ASTNode visitComparisonCondition(pythonParser.ComparisonConditionContext ctx) {
//        ASTNode left = visit(ctx.expr(0));
//        ASTNode right = visit(ctx.expr(1));
//        if (left == null || right == null) return null;
//        String operator = ctx.comparison().getText();
//        return new ComparisonConditionNode(left, operator, right);
//    }
@Override
public ASTNode visitComparisonCondition(pythonParser.ComparisonConditionContext ctx) {
    ASTNode left = visit(ctx.expr(0));
    ASTNode right = visit(ctx.expr(1));
    if (left == null || right == null) return null;
    String operator = ctx.comparison().getText();

    boolean isOrderingOperator = operator.equals(">") || operator.equals("<")
            || operator.equals(">=") || operator.equals("<=");

    if (isOrderingOperator) {
        Type leftType = resolveType(left);
        Type rightType = resolveType(right);
        if (typesIncompatible(leftType, rightType)) {
            semanticErrors.add("Semantic Error: Type mismatch - cannot compare '"
                    + toPythonTypeName(leftType) + "' with '" + toPythonTypeName(rightType)
                    + "' using '" + operator + "' at line " + ctx.start.getLine());
        }
    }

    return new ComparisonConditionNode(left, operator, right);
}

    @Override
    public ASTNode visitIsNotNoneCondition(pythonParser.IsNotNoneConditionContext ctx) { return new IsNotNoneNode(visit(ctx.expr())); }
    @Override
    public ASTNode visitFalseCondition(pythonParser.FalseConditionContext ctx) { return new BooleanNode(false, ctx.start.getLine()); }
    @Override
    public ASTNode visitTrueCondition(pythonParser.TrueConditionContext ctx) { return new BooleanNode(true, ctx.start.getLine()); }
    @Override
    public ASTNode visitIsNoneCondition(pythonParser.IsNoneConditionContext ctx) { return new IsNoneNode(visit(ctx.expr())); }
    @Override
    public ASTNode visitOrCondition(pythonParser.OrConditionContext ctx) { return new OrConditionNode(visit(ctx.condition(0)), visit(ctx.condition(1))); }
    @Override
    public ASTNode visitAndCondition(pythonParser.AndConditionContext ctx) { return new AndConditionNode(visit(ctx.condition(0)), visit(ctx.condition(1))); }

    @Override
    public ASTNode visitLoopIf(pythonParser.LoopIfContext ctx) {
        ASTNode condition = visit(ctx.condition());
        ASTNode ifBlock = visit(ctx.loopBlock());
        List<ASTNode> elifNodes = new ArrayList<>();
        for (pythonParser.LoopElifContext e : ctx.loopElif()) {
            ASTNode child = visit(e);
            if (child != null) elifNodes.add(child);
        }
        ASTNode elseNode = ctx.loopElse() != null ? visit(ctx.loopElse()) : null;
        return new LoopIfNode(condition, ifBlock, elifNodes, elseNode);
    }

    @Override
    public ASTNode visitLoopElif(pythonParser.LoopElifContext ctx) { return new LoopElifNode(visit(ctx.condition()), visit(ctx.loopBlock())); }
    @Override
    public ASTNode visitLoopElse(pythonParser.LoopElseContext ctx) { return new LoopElseNode(visit(ctx.loopBlock())); }

    @Override
    public ASTNode visitLoopBlock(pythonParser.LoopBlockContext ctx) {
        BlockNode block = new BlockNode(ctx.start.getLine());
        for (pythonParser.LoopStmtContext stmt : ctx.loopStmt()) {
            ASTNode child = visit(stmt);
            if (child != null) block.addChild(child);
        }
        return block;
    }

    @Override
    public ASTNode visitLoopStmt(pythonParser.LoopStmtContext ctx) {
        if (ctx.loopIf() != null) return visit(ctx.loopIf());
        if (ctx.statement() != null) return visit(ctx.statement());
        if (ctx.BREAK() != null) return new BreakNode();
        return null;
    }

    @Override
    public ASTNode visitInteger(pythonParser.IntegerContext ctx) {
        try { return new IntegerNode(Integer.parseInt(ctx.getText()), ctx.start.getLine()); }
        catch (NumberFormatException e) { return null; }
    }
    @Override
    public ASTNode visitDictValue(pythonParser.DictValueContext ctx) { return visit(ctx.dict()); }
    @Override
    public ASTNode visitListValue(pythonParser.ListValueContext ctx) { return visit(ctx.list()); }
    @Override
    public ASTNode visitBool(pythonParser.BoolContext ctx) { return new BooleanNode(ctx.getText().equals("True"), ctx.start.getLine()); }

    @Override
    public ASTNode visitIndexAccess(pythonParser.IndexAccessContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.ID().getText();
        SymbolEntry entry = symTab.lookup(name);

        if (entry == null) {
            if (symTab.lookupAnyScope(name) != null) {
                semanticErrors.add("Semantic Error: variable '" + name + "' is out of scope at line " + line);
            } else {
                semanticErrors.add("Semantic Error: variable '" + name + "' not defined at line " + line);
            }
        } else if (!isSubscriptableType(entry.getType())) {
            semanticErrors.add("Semantic Error: '" + toPythonTypeName(entry.getType()) +
                    "' object is not subscriptable at line " + line);
        }

        IndexAccessNode node = new IndexAccessNode(line);
        node.addChild(new VariableNode(name, line));
        node.addChild(visit(ctx.expr()));
        return node;
    }

    @Override
    public ASTNode visitString(pythonParser.StringContext ctx) {
        String text = ctx.STRING().getText();
        return new StringNode(text.substring(1, text.length() - 1), ctx.start.getLine());
    }

    @Override
    public ASTNode visitID(pythonParser.IDContext ctx) {
        String name = ctx.getText();
        int line = ctx.start.getLine();
        if (!insideFunctionCall) {
        if (symTab.lookup(name) == null) {
            if (symTab.lookupAnyScope(name) != null) {
                semanticErrors.add("Semantic Error: variable '" + name + "' is out of scope at line " + line);
            } else {
                semanticErrors.add("Semantic Error: variable '" + name + "' not defined at line " + line);
            }
        }}
        return new VariableNode(name, line);
    }

    @Override
    public ASTNode visitAttributeAccess(pythonParser.AttributeAccessContext ctx) {
        ASTNode target = visit(ctx.expr());
        String attr = ctx.ID().getText();
        int line = ctx.start.getLine();
        if (target instanceof VariableNode) {
            String targetName = ((VariableNode) target).getName();
            if (symTab.lookup(targetName) == null) {
                if (symTab.lookupAnyScope(targetName) != null) {
                    semanticErrors.add("Semantic Error: '" + targetName + "' is out of scope at line " + line);
               }
 //               else {
//                    semanticErrors.add("Semantic Error: '" + targetName + "' not defined at line " + line);
//                }
            }
        }
        return new AttributeAccessNode(target, attr, line);
    }

    @Override
    public ASTNode visitFunctionCall(pythonParser.FunctionCallContext ctx) {
        FunctionCallNode node = new FunctionCallNode(ctx.start.getLine());
        insideFunctionCall = true;
        ASTNode function = visit(ctx.expr());
        insideFunctionCall = false;
        if (function != null) {
            node.setFunctionTarget(function);
            System.out.println("FUNCTION NODE = " + function.getClass().getSimpleName()); // <--- السطر المضاف
        }

        if (function instanceof VariableNode varNode) {
            String functionName = varNode.getName();
            if (functionName.equals("render_template")) {
                if (ctx.args() != null) {
                    for (pythonParser.ArgsContext argCtx : ctx.args()) {
                        ASTNode argNode = visit(argCtx);
                        if (argNode instanceof KeywordArgNode kw) {
                            flaskVariables.add(kw.getName());
                            System.out.println("Flask Variable Found: " + kw.getName()); // <--- السطر المضاف
                        }
                    }
                }
            }
            SymbolEntry entry = symTab.lookup(functionName);
            if (entry == null) {
                semanticErrors.add("Semantic Error: function '" + functionName + "' not defined (line " + ctx.start.getLine() + ")");
            } else if (!isCallable(entry)) {
                semanticErrors.add("Semantic Error: '" + toPythonTypeName(entry.getType()) +
                        "' object is not callable at line " + ctx.start.getLine());
            }
        }
        if (ctx.args() != null) {
            for (pythonParser.ArgsContext argCtx : ctx.args()) {
                ASTNode arg = visit(argCtx);
                if (arg != null) node.addArgument(arg);
            }
        }
        return node;
    }

    @Override
    public ASTNode visitNONE(pythonParser.NONEContext ctx) { return new NoneNode(ctx.start.getLine()); }
    @Override
    public ASTNode visitDouble(pythonParser.DoubleContext ctx) { return new DoubleNode(Double.parseDouble(ctx.getText()), ctx.start.getLine()); }
    @Override
    public ASTNode visitChildren(RuleNode node) { return super.visitChildren(node); }
    @Override
    public ASTNode visitErrorNode(ErrorNode node) { return super.visitErrorNode(node); }
    @Override
    protected ASTNode defaultResult() { return null; }
    @Override
    protected ASTNode aggregateResult(ASTNode aggregate, ASTNode nextResult) { return nextResult; }
    @Override
    protected boolean shouldVisitNextChild(RuleNode node, ASTNode currentResult) { return true; }
    @Override
    public String toString() { return "ASTNode"; }

    public void printsemanticErrors() {
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        for (String error : semanticErrors) {
            System.out.println(RED + error + RESET);
        }
    }

    private Type resolveType(ASTNode node) {
        if (node instanceof IntegerNode)
            return new PrimitiveType("INT");

        if (node instanceof DoubleNode)
            return new PrimitiveType("DOUBLE");

        if (node instanceof StringNode)
            return new PrimitiveType("STRING");

        if (node instanceof BooleanNode)
            return new PrimitiveType("BOOL");

        if (node instanceof NoneNode)
            return new PrimitiveType("NONE");

        if (node instanceof ListNode listNode) {
            if (listNode.getChildren().isEmpty())
                return new ListType(new PrimitiveType("UNKNOWN"));

            Type first = resolveType(listNode.getChildren().get(0));

            return new ListType(first);
        }
        if (node instanceof DictNode dictNode) {

            if (dictNode.getChildren().isEmpty()) {
                return new DictType(
                        new PrimitiveType("UNKNOWN"),
                        new PrimitiveType("UNKNOWN")
                );
            }

            KeyValueNode firstKv =
                    (KeyValueNode) dictNode.getChildren().get(0);

            Type firstValueType = resolveType(firstKv.getValue());

            DictType dictType = new DictType(
                    new PrimitiveType("STRING"),
                    firstValueType
            );

            for (ASTNode child : dictNode.getChildren()) {

                KeyValueNode kv = (KeyValueNode) child;

                ASTNode keyNode = kv.getKey();

                String key = null;

                if (keyNode instanceof LiteralNode literalNode) {

                    Object value = literalNode.getValue();

                    if (value instanceof String) {
                        key = (String) value;
                    }
                }

                if (key != null) {

                    Type valueType = resolveType(kv.getValue());

                    dictType.addFieldType(key, valueType);
                }
            }

            return dictType;
        }

        if (node instanceof IndexAccessNode indexNode) {


            ASTNode objectNode = indexNode.getChildren().get(0);
            ASTNode indexNodeValue = indexNode.getChildren().get(1);

            Type objectType = resolveType(objectNode);

            if (objectType instanceof DictType dictType) {

                String key = null;

                if (indexNodeValue instanceof StringNode stringNode) {
                    key = stringNode.getValue();
                }

                if (key != null) {

                    Type fieldType = dictType.getFieldType(key);

                    if (fieldType != null) {
                        return fieldType;
                    }
                }
            }

            return new PrimitiveType("UNKNOWN");
        }

        if (node instanceof VariableNode v) {
            SymbolEntry e = symTab.lookup(v.getName());

            if (e != null && e.getType() != null)
                return e.getType();

            return new PrimitiveType("UNKNOWN");
        }
        return new PrimitiveType("UNKNOWN");
    }
    private Type inferElementType(Type iterableType)
    {
        if (iterableType == null)
            return new PrimitiveType("UNKNOWN");

        if (iterableType instanceof ListType listType)
        {
            return listType.getElementtype();
        }

        if (iterableType instanceof PrimitiveType p)
        {
            if (p.name().equals("STRING"))
                return new PrimitiveType("STRING");
        }

        return new PrimitiveType("UNKNOWN");
    }
    private boolean isIterableType(Type type){
        if(type instanceof ListType) return true;
        if(type instanceof DictType) return true;
        if(type instanceof PrimitiveType p){
            if(p.name().equals("STRING")) return true;
            if(p.name().equals("UNKNOWN")) return true;
        }
        return false;
    }

    private boolean isSubscriptableType(Type type){
        if(type instanceof ListType) return true;
        if(type instanceof DictType) return true;
        if(type instanceof PrimitiveType p){
            if(p.name().equals("STRING")) return true;
            if(p.name().equals("UNKNOWN")) return true;
        }
        return false;
    }

    private boolean isCallable(SymbolEntry entry) {
        return entry.getKind() == SymbolEntry.SymbolKind.FUNCTION
                || entry.getKind() == SymbolEntry.SymbolKind.CLASS;
    }

    private String toPythonTypeName(Type type) {
        if (type instanceof ListType) return "list";
        if (type instanceof DictType) return "dict";
        if (type instanceof PrimitiveType p) {
            return switch (p.name()) {
                case "INT" -> "int";
                case "DOUBLE" -> "float";
                case "STRING" -> "str";
                case "BOOL" -> "bool";
                case "NONE" -> "NoneType";
                default -> "object";
            };
        }
        return "object";
    }

private boolean typesIncompatible(Type a, Type b) {
    if (a == null || b == null) return false;

    if (isIgnorableType(a) || isIgnorableType(b)) return false;

    if (isNumericType(a) && isNumericType(b)) return false;

    return !a.toString().equals(b.toString());
}

    private boolean isIgnorableType(Type type) {
        if (type instanceof PrimitiveType p) {
            return p.name().equals("UNKNOWN") || p.name().equals("NONE");
        }
        if (type instanceof ListType l) {
            return isIgnorableType(l.getElementtype());
        }
        if (type instanceof DictType d) {
            return isIgnorableType(d.getKeyType()) || isIgnorableType(d.getValueType());
        }
        return false;
    }

    private boolean isNumericType(Type type) {
        return type instanceof PrimitiveType p
                && (p.name().equals("INT") || p.name().equals("DOUBLE"));
    }


    public List<String> getSemanticErrors() {
        return new ArrayList<>(semanticErrors);
    }



}