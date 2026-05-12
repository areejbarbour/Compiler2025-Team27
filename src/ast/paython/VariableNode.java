package ast.paython;
public class VariableNode extends ASTNode {

    private String name;

    public VariableNode(String name, int line) {
        super("Variable", line);
        this.name = name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Var: " + name + " [line " + lineNumber + "]");
    }

    public String getName() {
        return name;
    }
}
