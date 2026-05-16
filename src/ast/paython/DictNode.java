package ast.paython;//package ast.paython;

import java.util.List;

public class DictNode extends ASTNode {

    public DictNode(int lineNumber) {
        super("Dict", lineNumber);
    }

    public List<ASTNode> getEntries() {
        return children;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Dict");

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }

}