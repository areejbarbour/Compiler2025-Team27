package ast.paython;

public class ReturnNode extends ASTNode {

    public ReturnNode(int lineNumber) {
        super("Return", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " [line " + lineNumber + "]");
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}