package ast.paython;

public class AssignmentNode extends ASTNode {

    private String variableName;

    public AssignmentNode(String variableName, int lineNumber) {
        super("Assignment", lineNumber);
        this.variableName = variableName;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " (" + variableName + ") [line " + lineNumber + "]"
        );
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
