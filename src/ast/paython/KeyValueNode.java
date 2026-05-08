package ast.paython;//package ast.paython;

public class KeyValueNode extends ASTNode {

    public KeyValueNode(int lineNumber) {
        super("KeyValue", lineNumber);
    }

    public ASTNode getKey() {
        return children.get(0);
    }

    public ASTNode getValue() {
        return children.get(1);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "KeyValue");

        System.out.println(indent + "  Key:");
        getKey().print(indent + "    ");

        System.out.println(indent + "  Value:");
        getValue().print(indent + "    ");
    }
}

