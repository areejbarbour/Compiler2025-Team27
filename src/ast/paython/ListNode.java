package ast.paython;//package ast.paython;//package ast.paython;

import java.util.List;

public class ListNode extends ASTNode {

    public ListNode(int line) {
        super("List", line);
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "List [line " + lineNumber + "]");

        for (ASTNode child : children) {
            child.print(indent + "  ");
        }
    }


}

