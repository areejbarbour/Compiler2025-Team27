package ast.web;

import java.util.ArrayList;
import java.util.List;

public class JinjaIfNode extends WebASTNode {

    public WebASTNode condition;

    public List<WebASTNode> body = new ArrayList<>();

    public List<JinjaIfNode> elifNodes = new ArrayList<>();

    public JinjaIfNode elseNode;

    public JinjaIfNode(WebASTNode condition, int lineNumber) {

        super("JinjaIf", lineNumber);

        this.condition = condition;
    }

    @Override
    public void print(String indent) {
        if (condition != null) {

            System.out.println(indent + "If");

            System.out.println(indent + "  Condition:");

            condition.print(indent + "    ");

        } else {

            System.out.println(indent + "Else");
        }
        System.out.println(indent + "  Body:");

        for (WebASTNode child : body) {

            child.print(indent + "    ");
        }
        for (JinjaIfNode elifNode : elifNodes) {

            System.out.println(indent + "  Elif:");

            elifNode.print(indent + "    ");
        }
        if (elseNode != null) {

            System.out.println(indent + "  Else:");

            elseNode.print(indent + "    ");
        }
    }
}