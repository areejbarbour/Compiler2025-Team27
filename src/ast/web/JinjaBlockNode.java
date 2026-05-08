package ast.web;

import java.util.List;

public class JinjaBlockNode extends WebASTNode {

    public List<WebASTNode> children;

    public JinjaBlockNode(List<WebASTNode> children) {
        super("JinjaBlock", 0);
        this.children = children;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);

        for (WebASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}