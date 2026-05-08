package ast.paython;//package ast.paython;

public class OrConditionNode extends ASTNode {

    private ASTNode left;
    private ASTNode right;

    public OrConditionNode(ASTNode left, ASTNode right) {
        super("Or", left.lineNumber);
        this.left = left;
        this.right = right;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "OR [line " + lineNumber + "]");
        left.print(indent + "  ");
        right.print(indent + "  ");
    }
}

