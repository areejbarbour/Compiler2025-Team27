package ast.web;

public class JinjaForNode extends WebASTNode {

    private String expression;

    public JinjaForNode(String expression, int lineNumber) {
        super("JinjaFor", lineNumber);
        this.expression = expression;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " (" + expression + ")");
        for (var child : children) {
            child.print(indent + "  ");
        }
    }
}