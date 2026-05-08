package ast.paython;

public class ASTPrinter {

    public static void printAST(ASTNode root) {
        if (root == null) {
            System.out.println("AST is empty.");
            return;
        }
        root.print("");
    }
}
