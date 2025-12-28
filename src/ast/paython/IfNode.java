package ast.paython;

public class IfNode extends ASTNode {

    public IfNode(int lineNumber) {
        super("If", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " [line " + lineNumber + "]");
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
