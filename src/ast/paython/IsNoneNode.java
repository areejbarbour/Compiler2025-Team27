package ast.paython;//package ast.paython;

public class IsNoneNode extends ASTNode {

    private ASTNode expr;

    public IsNoneNode(ASTNode expr) {
        super("IsNone", expr.lineNumber);
        this.expr = expr;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "IsNone [line " + lineNumber + "]");
        expr.print(indent + "  ");
    }
}
