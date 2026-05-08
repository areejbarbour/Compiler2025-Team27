package ast.paython;//package ast.paython;

public class DoubleNode extends ASTNode {

    private double value;

    public DoubleNode(double value, int line) {
        super("Double", line);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Double: " + value + " [line " + lineNumber + "]");
    }
}

