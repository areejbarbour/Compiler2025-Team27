package ast.paython;

public class BooleanNode extends ASTNode {

    private boolean value;

    public BooleanNode(boolean value, int line) {
        super("Boolean", line);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Boolean: " + value + " [line " + lineNumber + "]");
    }
}
