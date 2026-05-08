package ast.web;

public class AttributeNode extends WebASTNode {

    private String name;
    private String value;

    public AttributeNode(String name, String value, int lineNumber) {
        super("Attribute", lineNumber);
        this.name = name;
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + nodeName + " " + name + "=\"" + value + "\"");
    }
}