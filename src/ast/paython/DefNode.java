package ast.paython;

public class DefNode extends ASTNode {

    private String functionName;

    public DefNode(String functionName, int lineNumber) {
        super("Def", lineNumber);
        this.functionName = functionName;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " (" + functionName + ") [line " + lineNumber + "]"
        );
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
