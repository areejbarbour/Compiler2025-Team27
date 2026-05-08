package ast.web;

public class JinjaTextNode extends WebASTNode {

    private String text;

    public JinjaTextNode(String text, int lineNumber) {
        super("JinjaText", lineNumber);
        this.text = text;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + text);
    }
}