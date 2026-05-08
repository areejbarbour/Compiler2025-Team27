package ast.web;

import java.util.ArrayList;
import java.util.List;

public class JinjaForNode extends WebASTNode {

    public List<String> variables = new ArrayList<>();
    public WebASTNode iterable;
    public List<WebASTNode> body = new ArrayList<>();

    public JinjaForNode(String expression, int lineNumber) {
        super("JinjaFor", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " (for)");

        System.out.println(indent + "  vars: " + variables);

        if (iterable != null)
            iterable.print(indent + "  iterable:");

        for (WebASTNode child : body) {
            child.print(indent + "  ");
        }
    }
}