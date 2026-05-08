package ast.paython;
public class IndexAccessNode extends ASTNode {

    public IndexAccessNode(int line) {
        super("IndexAccess", line);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "IndexAccess [line " + lineNumber + "]");
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
