package generator;

import ast.paython.*;
import java.util.*;

public class DataExtractor {

    private Context context = new Context();

    public Context extract(ASTNode root) {
        if (root == null) return context;

        // 1. أولاً: نستخرج كل التعريفات (assignments) على المستوى العام
        collectAssignments(root);

        // 2. ثانياً: نبحث عن استدعاءات render_template
        collectRenderTemplateCalls(root);

        // 3. ثالثاً: نبني جدول الراوتات (endpoint -> مسار) من @app.route(...)
        collectRoutes(root);

        return context;
    }

    // ==================== جمع الراوتات (لأجل url_for) ====================
    // نمشي على أبناء الشجرة على المستوى الأعلى بالترتيب؛ أي DecorateNode
    // بيمثل @app.route(...) لازم يكون متبوع مباشرة بـ DefNode لنفس الدالة
    // (بالضبط متل ما بتكتب Flask: الديكوريتور فوق تعريف الدالة مباشرة).
    private void collectRoutes(ASTNode node) {
        List<ASTNode> children = node.getChildren();

        for (int i = 0; i < children.size(); i++) {
            ASTNode child = children.get(i);

            if (child instanceof DecorateNode dec
                    && "app".equals(dec.getModuleName())
                    && "route".equals(dec.getFunctionName())) {

                String path = extractRoutePath(dec);

                // قد يكون هناك أكثر من ديكوريتور مكدّس فوق نفس الدالة
                // (مثال: @app.route("/") و @app.route("/products") قبل نفس def)
                // لذلك نتخطى أي DecorateNode إضافي حتى نصل لأول DefNode
                int j = i + 1;
                while (j < children.size() && children.get(j) instanceof DecorateNode) {
                    j++;
                }

                if (path != null && j < children.size()
                        && children.get(j) instanceof DefNode def) {
                    context.addRoute(def.getName(), path);
                }
            }

            // نكمل البحث بالعمق (لأجل أي decorators جوا نطاقات متداخلة مستقبلاً)
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

    // ==================== جمع التعريفات ====================
    private void collectAssignments(ASTNode node) {
        if (node instanceof AssignmentNode assignment) {
            String varName = assignment.getVariableName();
            if (!assignment.getChildren().isEmpty()) {
                Object value = evaluate(assignment.getChildren().get(0));
                context.setGlobalVariable(varName, value);
            }
        }

        // نكمل البحث في الأبناء
        for (ASTNode child : node.getChildren()) {
            collectAssignments(child);
        }
    }

    // ==================== جمع استدعاءات render_template ====================
    private void collectRenderTemplateCalls(ASTNode node) {
        if (node instanceof FunctionCallNode call) {
            ASTNode target = call.getFunctionTarget();

            // هل هذا استدعاء render_template؟
            if (target instanceof VariableNode var && "render_template".equals(var.getName())) {
                processRenderTemplate(call);
            }
        }

        // نكمل البحث في الأبناء + الـ arguments
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
            // الوسيط الأول عادة اسم القالب (نص)
            if (!(arg instanceof KeywordArgNode) && templateName == null) {
                Object val = evaluate(arg);
                if (val instanceof String) {
                    templateName = (String) val;
                }
            }
            // الـ keyword arguments
            else if (arg instanceof KeywordArgNode kw) {
                Object value = evaluate(kw.getChildren().isEmpty() ? null : kw.getChildren().get(0));

                // إذا القيمة متغير، نجيب قيمته من الـ global
                if (value instanceof String && context.getGlobalVariable((String) value) != null) {
                    // حالة نادرة
                } else if (kw.getChildren().get(0) instanceof VariableNode varNode) {
                    // products_list = products  ← نجيب قيمة products
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

    // ==================== تقييم عقدة AST إلى قيمة Java ====================
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
            // نرجع اسم المتغير، واللي يستدعيه يجيب القيمة من الـ context
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

        // حالة عامة: نجرب الأبناء
        if (!node.getChildren().isEmpty()) {
            return evaluate(node.getChildren().get(0));
        }

        return null;
    }
}