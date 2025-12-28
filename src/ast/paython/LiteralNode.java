package ast.paython;

public class LiteralNode extends ExprNode {

    private String value;

    public LiteralNode(String type, String value, int lineNumber) {
        super(type, lineNumber);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " = " + value + " [line " + lineNumber + "]"
        );
    }
}
