package ast.paython;//package ast.paython;

public class ForNode extends ASTNode {

    private String variable;

    public ForNode(String variable, int line) {
        super("For", line);
        this.variable = variable;
    }

    public ASTNode getIterable() {
        return children.size() > 0 ? children.get(0) : null;
    }

    public ASTNode getBlock() {
        return children.size() > 1 ? children.get(1) : null;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "For (" + variable + ") [line " + lineNumber + "]");

        System.out.println(indent + "  Iterable:");
        getIterable().print(indent + "    ");

        System.out.println(indent + "  Block:");
        getBlock().print(indent + "    ");
    }
}

