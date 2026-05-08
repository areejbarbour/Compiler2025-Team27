package ast.paython;//package ast.paython;

public class IfNode extends ASTNode {

    public IfNode(int line) {
        super("If", line);
    }

    public ASTNode getCondition() {
        return children.size() > 0 ? children.get(0) : null;
    }

    public ASTNode getIfBlock() {
        return children.size() > 1 ? children.get(1) : null;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "If [line " + lineNumber + "]");

        System.out.println(indent + "  Condition:");
        getCondition().print(indent + "    ");

        System.out.println(indent + "  If Block:");
        getIfBlock().print(indent + "    ");

        // باقي children = elif + else
        for (int i = 2; i < children.size(); i++) {
            children.get(i).print(indent + "  ");
        }
    }
}
