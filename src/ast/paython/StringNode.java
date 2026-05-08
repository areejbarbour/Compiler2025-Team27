package ast.paython;//package ast.paython;

public class StringNode extends ASTNode {

    private String value;

    public StringNode(String value, int line) {
        super("String", line);
        this.value = value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "String: \"" + value + "\" [line " + lineNumber + "]");
    }
}

