package ast.web;

import java.util.List;


public class HtmlSelfClosingNode extends HtmlNode {

    public HtmlSelfClosingNode(String tagName, int lineNumber) {
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