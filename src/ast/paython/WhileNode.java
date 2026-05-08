package ast.paython;
public class WhileNode extends ASTNode {

    public WhileNode(int lineNumber) {
        super("While", lineNumber);
    }

    public ASTNode getCondition() {
        return children.size() > 0 ? children.get(0) : null;
    }

    public ASTNode getBody() {
        return children.size() > 1 ? children.get(1) : null;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "While [line " + lineNumber + "]");

        System.out.println(indent + "  Condition:");
        getCondition().print(indent + "    ");

        System.out.println(indent + "  Body:");
        getBody().print(indent + "    ");
    }
}
