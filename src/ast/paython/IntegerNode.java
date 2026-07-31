package ast.paython;
public class IntegerNode extends ASTNode {

    private int value;

    public IntegerNode(int value, int line) {
        super("Integer", line);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Integer: " + value + " [line " + lineNumber + "]");
    }

    public int getValue() {
        return value;
    }
}
