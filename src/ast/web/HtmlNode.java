package ast.web;

import java.util.ArrayList;
import java.util.List;

public abstract class HtmlNode extends WebASTNode {
    protected String tagName;
    protected List<AttributeNode> attributes = new ArrayList<>();

    public HtmlNode(String tagName, int lineNumber) {
        super("Html", lineNumber);
        this.tagName = tagName;
    }

    public void addAttribute(AttributeNode attr) {
        if (attr != null) {
            this.attributes.add(attr);
        }
    }

    public String getTagName() {
        return tagName;
    }


    public List<AttributeNode> getAttributes() {
        return attributes;
    }


}