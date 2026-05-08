package ast.web;

public class JinjaExprNode extends WebASTNode {

    private String expression;

    public JinjaExprNode(String expression, int lineNumber) {
        super("JinjaExpr", lineNumber);
        this.expression = expression;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " {{ " + expression + " }}");
    }
}