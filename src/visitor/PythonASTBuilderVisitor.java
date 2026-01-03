package visitor;

import ast.paython.*;

import antlr.pythonParser;
import antlr.pythonParserBaseVisitor;

import symbol_table.SymbolEntry;
import symbol_table.SymbolTable;


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

        SymbolEntry entry = symTab.lookup(varName);
        if (entry == null) {
            entry = symTab.insert(varName);
            entry.setAttribute("kind", "variable");
        }

        AssignmentNode node = new AssignmentNode(varName, line);
        ASTNode value = visit(ctx.assignment().expr());
        node.addChild(value);
        return node;
    }

    @Override
    public ASTNode visitBlock(pythonParser.BlockContext ctx) {
        symTab.enterscope();

        BlockNode block = new BlockNode(ctx.start.getLine());
        for (pythonParser.StatementContext stmt : ctx.statement()) {
            ASTNode child = visit(stmt);
            if (child != null) {
                block.addChild(child);
            }
        }

        symTab.exitscope();

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
        String name = ctx.ID().getText();
        int line = ctx.start.getLine();

        SymbolEntry entry = symTab.lookup(name);

        if (entry == null) {
            System.err.println(
                    "Semantic Error: variable '" + name +
                            "' is not defined before use (line " + line + ")"
            );
        }

        return new IdentifierNode(name, line);

//        return new IdentifierNode(
//                ctx.ID().getText(),
//                ctx.start.getLine()
//        );
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
        symTab.enterscope();

        symTab.insert(var).setAttribute("kind", "loop-variable");
        ForNode node = new ForNode(var, ctx.start.getLine());

        node.addChild(visit(ctx.for_().expr()));
        node.addChild(visit(ctx.for_().loopBlock()));
        symTab.exitscope();
        return node;
    }

    @Override
    public ASTNode visitDefStmt(pythonParser.DefStmtContext ctx) {
        String name = ctx.defFunction().ID(0).getText();

        SymbolEntry entry = symTab.lookup(name);
        if (entry != null)
        {
            System.err.println("Error: symbol '" + name + "' function already defined"+ "' (line " + ctx.start.getLine() + ")");
        }
        if (entry == null) {
            entry = symTab.insert(name);
            entry.setAttribute("kind", "function");
        }
        symTab.enterscope();
        for (int i = 1; i < ctx.defFunction().ID().size(); i++) {
            String paramName = ctx.defFunction().ID(i).getText();
            SymbolEntry param = symTab.insert(paramName);
            if (param == null) {
                System.err.println(
                        "Semantic Error: duplicate parameter '" +
                                paramName + "' (line " + ctx.start.getLine() + ")"
                );
                continue;
            }
            param.setAttribute("kind", "parameter");
        }

        DefNode node = new DefNode(name, ctx.start.getLine());
        node.addChild(visit(ctx.defFunction().block()));

        symTab.exitscope();

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
    public ASTNode visitCallFunclabel(pythonParser.CallFunclabelContext ctx) {

        String objectName = null;
        String functionName;

        if (ctx.callFunc().DOT() != null) {
            objectName = ctx.callFunc().ID(0).getText();
            functionName = ctx.callFunc().ID(1).getText();

            if (symTab.lookup(objectName) == null) {
                System.err.println(
                        "Semantic Error: object '" + objectName +
                                "' not defined (line " + ctx.start.getLine() + ")"
                );
            }

        } else {
            functionName = ctx.callFunc().ID(0).getText();
        }

        SymbolEntry funcEntry = symTab.lookup(functionName);
        if (funcEntry == null || !"function".equals(funcEntry.getAttribute("kind")))
        {
            System.err.println(
                    "Semantic Error: function '" + functionName +
                            "' not defined (line " + ctx.start.getLine() + ")"
            );
        }

        CallNode node = new CallNode(
                objectName,
                functionName,
                ctx.start.getLine()
        );

        if (ctx.callFunc().args() != null) {
            for (pythonParser.ArgsContext argCtx : ctx.callFunc().args()) {
                node.addChild(visit(argCtx));
            }
        }

        return node;
    }

}
