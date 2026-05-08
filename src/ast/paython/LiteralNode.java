package ast.paython;//package ast.paython;

public class LiteralNode extends ASTNode {

    private String type;
    private Object value;

    public LiteralNode(String type, Object value, int lineNumber) {
        super("Literal", lineNumber);
        this.type = type;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Literal(" + type + "): " + value);
    }
}

