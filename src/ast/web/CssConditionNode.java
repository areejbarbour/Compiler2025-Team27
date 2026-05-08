package ast.web;

import java.util.ArrayList;
import java.util.List;

public class CssConditionNode extends WebASTNode {
    private String conditionText;
    private List<WebASTNode> rules = new ArrayList<>();

    public CssConditionNode(String conditionText, int lineNumber) {
        super("CssCondition", lineNumber);
        this.conditionText = conditionText;
    }

    public void addRule(WebASTNode rule) {
        if (rule != null) {
            this.rules.add(rule);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Condition: " + conditionText + " {");
        for (WebASTNode rule : rules) {
            rule.print(indent + "  ");
        }
        System.out.println(indent + "}");
    }
}