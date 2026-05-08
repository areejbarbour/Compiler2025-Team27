package visitor;//package visitor;
import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import ast.paython.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class PythonASTBuilderVisitor extends pythonParserBaseVisitor<ASTNode> {

    public SymbolTable symTab = new SymbolTable();

    @Override
    public ASTNode visitProg(pythonParser.ProgContext ctx) {
        ProgramNode program = new ProgramNode(ctx.start.getLine());

        for (pythonParser.StatementContext stmt : ctx.statement()) {
            ASTNode child = visit(stmt);
            if (child != null) {
                program.addChild(child);
            }
        }

        return program;
    }

    @Override
    public ASTNode visitAssignmentStmt(pythonParser.AssignmentStmtContext ctx) {
        int line = ctx.start.getLine();
        String varName = ctx.assignment().ID().getText();

        var entry = symTab.lookup(varName);
        if (entry == null) {
            entry = symTab.insert(varName);
            entry.setAttribute("kind", "variable");
        }

        AssignmentNode node = new AssignmentNode(varName, line);

        ASTNode value = visit(ctx.assignment().expr());
        if (value != null) {
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

        var entry = symTab.lookup(name);

        if (entry != null) {

            System.err.println(
                    "Function already defined: " + name
            );

        } else {

            entry = symTab.insert(name);

            if (entry != null) {
                entry.setAttribute("kind", "function");
            }
        }

        symTab.enterscope();

        DefNode node =
                new DefNode(name, ctx.start.getLine());

        for (int i = 1; i < ctx.defFunction().ID().size(); i++) {

            String param =
                    ctx.defFunction().ID(i).getText();

            var p = symTab.insert(param);

            if (p == null) {

                System.err.println(
                        "Duplicate parameter: " + param
                );

            } else {

                p.setAttribute("kind", "parameter");
            }

            node.addChild(
                    new ParamNode(
                            param,
                            ctx.start.getLine()
                    )
            );
        }

        ASTNode body =
                visit(ctx.defFunction().block());

        if (body != null) {
            node.addChild(body);
        }

        symTab.exitscope();

        return node;
    }

    @Override
    public ASTNode visitDecorate(pythonParser.DecorateContext ctx) {

        String module = ctx.ID(0).getText();
        String func = ctx.ID(1).getText();

        DecorateNode node = new DecorateNode(module, func, ctx.start.getLine());

        if (ctx.args() != null && !ctx.args().isEmpty()) {
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

        symTab.enterscope();

        var entry = symTab.insert(var);

        if (entry != null) {
            entry.setAttribute("kind", "loop-variable");
        }

        ForNode node = new ForNode(var, ctx.start.getLine());

        ASTNode iterable = visit(ctx.for_().expr());

        if (iterable != null) {
            node.addChild(iterable);
        }

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
        if (value == null) {
            System.err.println("Null value in keyword arg: " + name);
        }
        return new KeywordArgNode(name, value);
    }

    @Override
    public ASTNode visitImportStmt(pythonParser.ImportStmtContext ctx) {

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
        IndexAccessNode node = new IndexAccessNode(ctx.start.getLine());
        node.addChild(new VariableNode(ctx.ID().getText(), ctx.start.getLine()));
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
        return new VariableNode(ctx.getText(), ctx.start.getLine());
    }

    @Override
    public ASTNode visitAttributeAccess(pythonParser.AttributeAccessContext ctx) {

        ASTNode target = visit(ctx.expr());

        return new AttributeAccessNode(
                target,
                ctx.ID().getText(),
                ctx.start.getLine()
        );
    }

    @Override
    public ASTNode visitFunctionCall(pythonParser.FunctionCallContext ctx) {

        FunctionCallNode node = new FunctionCallNode(ctx.start.getLine());

        ASTNode function = visit(ctx.expr());
        if (function != null) {
            node.addChild(function);
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
}
