package ast.web;

public class WebASTPrinter {

    public static void printAST(WebASTNode root) {
        if (root == null) {
            System.out.println("Web AST is empty.");
            return;
        }
        root.print("");
    }
}