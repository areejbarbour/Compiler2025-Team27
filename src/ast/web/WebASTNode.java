package ast.web;

import ast.paython.ASTNode;

public abstract class WebASTNode extends ASTNode {

    public WebASTNode(String nodeName, int lineNumber) {
        super(nodeName, lineNumber);
    }
}