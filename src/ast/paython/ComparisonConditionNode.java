package ast.paython;
public class ComparisonConditionNode extends ASTNode {

    private ASTNode left;
    private String operator;
    private ASTNode right;

    public ComparisonConditionNode(ASTNode left, String operator, ASTNode right) {
        super("Comparison", left.lineNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public void print(String indent) {

        System.out.println(
                indent + "Comparison (" + operator + ") [line " + lineNumber + "]"
        );

        left.print(indent + "  ");
        right.print(indent + "  ");
    }
}
