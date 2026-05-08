package ast.paython;

public class AssignmentNode extends ASTNode {

    private String variableName;

    public AssignmentNode(String variableName, int lineNumber) {
        super("Assignment", lineNumber);
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "Assignment:");
        System.out.println(indent + "  Variable: " + variableName);

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}
//public class AssignmentNode extends ASTNode {
//
//    private String name;
//
//    public AssignmentNode(String name, int line) {
//        super(line);
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}