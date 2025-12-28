package ast.web;

public class DocumentNode extends WebASTNode {

    public DocumentNode(int lineNumber) {
        super("Document", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        for (var child : children) {
            child.print(indent + "  ");
        }
    }
}