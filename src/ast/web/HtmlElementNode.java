package ast.web;

public class HtmlElementNode extends WebASTNode {

    private String tagName;

    public HtmlElementNode(String tagName, int lineNumber) {
        super("HtmlElement", lineNumber);
        this.tagName = tagName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " <" + tagName + ">");
        for (var child : children) {
            child.print(indent + "  ");
        }
    }
}