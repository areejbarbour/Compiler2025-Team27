package ast.paython;

public class BlockNode extends ASTNode {

    public BlockNode(int lineNumber) {
        super("Block", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
