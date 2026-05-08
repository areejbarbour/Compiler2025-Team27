package ast.paython;//package ast.paython;

import java.util.List;

public class LoopIfNode extends ASTNode {

    private ASTNode condition;
    private ASTNode ifBlock;
    private List<ASTNode> elifNodes;
    private ASTNode elseNode;

    public LoopIfNode(ASTNode condition,
                      ASTNode ifBlock,
                      List<ASTNode> elifNodes,
                      ASTNode elseNode) {

        super("LoopIf", condition != null ? condition.lineNumber : 0);

        this.condition = condition;
        this.ifBlock = ifBlock;
        this.elifNodes = elifNodes;
        this.elseNode = elseNode;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "LoopIf [line " + lineNumber + "]");

        System.out.println(indent + "  Condition:");

        if (condition != null) {
            condition.print(indent + "    ");
        }

        System.out.println(indent + "  If Block:");
        ifBlock.print(indent + "    ");

        for (ASTNode elif : elifNodes) {
            elif.print(indent + "  ");
        }

        if (elseNode != null) {
            elseNode.print(indent + "  ");
        }
    }
}

