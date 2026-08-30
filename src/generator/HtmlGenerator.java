package generator;

import ast.web.*;
import java.util.*;
import ast.paython.ASTNode;

public class HtmlGenerator {

    private final ExpressionEvaluator evaluator = new ExpressionEvaluator();
    private final StringBuilder output = new StringBuilder();
    private Map<String, String> routes = new HashMap<>();


    private static final Map<String, String> SEMANTIC_STYLES = new LinkedHashMap<>();
    static {

        SEMANTIC_STYLES.put("container-box",
                "width: 100%; max-width: 500px; padding: 15px; background: #ffffff;");

        SEMANTIC_STYLES.put("row-layout",
                "display: flex; flex-direction: row; align-items: center; gap: 10px;");

        SEMANTIC_STYLES.put("column-layout",
                "display: flex; flex-direction: column; gap: 12px;");

        SEMANTIC_STYLES.put("scaffold-app",
                "min-height: 100vh; display: flex; flex-direction: column;");

        SEMANTIC_STYLES.put("app-bar",
                "background: #1976d2; color: #ffffff; padding: 12px 20px; font-size: 1.2em;");

        SEMANTIC_STYLES.put("pad-10",
                "padding: 10px; margin: 10px;");

        SEMANTIC_STYLES.put("spacer-h20",
                "height: 20px;");

        SEMANTIC_STYLES.put("ui-card",
                "box-shadow: 0 4px 8px rgba(0,0,0,0.1); border-radius: 8px; padding: 16px; background: #fff;");

        SEMANTIC_STYLES.put("list-tile",
                "display: flex; align-items: center; gap: 12px; padding: 8px 0;");

        SEMANTIC_STYLES.put("container",
                "width: 100%; max-width: 960px; margin: 0 auto; padding: 20px;");
        SEMANTIC_STYLES.put("product-card",
                "box-shadow: 0 4px 8px rgba(0,0,0,0.1); border-radius: 8px; padding: 16px; margin-bottom: 12px; background: #fff;");
        SEMANTIC_STYLES.put("products-list",
                "display: flex; flex-direction: column; gap: 12px;");
        SEMANTIC_STYLES.put("btn",
                "display: inline-block; padding: 8px 16px; border-radius: 4px; text-decoration: none; cursor: pointer;");
        SEMANTIC_STYLES.put("btn-primary",
                "background: #1976d2; color: #fff; border: none;");
        SEMANTIC_STYLES.put("btn-secondary",
                "background: #757575; color: #fff; border: none;");
        SEMANTIC_STYLES.put("btn-danger",
                "background: #d32f2f; color: #fff; border: none;");
        SEMANTIC_STYLES.put("btn-submit",
                "background: #1976d2; color: #fff; border: none; padding: 10px 20px; cursor: pointer;");
        SEMANTIC_STYLES.put("product-form",
                "display: flex; flex-direction: column; gap: 12px; max-width: 400px;");
        SEMANTIC_STYLES.put("price",
                "font-weight: bold; color: #2e7d32;");
    }

    public void setRoutes(Map<String, String> routes) {
        this.routes = routes != null ? routes : new HashMap<>();
    }

    public String generate(WebASTNode root, Map<String, Object> templateData) {
        output.setLength(0);

        Map<String, Object> scope = new HashMap<>();
        if (templateData != null) {
            scope.putAll(templateData);
        }
        evaluator.setScope(scope);
        evaluator.setRoutes(routes);

        if (root != null) {
            render(root);
        }

        return output.toString();
    }


    private void render(WebASTNode node) {
        if (node == null) return;

        if (node instanceof DocumentNode) {
            for (ASTNode child : node.getChildren()) {
                render((WebASTNode) child);
            }
        }
        else if (node instanceof HtmlElementNode el) {
            renderHtmlElement(el);
        }
        else if (node instanceof HtmlSelfClosingNode self) {
            renderSelfClosing(self);
        }
        else if (node instanceof HtmlVoidNode voidNode) {
            renderVoid(voidNode);
        }
        else if (node instanceof TextNode text) {
            String t = text.getText();
            if (t != null) output.append(t);
        }
        else if (node instanceof JinjaExprNode expr) {
            Object value = evaluator.evaluate(expr.getExpr());
            output.append(evaluator.toHtmlString(value));
        }
        else if (node instanceof JinjaForNode forNode) {
            renderFor(forNode);
        }
        else if (node instanceof JinjaIfNode ifNode) {
            renderIf(ifNode);
        }
        else if (node instanceof JinjaSetNode setNode) {
            renderSet(setNode);
        }
        else if (node instanceof JinjaBlockNode block) {
            if (block.children != null) {
                for (WebASTNode child : block.children) {
                    render(child);
                }
            }
        }
        else {
            for (ASTNode child : node.getChildren()) {
                if (child instanceof WebASTNode w) {
                    render(w);
                }
            }
        }
    }


    private void renderHtmlElement(HtmlElementNode el) {

        output.append("<").append(el.getTagName());
        renderAttributes(el);
        output.append(">");

        for (ASTNode child : el.getChildren()) {
            render((WebASTNode) child);
        }

        output.append("</").append(el.getTagName()).append(">");
    }

    private void renderSelfClosing(HtmlSelfClosingNode el) {
        output.append("<").append(el.getTagName());
        renderAttributes(el);
        output.append(" />");
    }

    private void renderVoid(HtmlVoidNode el) {
        output.append("<").append(el.getTagName());
        renderAttributes(el);
        output.append(">");
    }


    private void renderAttributes(HtmlNode el) {
        if (el.getAttributes() == null) return;


        Map<String, String> attrs = new LinkedHashMap<>();
        String classValue = null;
        String dataTarget = null;

        for (AttributeNode attr : el.getAttributes()) {
            String name = attr.getName();
            String value = attr.getValue() != null ? attr.getValue() : "";
            value = resolveInlineExpressions(value);

            if ("class".equalsIgnoreCase(name)) {
                classValue = value;
                attrs.put(name, value);
            } else if ("data-target".equalsIgnoreCase(name)) {
                dataTarget = value;
                attrs.put(name, value);
            } else {
                attrs.put(name, value);
            }
        }


        String injectedStyle = buildSemanticStyle(classValue);
        if (injectedStyle != null && !injectedStyle.isEmpty()) {
            String existing = attrs.getOrDefault("style", "");
            if (!existing.isEmpty() && !existing.trim().endsWith(";")) {
                existing = existing.trim() + "; ";
            }
            attrs.put("style", existing + injectedStyle);
        }


        if (classValue != null && containsClass(classValue, "clickable") && dataTarget != null) {

            if (!attrs.containsKey("onclick")) {
                String href = dataTarget.startsWith("/") || dataTarget.startsWith("http")
                        ? dataTarget
                        : "/" + dataTarget;
                attrs.put("onclick", "window.location.href='" + href + "';");
                attrs.put("style",
                        attrs.getOrDefault("style", "") + " cursor: pointer;");
            }
        }


        for (Map.Entry<String, String> entry : attrs.entrySet()) {
            output.append(" ")
                    .append(entry.getKey())
                    .append("=\"")
                    .append(entry.getValue())
                    .append("\"");
        }
    }


    private String buildSemanticStyle(String classValue) {
        if (classValue == null || classValue.isBlank()) return null;

        StringBuilder style = new StringBuilder();
        for (String cls : classValue.trim().split("\\s+")) {
            String mapped = SEMANTIC_STYLES.get(cls);
            if (mapped != null) {
                style.append(mapped);
                if (!mapped.trim().endsWith(";")) style.append(";");
                style.append(" ");
            }
        }
        return style.length() > 0 ? style.toString().trim() : null;
    }

    private boolean containsClass(String classValue, String target) {
        if (classValue == null) return false;
        for (String cls : classValue.trim().split("\\s+")) {
            if (cls.equals(target)) return true;
        }
        return false;
    }

    private String resolveInlineExpressions(String text) {
        if (text == null || !text.contains("{{")) return text;

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < text.length()) {
            int start = text.indexOf("{{", i);
            if (start == -1) {
                result.append(text.substring(i));
                break;
            }
            result.append(text.substring(i, start));
            int end = text.indexOf("}}", start);
            if (end == -1) {
                result.append(text.substring(start));
                break;
            }
            String expr = text.substring(start + 2, end).trim();
            Object value = evaluator.evaluate(expr);
            result.append(evaluator.toHtmlString(value));
            i = end + 2;
        }
        return result.toString();
    }


    private void renderFor(JinjaForNode forNode) {
        String loopVar = forNode.variables.isEmpty() ? "item" : forNode.variables.get(0);
        Object iterableValue = resolveIterable(forNode);

        if (!(iterableValue instanceof List)) {
            return;
        }

        List<?> list = (List<?>) iterableValue;

        for (Object item : list) {
            evaluator.put(loopVar, item);
            for (WebASTNode child : forNode.body) {
                render(child);
            }
        }
        evaluator.remove(loopVar);
    }

    private Object resolveIterable(JinjaForNode forNode) {
        if (forNode.iterable == null) {
            return null;
        }
        if (forNode.iterable instanceof JinjaExprNode expr) {
            return evaluator.evaluate(expr.getExpr());
        }
        if (forNode.iterable instanceof ValueNode val) {
            return evaluator.evaluate(val.getValue());
        }
        return evaluator.evaluate(forNode.iterable.toString());
    }


    private void renderIf(JinjaIfNode ifNode) {
        boolean conditionMet = false;

        if (ifNode.condition != null) {
            String condExpr = extractExpression(ifNode.condition);
            conditionMet = evaluator.evaluateCondition(condExpr);
        }

        if (conditionMet) {
            for (WebASTNode child : ifNode.body) {
                render(child);
            }
            return;
        }

        for (JinjaIfNode elif : ifNode.elifNodes) {
            String condExpr = extractExpression(elif.condition);
            if (evaluator.evaluateCondition(condExpr)) {
                for (WebASTNode child : elif.body) {
                    render(child);
                }
                return;
            }
        }

        if (ifNode.elseNode != null) {
            for (WebASTNode child : ifNode.elseNode.body) {
                render(child);
            }
        }
    }

    private String extractExpression(WebASTNode node) {
        if (node instanceof JinjaExprNode expr) {
            return expr.getExpr();
        }
        if (node instanceof ValueNode val) {
            return val.getValue();
        }
        return node != null ? node.toString() : "";
    }


    private void renderSet(JinjaSetNode setNode) {
        Object value = null;
        if (setNode.value instanceof JinjaExprNode expr) {
            value = evaluator.evaluate(expr.getExpr());
            if (value == null) {
                value = tryParseLiteral(expr.getExpr());
            }
        } else if (setNode.value != null) {
            value = tryParseLiteral(setNode.value.toString());
        }
        evaluator.put(setNode.name, value);
    }

    private Object tryParseLiteral(String text) {
        if (text == null) return null;
        text = text.trim();
        try {
            if (text.contains(".")) return Double.parseDouble(text);
            return Integer.parseInt(text);
        } catch (NumberFormatException ignored) {}
        if ((text.startsWith("\"") && text.endsWith("\"")) ||
                (text.startsWith("'") && text.endsWith("'"))) {
            return text.substring(1, text.length() - 1);
        }
        return evaluator.evaluate(text);
    }
}
