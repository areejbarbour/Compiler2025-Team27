package generator;

import ast.paython.*;
import java.util.*;

public class DataExtractor {

    private Context context = new Context();

    public Context extract(ASTNode root) {
        if (root == null) return context;


        collectAssignments(root);


        collectRenderTemplateCalls(root);


        collectRoutes(root);

        return context;
    }


    private void collectRoutes(ASTNode node) {
        List<ASTNode> children = node.getChildren();

        for (int i = 0; i < children.size(); i++) {
            ASTNode child = children.get(i);

            if (child instanceof DecorateNode dec
                    && "app".equals(dec.getModuleName())
                    && "route".equals(dec.getFunctionName())) {

                String path = extractRoutePath(dec);


                int j = i + 1;
                while (j < children.size() && children.get(j) instanceof DecorateNode) {
                    j++;
                }

                if (path != null && j < children.size()
                        && children.get(j) instanceof DefNode def) {
                    context.addRoute(def.getName(), path);
                }
            }


            collectRoutes(child);
        }
    }

    private String extractRoutePath(DecorateNode dec) {
        for (ASTNode arg : dec.getChildren()) {
            Object value = evaluate(arg);
            if (value instanceof String s) {
                return s;
            }
        }
        return null;
    }

    public Context getContext() {
        return context;
    }


    private void collectAssignments(ASTNode node) {
        if (node instanceof AssignmentNode assignment) {
            String varName = assignment.getVariableName();
            if (!assignment.getChildren().isEmpty()) {
                Object value = evaluate(assignment.getChildren().get(0));
                context.setGlobalVariable(varName, value);
            }
        }


        for (ASTNode child : node.getChildren()) {
            collectAssignments(child);
        }
    }


    private void collectRenderTemplateCalls(ASTNode node) {
        if (node instanceof FunctionCallNode call) {
            ASTNode target = call.getFunctionTarget();


            if (target instanceof VariableNode var && "render_template".equals(var.getName())) {
                processRenderTemplate(call);
            }
        }


        for (ASTNode child : node.getChildren()) {
            collectRenderTemplateCalls(child);
        }

        if (node instanceof FunctionCallNode call) {
            for (ASTNode arg : call.getArguments()) {
                collectRenderTemplateCalls(arg);
            }
            if (call.getFunctionTarget() != null) {
                collectRenderTemplateCalls(call.getFunctionTarget());
            }
        }
    }

    private void processRenderTemplate(FunctionCallNode call) {
        String templateName = null;
        Map<String, Object> kwargs = new LinkedHashMap<>();

        for (ASTNode arg : call.getArguments()) {

            if (!(arg instanceof KeywordArgNode) && templateName == null) {
                Object val = evaluate(arg);
                if (val instanceof String) {
                    templateName = (String) val;
                }
            }

            else if (arg instanceof KeywordArgNode kw) {
                Object value = evaluate(kw.getChildren().isEmpty() ? null : kw.getChildren().get(0));


                if (value instanceof String && context.getGlobalVariable((String) value) != null) {

                } else if (kw.getChildren().get(0) instanceof VariableNode varNode) {

                    value = context.getGlobalVariable(varNode.getName());
                }

                kwargs.put(kw.getName(), value);
            }
        }

        if (templateName != null) {
            for (var entry : kwargs.entrySet()) {
                context.addTemplateData(templateName, entry.getKey(), entry.getValue());
            }
        }
    }


    private Object evaluate(ASTNode node) {
        if (node == null) return null;

        if (node instanceof IntegerNode n) {
            return n.getValue();
        }
        if (node instanceof DoubleNode n) {
            return n.getValue();
        }
        if (node instanceof StringNode n) {
            return n.getValue();
        }
        if (node instanceof BooleanNode n) {
            return n.getValue();
        }
        if (node instanceof NoneNode) {
            return null;
        }
        if (node instanceof LiteralNode n) {
            return n.getValue();
        }
        if (node instanceof VariableNode n) {

            Object global = context.getGlobalVariable(n.getName());
            return global != null ? global : n.getName();
        }
        if (node instanceof ListNode) {
            List<Object> list = new ArrayList<>();
            for (ASTNode child : node.getChildren()) {
                list.add(evaluate(child));
            }
            return list;
        }
        if (node instanceof DictNode) {
            Map<String, Object> map = new LinkedHashMap<>();
            for (ASTNode child : node.getChildren()) {
                if (child instanceof KeyValueNode kv) {
                    Object key = evaluate(kv.getKey());
                    Object value = evaluate(kv.getValue());
                    if (key != null) {
                        map.put(key.toString(), value);
                    }
                }
            }
            return map;
        }
        if (node instanceof KeywordArgNode kw) {
            if (!kw.getChildren().isEmpty()) {
                return evaluate(kw.getChildren().get(0));
            }
        }


        if (!node.getChildren().isEmpty()) {
            return evaluate(node.getChildren().get(0));
        }

        return null;
    }
}