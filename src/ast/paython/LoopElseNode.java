package ast.paython;
public class LoopElseNode extends ASTNode {

    private ASTNode block;

    public LoopElseNode(ASTNode block) {
        super("LoopElse", block != null ? block.lineNumber : 0);
        this.block = block;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "LoopElse [line " + lineNumber + "]");

        block.print(indent + "  ");
    }
}
