//package ast.paython;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FunctionCallNode extends ASTNode {
//
//    private ASTNode functionTarget;
//
//    private List<ASTNode> arguments = new ArrayList<>();
//
//    public FunctionCallNode(ASTNode functionTarget, int lineNumber) {
//
//        super("FunctionCall", lineNumber);
//
//        this.functionTarget = functionTarget;
//    }
//
//    public ASTNode getFunctionTarget() {
//        return functionTarget;
//    }
//
//    public List<ASTNode> getArguments() {
//        return arguments;
//    }
//
//    public void addArgument(ASTNode argument) {
//
//        if (argument != null) {
//            arguments.add(argument);
//        }
//    }
//
//    @Override
//    public void print(String indent) {
//
//        System.out.println(indent + "FunctionCall");
//
//        System.out.println(indent + "  Function:");
//
//        if (functionTarget != null) {
//            functionTarget.print(indent + "    ");
//        }
//
//        System.out.println(indent + "  Arguments:");
//
//        for (ASTNode arg : arguments) {
//            arg.print(indent + "    ");
//        }
//    }
//}

package ast.paython;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallNode extends ASTNode {

    private ASTNode functionTarget;

    private List<ASTNode> arguments = new ArrayList<>();

    public FunctionCallNode(int lineNumber) {
        super("FunctionCall", lineNumber);
    }

    public void setFunctionTarget(ASTNode functionTarget) {
        this.functionTarget = functionTarget;
    }

    public ASTNode getFunctionTarget() {
        return functionTarget;
    }

    public List<ASTNode> getArguments() {
        return arguments;
    }

    public void addArgument(ASTNode argument) {
        if (argument != null) {
            this.arguments.add(argument);
        }
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + nodeName + " (FunctionCall)");

        System.out.println(indent + "  Function:");

        if (functionTarget != null) {
            functionTarget.print(indent + "    ");
        } else {
            System.out.println(indent + "    <null>");
        }

        System.out.println(indent + "  Arguments:");

        if (arguments.isEmpty()) {
            System.out.println(indent + "    <none>");
        } else {
            for (ASTNode arg : arguments) {
                if (arg != null) {
                    arg.print(indent + "    ");
                }
            }
        }
    }
}