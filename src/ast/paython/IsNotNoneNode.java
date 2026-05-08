package ast.paython;//package ast.paython;

public class IsNotNoneNode extends ASTNode {

    private ASTNode expr;

    public IsNotNoneNode(ASTNode expr) {
        super("IsNotNone", expr.lineNumber);
        this.expr = expr;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "IsNotNone [line " + lineNumber + "]");

        expr.print(indent + "  ");
    }
}
