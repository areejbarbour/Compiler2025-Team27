package ast.web;

public class HtmlVoidNode extends HtmlNode {

    public HtmlVoidNode(String tagName, int lineNumber) {
        super(tagName, lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.print(indent + "<" + tagName);
        for (AttributeNode attr : attributes) {
            attr.print(" ");
        }
        System.out.println(" />");
    }
}