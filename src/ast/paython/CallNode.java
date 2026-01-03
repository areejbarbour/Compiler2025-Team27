package ast.paython;

public class CallNode extends ExprNode {
    private String objectName;   // optional
    private String functionName;

    public CallNode(String objectName, String functionName, int lineNumber) {
        super("Call", lineNumber);
        this.objectName = objectName;
        this.functionName = functionName;
    }

    @Override
    public void print(String indent) {
        if (objectName != null) {
            System.out.println(
                    indent + nodeName + " (" + objectName + "." + functionName + ") [line " + lineNumber + "]"
            );
        } else {
            System.out.println(
                    indent + nodeName + " (" + functionName + ") [line " + lineNumber + "]"
            );
        }

        for (ASTNode arg : children) {
            arg.print(indent + "  ");
        }
    }
}
