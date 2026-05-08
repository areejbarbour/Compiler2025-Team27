package ast.web;

import java.util.ArrayList;
import java.util.List;

public class CssDeclarationNode extends WebASTNode {

    private String property;

    private List<CssValueNode> values = new ArrayList<>();

    public CssDeclarationNode(String property, int lineNumber) {

        super("CssDeclaration", lineNumber);

        this.property = property;
    }

    public void addValue(CssValueNode value) {

        if (value != null) {
            this.values.add(value);
        }
    }

    public String getProperty() {
        return property;
    }

    public List<CssValueNode> getValues() {
        return values;
    }


    @Override
    public void print(String indent) {

        System.out.print(indent + property + ": ");

        for (CssValueNode value : values) {

            System.out.print(value.getValue() + " ");
        }

        System.out.println(";");
    }
}