package ast.paython;

public class KeywordArgNode extends ASTNode {

    private String name;

    public KeywordArgNode(String name, ASTNode value) {
        super("KeywordArg", value.lineNumber);
        this.name = name;
        addChild(value);
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " (" + name + ") [line " + lineNumber + "]"
        );

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }
}