package ast.web;

public class CssBlockNode extends WebASTNode {

    public CssBlockNode(int lineNumber) {
        super("CssBlock", lineNumber);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName);
        for (var child : children) {
            child.print(indent + "  ");
        }
    }
}