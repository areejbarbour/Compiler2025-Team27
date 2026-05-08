package ast.web;

public class ValueNode extends WebASTNode {
    private String value;

    public ValueNode(String value, int lineNumber) {
        super("Value", lineNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        System.out.print(value);
    }
}