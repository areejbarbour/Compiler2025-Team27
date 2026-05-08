package ast.web;

public class CssSelectorNode extends WebASTNode {
    private String value;

    public CssSelectorNode(String value, int lineNumber) {
        super("CssSelector", lineNumber);
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