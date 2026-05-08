package ast.paython;
public class ExprStmtNode extends ASTNode {

    public ExprStmtNode(int lineNumber) {
        super("ExprStmt", lineNumber);
    }

    public ASTNode getExpr() {
        return children.isEmpty() ? null : children.get(0);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ExprStmt");

        ASTNode expr = getExpr();
        if (expr != null) {
            expr.print(indent + "  ");
        }
    }
}
