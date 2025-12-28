package ast.web;

public class HtmlSelfClosingNode extends WebASTNode {

    private String tagName;

    public HtmlSelfClosingNode(String tagName, int lineNumber) {
        super("HtmlSelfClosing", lineNumber);
        this.tagName = tagName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " <" + tagName + " />");
    }
}