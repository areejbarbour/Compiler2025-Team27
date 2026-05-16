package visitor;//package visitor;
import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import ast.paython.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import symbol_table.*;

import java.util.ArrayList;
import java.util.List;

public class PythonASTBuilderVisitor extends pythonParserBaseVisitor<ASTNode> {

    public SymbolTable symTab = new SymbolTable();

    private List<String> semanticErrors =
            new ArrayList<>();

    @Override
    public ASTNode visitProg(pythonParser.ProgContext ctx) {
        ProgramNode program = new ProgramNode(ctx.start.getLine());

        symTab.enterscope("global");
        for (pythonParser.StatementContext stmt : ctx.statement()) {
            ASTNode child = visit(stmt);
            if (child != null) {
                program.addChild(child);
            }
        }

        symTab.exitscope();

        return program;
    }

    @Override
    public ASTNode visitAssignmentStmt(pythonParser.AssignmentStmtContext ctx)
    {

        int line = ctx.start.getLine();
        String varName = ctx.assignment().ID().getText();
        ASTNode value = visit(ctx.assignment().expr());

        SymbolEntry entry = symTab.lookup(varName);

        if (entry == null)
        {
            entry = symTab.insert(
                    varName,
                    SymbolEntry.SymbolKind.VARIABLE
            );
        }
        Type type = resolveType(value);
        entry.setType(type);

        AssignmentNode node = new AssignmentNode(varName, line);
        if (value != null)
        {
            node.addChild(value);
        }

        return node;
    }

    @Override
    public ASTNode visitExprStmt(pythonParser.ExprStmtContext ctx) {

        int line = ctx.start.getLine();

        ExprStmtNode node = new ExprStmtNode(line);

        ASTNode expr = visit(ctx.expr());
        if (expr != null) {
            node.addChild(expr);
        }

        return node;
    }

    @Override
    public ASTNode visitDefStmt(pythonParser.DefStmtContext ctx) {

        String name = ctx.defFunction().ID(0).getText();

        SymbolEntry existing = symTab.lookupCurrentScope(name);

        if (existing != null)
        {
            semanticErrors.add(
                    "Semantic Error: function '" +
                            name +
                            "' already defined (line " +
                            ctx.start.getLine() + ")"
            );
        }
        SymbolEntry func =
                symTab.insert(
                        name,
                        SymbolEntry.SymbolKind.FUNCTION
                );

        symTab.enterscope("function:" + name);
        for (int i = 1; i < ctx.defFunction().ID().size(); i++)
        {
            String paramName = ctx.defFunction().ID(i).getText();

            SymbolEntry param =
                    symTab.insert(
                            paramName,
                            SymbolEntry.SymbolKind.PARAMETER
                    );

            if (param == null)
            {
                semanticErrors.add(
                        "Semantic Error: duplicate parameter '" +
                                paramName +
                                "' (line " + ctx.start.getLine() + ")"
                );
                continue;
            }

        }

        DefNode node = new DefNode(name, ctx.start.getLine());
        ASTNode body = visit(ctx.defFunction().block());

        if (body != null) {
            node.addChild(body);
        }

        symTab.exitscope();

        return node;
    }

    @Override
    public ASTNode visitDecorate(pythonParser.DecorateContext ctx) {

        String module = ctx.ID(0).getText(); // app
        String func = ctx.ID(1).getText();   // route

        int line = ctx.start.getLine();

        SymbolEntry moduleEntry = symTab.lookup(module);

        if (moduleEntry == null) {
            semanticErrors.add(
                    "Semantic Error: object '" +
                            module + "' not defined (line " + line + ")"
            );
        }
        DecorateNode node = new DecorateNode(module, func, line);

        // 4. arguments
        if (ctx.args() != null) {
            for (var arg : ctx.args()) {
                ASTNode child = visit(arg);
                if (child != null) {
                    node.addChild(child);
                }
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
                if (child != null) {
                    node.addChild(child);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitForStmt(pythonParser.ForStmtContext ctx) {

        String var = ctx.for_().ID().getText();
        symTab.enterscope("loop_scope");
        SymbolEntry entry =
                symTab.insert(var, SymbolEntry.SymbolKind.LOOP_VARIABLE);

        ForNode node = new ForNode(var, ctx.start.getLine());

        ASTNode iterable = visit(ctx.for_().expr());

        if (iterable != null) {
            node.addChild(iterable);
        }
        Type iterableType = resolveType(iterable);

        Type elementType = inferElementType(iterableType);

        entry.setType(elementType);

        ASTNode body = visit(ctx.for_().loopBlock());
        if (body != null) {
            node.addChild(body);
        }
        symTab.exitscope();
        return node;
    }

    @Override
    public ASTNode visitIfStmt(pythonParser.IfStmtContext ctx) {

        IfNode node = new IfNode(ctx.start.getLine());

        node.addChild(visit(ctx.if_().condition()));
        node.addChild(visit(ctx.if_().block()));

        for (var elifCtx : ctx.if_().elif()) {
            node.addChild(visit(elifCtx));
        }

        if (ctx.if_().else_() != null) {
            node.addChild(visit(ctx.if_().else_()));
        }
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
    public ASTNode visitEmptyStmt(pythonParser.EmptyStmtContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitBlock(pythonParser.BlockContext ctx) {

        BlockNode block = new BlockNode(ctx.start.getLine());
        for (pythonParser.StatementContext stmt : ctx.statement()) {
            ASTNode child = visit(stmt);
            if (child != null) {
                block.addChild(child);
            }
        }
        return block;
    }

     @Override
     public ASTNode visitList(pythonParser.ListContext ctx) {
        ListNode node = new ListNode(ctx.start.getLine());

        if (ctx.expr() != null) {
            for (var exprCtx : ctx.expr()) {
                ASTNode child = visit(exprCtx);
                if (child != null) {
                    node.addChild(child);
                }
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
                if (child != null) {
                    node.addChild(child);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitKeyValue(pythonParser.KeyValueContext ctx) {

        KeyValueNode node = new KeyValueNode(ctx.start.getLine());
        node.addChild(new LiteralNode(
                "STRING",
                ctx.STRING().getText(),
                ctx.start.getLine()
        ));
        node.addChild(visit(ctx.expr()));
        return node;
    }

    @Override
    public ASTNode visitDefFunction(pythonParser.DefFunctionContext ctx) {
        return super.visitDefFunction(ctx);
    }

    @Override
    public ASTNode visitArgExprStmt(pythonParser.ArgExprStmtContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ASTNode visitKeywordArgStmt(pythonParser.KeywordArgStmtContext ctx) {
        return visit(ctx.keywordArg());
    }

    @Override
    public ASTNode visitKeywordArg(pythonParser.KeywordArgContext ctx) {

        String name = ctx.ID().getText();
        ASTNode value = visit(ctx.expr());
        if (value == null)
        {
            semanticErrors.add(
                    "Semantic Error: null value for '"
                            + name + "' (line " + ctx.start.getLine() + ")"
            );
        }
        SymbolEntry param = symTab.lookup(name);

        if (param == null)
        {
            System.err.println(
                    "Warning: unknown keyword argument '"
                            + name + "' (line " +  ctx.start.getLine()  + ")"
            );
        }
        return new KeywordArgNode(name, value);
    }

    @Override
    public ASTNode visitImportStmt(pythonParser.ImportStmtContext ctx) {
        symTab.insert("Flask", SymbolEntry.SymbolKind.CLASS);
        symTab.insert("request", SymbolEntry.SymbolKind.OBJECT);
        symTab.insert("render_template", SymbolEntry.SymbolKind.FUNCTION);
        symTab.insert("redirect", SymbolEntry.SymbolKind.FUNCTION);
        symTab.insert("url_for", SymbolEntry.SymbolKind.FUNCTION);
        return visit(ctx.importStatement());
    }

    @Override
    public ASTNode visitReturn(pythonParser.ReturnContext ctx) {

        ReturnNode node = new ReturnNode(ctx.start.getLine());

        if (ctx.expr() != null) {

            for (pythonParser.ExprContext exprCtx : ctx.expr()) {

                ASTNode child = visit(exprCtx);

                if (child != null) {
                    node.addChild(child);
                }
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

    @Override
    public ASTNode visitComparisonCondition(pythonParser.ComparisonConditionContext ctx) {

        ASTNode left = visit(ctx.expr(0));
        ASTNode right = visit(ctx.expr(1));

        if (left == null || right == null) {
            System.err.println("Null in comparison at line " + ctx.start.getLine());
            return null;
        }

        String operator = ctx.comparison().getText();

        return new ComparisonConditionNode(left, operator, right);
    }

    @Override
    public ASTNode visitIsNotNoneCondition(pythonParser.IsNotNoneConditionContext ctx) {

        ASTNode expr = visit(ctx.expr());

        return new IsNotNoneNode(expr);
    }


    @Override
    public ASTNode visitFalseCondition(pythonParser.FalseConditionContext ctx) {
        return new BooleanNode(false, ctx.start.getLine());
    }

    @Override
    public ASTNode visitTrueCondition(pythonParser.TrueConditionContext ctx) {
        return new BooleanNode(true, ctx.start.getLine());
    }

    @Override
    public ASTNode visitIsNoneCondition(pythonParser.IsNoneConditionContext ctx) {

        ASTNode expr = visit(ctx.expr());

        return new IsNoneNode(expr);
    }

    @Override
    public ASTNode visitOrCondition(pythonParser.OrConditionContext ctx) {

        ASTNode left = visit(ctx.condition(0));
        ASTNode right = visit(ctx.condition(1));

        return new OrConditionNode(left, right);
    }

    @Override
    public ASTNode visitAndCondition(pythonParser.AndConditionContext ctx) {

        ASTNode left = visit(ctx.condition(0));
        ASTNode right = visit(ctx.condition(1));

        return new AndConditionNode(left, right);
    }

    @Override
    public ASTNode visitLoopIf(pythonParser.LoopIfContext ctx) {

        ASTNode condition = visit(ctx.condition());
        ASTNode ifBlock = visit(ctx.loopBlock());

        List<ASTNode> elifNodes = new ArrayList<>();
        for (pythonParser.LoopElifContext e : ctx.loopElif()) {
            ASTNode child = visit(e);
            if (child != null) {
                elifNodes.add(child);
            }
        }

        ASTNode elseNode = null;
        if (ctx.loopElse() != null) {
            elseNode = visit(ctx.loopElse());
        }

        return new LoopIfNode(condition, ifBlock, elifNodes, elseNode);
    }

    @Override
    public ASTNode visitLoopElif(pythonParser.LoopElifContext ctx) {

        ASTNode condition = visit(ctx.condition());
        ASTNode block = visit(ctx.loopBlock());

        return new LoopElifNode(condition, block);
    }

    @Override
    public ASTNode visitLoopElse(pythonParser.LoopElseContext ctx) {

        ASTNode block = visit(ctx.loopBlock());

        return new LoopElseNode(block);
    }

    @Override
    public ASTNode visitLoopBlock(pythonParser.LoopBlockContext ctx) {

        BlockNode block = new BlockNode(ctx.start.getLine());

        for (pythonParser.LoopStmtContext stmt : ctx.loopStmt()) {

            ASTNode child = visit(stmt);

            if (child != null) {
                block.addChild(child);
            }
        }

        return block;
    }

    @Override
    public ASTNode visitLoopStmt(pythonParser.LoopStmtContext ctx) {

        if (ctx.loopIf() != null) {
            return visit(ctx.loopIf());
        }

        if (ctx.statement() != null) {
            return visit(ctx.statement());
        }

        if (ctx.BREAK() != null) {
            return new BreakNode();
        }

        return null;
    }

    @Override
    public ASTNode visitInteger(pythonParser.IntegerContext ctx) {
        try {
            int value = Integer.parseInt(ctx.getText());
            return new IntegerNode(value, ctx.start.getLine());
        } catch (NumberFormatException e) {
            System.err.println("Invalid integer: " + ctx.getText());
            return null;
        }
    }

    @Override
    public ASTNode visitDictValue(pythonParser.DictValueContext ctx) {
        return visit(ctx.dict());
    }

    @Override
    public ASTNode visitListValue(pythonParser.ListValueContext ctx) {
        return visit(ctx.list());
    }

    @Override
    public ASTNode visitBool(pythonParser.BoolContext ctx) {
        return new BooleanNode(ctx.getText().equals("True"), ctx.start.getLine());
    }

    @Override
    public ASTNode visitIndexAccess(pythonParser.IndexAccessContext ctx) {
        int line = ctx.start.getLine();
        String name = ctx.ID().getText();

        SymbolEntry entry =
                symTab.lookup(name);

        if (entry == null)
        {
           semanticErrors.add(
                    "Semantic Error: variable '"
                            + name
                            + "' not defined at line "
                            + line
            );
        }
        IndexAccessNode node = new IndexAccessNode(line);
        node.addChild(new VariableNode(ctx.ID().getText(), line));
        node.addChild(visit(ctx.expr()));
        return node;
    }

    @Override
    public ASTNode visitString(pythonParser.StringContext ctx) {

        String text = ctx.STRING().getText();
        text = text.substring(1, text.length() - 1);

        return new StringNode(text, ctx.start.getLine());
    }

    @Override
    public ASTNode visitID(pythonParser.IDContext ctx) {
        String name = ctx.getText();
        int line = ctx.start.getLine();

        SymbolEntry entry =
                symTab.lookup(name);

        if (entry == null)
        {
           semanticErrors.add(
                    "Semantic Error: variable '"
                            + name
                            + "' not defined at line "
                            + line
            );
        }
        return new VariableNode(ctx.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitAttributeAccess(pythonParser.AttributeAccessContext ctx) {

        ASTNode target = visit(ctx.expr());

        String attr = ctx.ID().getText();

        int line = ctx.start.getLine();
        if (target instanceof VariableNode) {
            String targetName = ((VariableNode) target).getName();

            SymbolEntry entry = symTab.lookup(targetName);

            if (entry == null) {
                semanticErrors.add(
                        "Semantic Error: '" + targetName +
                                "' not defined at line " + line
                );
            }
        }

        return new AttributeAccessNode(target, attr, line);
    }

    @Override
    public ASTNode visitFunctionCall(pythonParser.FunctionCallContext ctx) {

        FunctionCallNode node = new FunctionCallNode(ctx.start.getLine());

        ASTNode function = visit(ctx.expr());
        if (function != null) {
            node.addChild(function);
        }
        if (function instanceof VariableNode varNode)
        {
            String functionName = varNode.getName();

            SymbolEntry entry =
                    symTab.lookup(functionName);

            if (entry == null)
            {
                System.err.println(
                        "Semantic Error: function '" +
                                functionName +
                                "' not defined (line " +
                                ctx.start.getLine() + ")"
                );
            }
            else if (
                    entry.getKind()
                            != SymbolEntry.SymbolKind.FUNCTION
            )
            {
                System.err.println(
                        "'" + functionName +
                                "' is not a function (line " +
                                ctx.start.getLine() + ")"
                );
            }
        }

        if (ctx.args() != null) {
            for (pythonParser.ArgsContext argCtx : ctx.args()) {
                ASTNode arg = visit(argCtx);
                if (arg != null) {
                    node.addChild(arg);
                }
            }
        }

        return node;
    }

    @Override
    public ASTNode visitNONE(pythonParser.NONEContext ctx) {
        return new NoneNode(ctx.start.getLine());
    }

    @Override
    public ASTNode visitDouble(pythonParser.DoubleContext ctx) {

        double value = Double.parseDouble(ctx.getText());

        return new DoubleNode(value, ctx.start.getLine());
    }

    @Override
    public ASTNode visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public ASTNode visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected ASTNode defaultResult() {
        return null;
    }

    @Override
    protected ASTNode aggregateResult(ASTNode aggregate, ASTNode nextResult) {
        return nextResult;
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, ASTNode currentResult) {
        return true;
    }

    @Override
    public String toString() {
        return "ASTNode";
    }
    public void printsemanticErrors()
    {
        for(String error: semanticErrors)
        {
            System.err.println(error);
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

            if (dictNode.getChildren().isEmpty())
                return new DictType(
                        new PrimitiveType("UNKNOWN"),
                        new PrimitiveType("UNKNOWN")
                );

            KeyValueNode kv = (KeyValueNode) dictNode.getChildren().get(0);

            Type valueType = resolveType(kv.getValue());

            return new DictType(
                    new PrimitiveType("STRING"), // key ALWAYS string
                    valueType
            );
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
}