package ast.web;

import java.util.ArrayList;
import java.util.List;

public class CssSelectorListNode extends WebASTNode {

    private List<CssSelectorNode> selectors = new ArrayList<>();

    public CssSelectorListNode(int lineNumber) {

        super("CssSelectorList", lineNumber);
    }

    public void add(CssSelectorNode selector) {

        if (selector != null) {
            selectors.add(selector);
        }
    }

    public List<CssSelectorNode> getSelectors() {
        return selectors;
    }

    @Override
    public void print(String indent) {

        for (int i = 0; i < selectors.size(); i++) {

            selectors.get(i).print("");

            if (i < selectors.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}