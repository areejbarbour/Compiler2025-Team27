package ast.paython;
public class NoneNode extends ASTNode {

    public NoneNode(int line) {
        super("None", line);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "None [line " + lineNumber + "]");
    }
}
