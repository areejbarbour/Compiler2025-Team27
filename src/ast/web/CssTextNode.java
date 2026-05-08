package ast.web;

public class CssTextNode extends WebASTNode {

    private final String text;

    public CssTextNode(String text, int lineNumber) {
        super("CssText", lineNumber);
        this.text = text;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " : " + text);
    }
}