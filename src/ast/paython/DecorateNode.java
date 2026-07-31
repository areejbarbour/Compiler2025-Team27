package ast.paython;

public class DecorateNode extends ASTNode {

    private String moduleName;
    private String functionName;

    public DecorateNode(String moduleName, String functionName, int lineNumber) {
        super("Decorator", lineNumber);
        this.moduleName = moduleName;
        this.functionName = functionName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getFunctionName() {
        return functionName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Decorator: " + moduleName + "." + functionName);
        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}