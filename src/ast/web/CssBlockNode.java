package ast.web;

import java.util.ArrayList;
import java.util.List;

public class CssBlockNode extends WebASTNode {
    private List<AttributeNode> attributes = new ArrayList<>();
    private List<WebASTNode> rules = new ArrayList<>();

    public CssBlockNode(int lineNumber) {
        super("CssBlock", lineNumber);
    }

    public void addAttribute(AttributeNode attr) {
        if (attr != null) {
            this.attributes.add(attr);
        }
    }


    public void addRule(WebASTNode rule) {
        if (rule != null) {
            this.rules.add(rule);
        }
    }

    public List<AttributeNode> getAttributes() {
        return attributes;
    }

    public List<WebASTNode> getRules() {
        return rules;
    }

    @Override
    public void print(String indent) {
        System.out.print(indent + "<style");


        for (AttributeNode attr : attributes) {
            attr.print(" ");
        }
        System.out.println(">");

        for (WebASTNode rule : rules) {
            rule.print(indent + "  ");
        }

        System.out.println(indent + "</style>");
    }
}