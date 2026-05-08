package ast.web;

public class CssValueNode extends WebASTNode {
    private String value;

    public CssValueNode(String value, int lineNumber) {
        super("CssValue", lineNumber);
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