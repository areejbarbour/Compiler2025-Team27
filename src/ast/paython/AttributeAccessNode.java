package ast.paython;

public class AttributeAccessNode extends ASTNode {

    private ASTNode target;

    private String attribute;

    public AttributeAccessNode(
            ASTNode target,
            String attribute,
            int lineNumber
    ) {

        super("AttributeAccess", lineNumber);

        this.target = target;
        this.attribute = attribute;
    }

    public ASTNode getTarget() {
        return target;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "AttributeAccess");

        System.out.println(indent + "  Target:");

        if (target != null) {
            target.print(indent + "    ");
        }

        System.out.println(indent + "  Attribute: " + attribute);
    }
}