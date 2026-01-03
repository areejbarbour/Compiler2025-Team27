package ast.paython;

public class WhileNode extends ASTNode{
    public WhileNode(int lineNumber) {
        super("While", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " [line " + lineNumber + "]");
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
