package ast.web;

public class HtmlElementNode extends HtmlNode {

    public HtmlElementNode(String tagName, int lineNumber) {
        super(tagName, lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.print(indent + "<" + tagName);
        for (AttributeNode attr : attributes) {
            attr.print(" ");
        }
        System.out.println(">");

        for (var child : children) {
            child.print(indent + "  ");
        }
        System.out.println(indent + "</" + tagName + ">");
    }
}