package ast.paython;//package ast.paython;

public class LoopElifNode extends ASTNode {

    private ASTNode condition;
    private ASTNode block;

    public LoopElifNode(ASTNode condition, ASTNode block) {
        super("LoopElif", condition != null ? condition.lineNumber : 0);
        this.condition = condition;
        this.block = block;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "LoopElif [line " + lineNumber + "]");

        System.out.println(indent + "  Condition:");
        condition.print(indent + "    ");

        System.out.println(indent + "  Block:");
        block.print(indent + "    ");
    }
}
