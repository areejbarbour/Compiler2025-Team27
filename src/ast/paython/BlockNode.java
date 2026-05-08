package ast.paython;//
import java.util.List;

public class BlockNode extends ASTNode {

    public BlockNode(int lineNumber) {
        super("Block", lineNumber);
    }

    public BlockNode(List<ASTNode> statements, int lineNumber) {
        super("Block", lineNumber);
        for (ASTNode stmt : statements) {
            if (stmt != null) {
                addChild(stmt);
            }
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}

