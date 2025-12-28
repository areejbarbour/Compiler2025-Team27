package ast.paython;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {

    protected String nodeName;
    protected int lineNumber;
    protected List<ASTNode> children;

    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        if (child != null)
            children.add(child);
    }

    public abstract void print(String indent);
}
