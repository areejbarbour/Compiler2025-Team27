package ast.paython;

public class BreakNode extends ASTNode {

    public BreakNode() {
        super("Break", 0);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Break");
    }
}
