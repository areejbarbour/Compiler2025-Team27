package ast.web;

public class JinjaIfNode extends WebASTNode {

    private String condition;

    public JinjaIfNode(String condition, int lineNumber) {
        super("JinjaIf", lineNumber);
        this.condition = condition;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " (" + condition + ")");
        for (var child : children) {
            child.print(indent + "  ");
        }
    }
}