package ast.paython;

public class ElifNode extends ASTNode {

    public ElifNode(int line) {
        super("Elif", line);
    }

    public ASTNode getCondition() {
        return children.get(0);
    }

    public ASTNode getBlock() {
        return children.get(1);
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "Elif:");

        System.out.println(indent + "  Condition:");
        getCondition().print(indent + "    ");

        System.out.println(indent + "  Block:");
        getBlock().print(indent + "    ");
    }
}
