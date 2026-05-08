package ast.paython;//package ast.paython;

public class DefNode extends ASTNode {

    private String name;

    public DefNode(String name, int lineNumber) {
        super("Function", lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Function: " + name);

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
