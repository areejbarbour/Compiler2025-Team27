package ast.web;

import java.util.ArrayList;
import java.util.List;

public class CssRuleNode extends WebASTNode {

    private String selector;

    private List<CssDeclarationNode> declarations = new ArrayList<>();

    public CssRuleNode(String selector, int lineNumber) {

        super("CssRule", lineNumber);

        this.selector = selector;
    }

    public void addDeclaration(CssDeclarationNode declaration) {

        if (declaration != null) {
            declarations.add(declaration);
        }
    }

    public String getSelector() {
        return selector;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + selector + " {");

        for (CssDeclarationNode dec : declarations) {

            dec.print(indent + "  ");
        }

        System.out.println(indent + "}");
    }
}