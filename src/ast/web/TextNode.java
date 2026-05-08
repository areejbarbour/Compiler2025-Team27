package ast.web;

public class TextNode extends WebASTNode {

    private String text;

    public TextNode(String text, int lineNumber) {
        super("Text", lineNumber);
        this.text = text;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " : \"" + text + "\"");
    }

}