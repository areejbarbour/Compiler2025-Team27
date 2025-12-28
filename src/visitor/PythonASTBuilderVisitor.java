package visitor;
import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;
import ast.paython.*;

public class PythonASTBuilderVisitor extends pythonParserBaseVisitor<ASTNode> {

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

        AssignmentNode node = new AssignmentNode(varName, line);
        ASTNode value = visit(ctx.assignment().expr());
        node.addChild(value);
        return node;
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
    public ASTNode visitInteger(pythonParser.IntegerContext ctx) {
        return new LiteralNode(
                "INT",
                ctx.INT().getText(),
                ctx.start.getLine()
        );
    }

    @Override
    public ASTNode visitString(pythonParser.StringContext ctx) {
        return new LiteralNode(
                "STRING",
                ctx.STRING().getText(),
                ctx.start.getLine()
        );
    }

    @Override
    public ASTNode visitBool(pythonParser.BoolContext ctx) {
        return new LiteralNode(
                "BOOL",
                ctx.getText(),
                ctx.start.getLine()
        );
    }

    @Override
    public ASTNode visitNONE(pythonParser.NONEContext ctx) {
        return new LiteralNode(
                "NONE",
                "None",
                ctx.start.getLine()
        );
    }

    @Override
    public ASTNode visitID(pythonParser.IDContext ctx) {
        return new IdentifierNode(
                ctx.ID().getText(),
                ctx.start.getLine()
        );
    }

    @Override
    public ASTNode visitIfStmt(pythonParser.IfStmtContext ctx) {
        IfNode node = new IfNode(ctx.start.getLine());

        node.addChild(visit(ctx.if_().condition()));
        node.addChild(visit(ctx.if_().block()));

        return node;
    }

    @Override
    public ASTNode visitForStmt(pythonParser.ForStmtContext ctx) {
        String var = ctx.for_().ID().getText();
        ForNode node = new ForNode(var, ctx.start.getLine());

        node.addChild(visit(ctx.for_().expr()));
        node.addChild(visit(ctx.for_().loopBlock()));

        return node;
    }

    @Override
    public ASTNode visitDefStmt(pythonParser.DefStmtContext ctx) {
        String name = ctx.defFunction().ID(0).getText();
        DefNode node = new DefNode(name, ctx.start.getLine());

        node.addChild(visit(ctx.defFunction().block()));

        return node;
    }

}
