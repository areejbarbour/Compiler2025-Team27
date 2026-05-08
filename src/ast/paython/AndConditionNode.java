package ast.paython;//package ast.paython;

public class AndConditionNode extends ASTNode {

    private ASTNode left;
    private ASTNode right;

    public AndConditionNode(ASTNode left, ASTNode right) {
        super("And", left.lineNumber);
        this.left = left;
        this.right = right;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "AND [line " + lineNumber + "]");
        left.print(indent + "  ");
        right.print(indent + "  ");
    }
}

//public class AndConditionNode extends ASTNode {
//    public AndConditionNode(ASTNode l, ASTNode r) {
//        super(l.getLine());
//        addChild(l);
//        addChild(r);
//    }
//}