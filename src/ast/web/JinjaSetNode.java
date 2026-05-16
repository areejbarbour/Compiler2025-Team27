package ast.web;

public class JinjaSetNode extends WebASTNode {

    public String name;
    public WebASTNode value;

    public JinjaSetNode(String name, WebASTNode value, int lineNumber) {
        super("JinjaSet", lineNumber);
        this.name = name;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " (set " + name + ")");

        if (value != null) {
            value.print(indent + "  ");
        }
    }

    public WebASTNode getValue() {
        return value;
    }
}