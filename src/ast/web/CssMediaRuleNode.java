package ast.web;

import java.util.ArrayList;
import java.util.List;

public class CssMediaRuleNode extends WebASTNode {
    private String query;
    private List<WebASTNode> rules = new ArrayList<>();

    public CssMediaRuleNode(String query, int lineNumber) {
        super("CssMedia", lineNumber);
        this.query = query;
    }

    public void addRule(WebASTNode rule) {
        if (rule != null) {
            this.rules.add(rule);
        }
    }

    public String getQuery() {
        return query;
    }

    public List<WebASTNode> getRules() {
        return rules;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "@media " + query + " {");
        for (WebASTNode rule : rules) {
            rule.print(indent + "  ");
        }
        System.out.println(indent + "}");
    }
}