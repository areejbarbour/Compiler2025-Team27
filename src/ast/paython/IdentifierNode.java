package ast.paython;

public class IdentifierNode extends ExprNode {

    private String name;

    public IdentifierNode(String name, int lineNumber) {
        super("Identifier", lineNumber);
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " (" + name + ") [line " + lineNumber + "]"
        );
    }
}
