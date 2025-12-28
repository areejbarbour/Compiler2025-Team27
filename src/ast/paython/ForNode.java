package ast.paython;

public class ForNode extends ASTNode {

    private String iterator;

    public ForNode(String iterator, int lineNumber) {
        super("For", lineNumber);
        this.iterator = iterator;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " (" + iterator + ") [line " + lineNumber + "]"
        );
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
