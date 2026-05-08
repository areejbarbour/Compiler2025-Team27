package ast.paython;
public class ParamNode extends ASTNode {

    private String name;

    public ParamNode(String name, int lineNumber) {
        super("Param", lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Param: " + name);
    }
}
