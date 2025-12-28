package ast.paython;

public class ProgramNode extends ASTNode {

    public ProgramNode(int lineNumber) {
        super("Program", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
