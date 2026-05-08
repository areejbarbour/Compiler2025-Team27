package ast.web;

public class HtmlCloseNode extends WebASTNode {
    private String tagName;

    public HtmlCloseNode(String tagName, int lineNumber) {
        super("HtmlClose", lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "</" + tagName + ">");
    }
}