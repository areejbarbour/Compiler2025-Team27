package ast.paython;//package ast.paython;

public class ElseNode extends ASTNode {

    public ElseNode(int line) {
        super("Else", line);
    }

    public ASTNode getBlock() {
        return children.get(0);
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "Else:");

        getBlock().print(indent + "  ");
    }
}
