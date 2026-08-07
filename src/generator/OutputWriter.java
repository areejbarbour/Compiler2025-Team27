package generator;

import ast.paython.*;
import ast.web.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * كاتب ملفات الخرج (HTML المولَّد + تقارير التحليل + AST كـ JSON احترافي).
 * الإصدار المحسّن: يطبع القيم الحقيقية داخل عقد الـ AST (Literals, Names, Expressions...).
 */
public class OutputWriter {

    private final Path outputDir;
    private final Path compilerOutputDir;
    private final StringBuilder generationLog = new StringBuilder();

    public OutputWriter() {
        this.outputDir = Paths.get("output");
        this.compilerOutputDir = Paths.get("compiler_output");
    }

    public void prepareDirectories() throws IOException {
        Files.createDirectories(outputDir);
        Files.createDirectories(compilerOutputDir);
        log("Created directories: output/ and compiler_output/");
    }

    // ==================== كتابة HTML مولّد ====================
    public void writeGeneratedHtml(String fileName, String htmlContent) throws IOException {
        Path file = outputDir.resolve(fileName);
        Files.writeString(file, htmlContent, StandardCharsets.UTF_8);
        log("Generated: output/" + fileName + " (" + htmlContent.length() + " chars)");
    }

    // ==================== نسخ الملفات الداعمة ====================
    public void copySupportFile(String sourcePath, String destName) throws IOException {
        Path source = Paths.get(sourcePath);
        if (!Files.exists(source)) {
            log("SKIP (not found): " + sourcePath);
            return;
        }
        Path dest = outputDir.resolve(destName);
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        log("Copied: " + sourcePath + " → output/" + destName);
    }

    /**
     * يكتب app.py قابل للتشغيل داخل output/
     * يعرض ملفات HTML المولَّدة بشكل نظامي على المتصفح (طلب المعيدة).
     */
    public void writeRunnableApp() throws IOException {
        copySupportFile("output_app_source.py", "app.py");
        log("Copied runnable CRUD app: output_app_source.py -> output/app.py");
    }

    // ==================== تقارير التحليل ====================
    public void writeSemanticReport(List<String> pythonErrors, List<String> webErrors) throws IOException {
        StringBuilder report = new StringBuilder();
        report.append("===== SEMANTIC ANALYSIS REPORT =====\n\n");

        report.append("--- Python Semantic Errors ---\n");
        if (pythonErrors == null || pythonErrors.isEmpty()) {
            report.append("No errors found.\n");
        } else {
            for (String e : pythonErrors) {
                report.append(e).append("\n");
            }
        }

        report.append("\n--- Web/Jinja Semantic Errors ---\n");
        if (webErrors == null || webErrors.isEmpty()) {
            report.append("No errors found.\n");
        } else {
            for (String e : webErrors) {
                report.append(e).append("\n");
            }
        }

        Path file = compilerOutputDir.resolve("semantic_report.txt");
        Files.writeString(file, report.toString(), StandardCharsets.UTF_8);
        log("Written: compiler_output/semantic_report.txt");
    }

    public void writeGenerationLog() throws IOException {
        Path file = compilerOutputDir.resolve("generation_log.txt");
        Files.writeString(file, generationLog.toString(), StandardCharsets.UTF_8);
        log("Written: compiler_output/generation_log.txt");
    }

    // ==================== AST كـ JSON احترافي (مع القيم) ====================
    public void writePythonAstJson(ASTNode root) throws IOException {
        String json = astToJson(root, 0);
        Path file = compilerOutputDir.resolve("ast_python.json");
        Files.writeString(file, json, StandardCharsets.UTF_8);
        log("Written: compiler_output/ast_python.json");
    }

    public void writeJinjaAstJson(WebASTNode root) throws IOException {
        String json = astToJson(root, 0);
        Path file = compilerOutputDir.resolve("ast_jinja.json");
        Files.writeString(file, json, StandardCharsets.UTF_8);
        log("Written: compiler_output/ast_jinja.json");
    }

    /**
     * تحويل عقدة AST إلى JSON غني بالقيم (value / name / expression / tag...).
     * يتعامل مع عقد Python و Jinja/Web معاً لأن WebASTNode يمتد من ASTNode.
     */
    private String astToJson(ASTNode node, int indent) {
        if (node == null) return "null";

        String pad = "  ".repeat(indent);
        String padInner = "  ".repeat(indent + 1);

        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append(padInner).append("\"node\": \"").append(escape(nodeName(node))).append("\",\n");
        sb.append(padInner).append("\"line\": ").append(getLine(node));

        // ---- خصائص إضافية حسب نوع العقدة ----
        appendExtraProps(sb, node, padInner);

        // ---- الأبناء (children + الحقول الخاصة مثل body / iterable) ----
        List<ASTNode> children = collectAllChildren(node);

        sb.append(",\n").append(padInner).append("\"children\": [");
        if (children != null && !children.isEmpty()) {
            sb.append("\n");
            for (int i = 0; i < children.size(); i++) {
                sb.append(padInner).append("  ");
                sb.append(astToJson(children.get(i), indent + 2));
                if (i < children.size() - 1) sb.append(",");
                sb.append("\n");
            }
            sb.append(padInner);
        }
        sb.append("]\n");
        sb.append(pad).append("}");
        return sb.toString();
    }

    /** يجمع children العادي + الحقول الخاصة التي لا تُضاف تلقائياً لـ children */
    private List<ASTNode> collectAllChildren(ASTNode node) {
        List<ASTNode> result = new ArrayList<>();

        // children الأساسي (مع تجاهل Text الفارغة)
        if (node.getChildren() != null) {
            for (ASTNode c : node.getChildren()) {
                if (c != null && isMeaningfulNode(c)) result.add(c);
            }
        }

        // حقول خاصة لـ Jinja
        if (node instanceof JinjaForNode forNode) {
            if (forNode.iterable != null && isMeaningfulNode(forNode.iterable) && !result.contains(forNode.iterable)) {
                result.add(forNode.iterable);
            }
            if (forNode.body != null) {
                for (WebASTNode b : forNode.body) {
                    if (b != null && isMeaningfulNode(b) && !result.contains(b)) result.add(b);
                }
            }
        } else if (node instanceof JinjaIfNode ifNode) {
            if (ifNode.condition != null && isMeaningfulNode(ifNode.condition) && !result.contains(ifNode.condition)) {
                result.add(ifNode.condition);
            }
            if (ifNode.body != null) {
                for (WebASTNode b : ifNode.body) {
                    if (b != null && isMeaningfulNode(b) && !result.contains(b)) result.add(b);
                }
            }
            if (ifNode.elifNodes != null) {
                for (JinjaIfNode e : ifNode.elifNodes) {
                    if (e != null && isMeaningfulNode(e) && !result.contains(e)) result.add(e);
                }
            }
            if (ifNode.elseNode != null && isMeaningfulNode(ifNode.elseNode) && !result.contains(ifNode.elseNode)) {
                result.add(ifNode.elseNode);
            }
        } else if (node instanceof JinjaSetNode setNode) {
            if (setNode.value != null && isMeaningfulNode(setNode.value) && !result.contains(setNode.value)) {
                result.add(setNode.value);
            }
        } else if (node instanceof HtmlNode htmlNode) {
            // السمات كعقد أبناء منطقية
            if (htmlNode.getAttributes() != null) {
                for (AttributeNode attr : htmlNode.getAttributes()) {
                    if (attr != null && isMeaningfulNode(attr) && !result.contains(attr)) result.add(attr);
                }
            }
        } else if (node instanceof FunctionCallNode call) {
            if (call.getFunctionTarget() != null && isMeaningfulNode(call.getFunctionTarget()) && !result.contains(call.getFunctionTarget())) {
                result.add(call.getFunctionTarget());
            }
            if (call.getArguments() != null) {
                for (ASTNode arg : call.getArguments()) {
                    if (arg != null && isMeaningfulNode(arg) && !result.contains(arg)) result.add(arg);
                }
            }
        }

        return result;
    }

    /**
     * يتجاهل عقد Text / JinjaText التي تحتوي فقط مسافات أو أسطر جديدة.
     * هذا ينظّف الـ AST JSON من الضوضاء ويبقيه احترافياً وقابلاً للقراءة.
     */
    private boolean isMeaningfulNode(ASTNode node) {
        if (node == null) return false;

        if (node instanceof TextNode t) {
            String txt = t.getText();
            return txt != null && !txt.trim().isEmpty();
        }
        if (node instanceof JinjaTextNode jt) {
            try {
                java.lang.reflect.Field f = findField(JinjaTextNode.class, "text");
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(jt);
                    if (val == null) return false;
                    return !val.toString().trim().isEmpty();
                }
            } catch (Exception ignored) {}
            return true;
        }
        return true;
    }

    /** يضيف الحقول المهمة (value, name, expression, tag...) حسب نوع العقدة */
    private void appendExtraProps(StringBuilder sb, ASTNode node, String padInner) {
        // ---- Python nodes ----
        if (node instanceof StringNode s) {
            prop(sb, padInner, "value", s.getValue());
        } else if (node instanceof IntegerNode i) {
            propNum(sb, padInner, "value", i.getValue());
        } else if (node instanceof DoubleNode d) {
            propNum(sb, padInner, "value", d.getValue());
        } else if (node instanceof BooleanNode b) {
            propBool(sb, padInner, "value", b.getValue());
        } else if (node instanceof LiteralNode lit) {
            prop(sb, padInner, "value", lit.getValue() != null ? lit.getValue().toString() : null);
        } else if (node instanceof VariableNode v) {
            prop(sb, padInner, "name", v.getName());
        } else if (node instanceof IdentifierNode id) {
            prop(sb, padInner, "name", id.getName());
        } else if (node instanceof AssignmentNode a) {
            prop(sb, padInner, "variable", a.getVariableName());
        } else if (node instanceof DefNode def) {
            prop(sb, padInner, "name", def.getName());
        } else if (node instanceof ParamNode p) {
            prop(sb, padInner, "name", p.getName());
        } else if (node instanceof DecorateNode dec) {
            prop(sb, padInner, "module", dec.getModuleName());
            prop(sb, padInner, "function", dec.getFunctionName());
        } else if (node instanceof ForNode forN) {
            try {
                java.lang.reflect.Field f = findField(ForNode.class, "variable");
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(forN);
                    if (val != null) prop(sb, padInner, "variable", val.toString());
                }
            } catch (Exception ignored) {}
        } else if (node instanceof KeywordArgNode kw) {
            prop(sb, padInner, "name", kw.getName());
        } else if (node instanceof CallNode call) {
            try {
                java.lang.reflect.Field of = findField(CallNode.class, "objectName");
                java.lang.reflect.Field ff = findField(CallNode.class, "functionName");
                if (of != null) {
                    of.setAccessible(true);
                    Object ov = of.get(call);
                    if (ov != null) prop(sb, padInner, "object", ov.toString());
                }
                if (ff != null) {
                    ff.setAccessible(true);
                    Object fv = ff.get(call);
                    if (fv != null) prop(sb, padInner, "function", fv.toString());
                }
            } catch (Exception ignored) {}
        }

        // ---- Web / Jinja nodes ----
        else if (node instanceof TextNode t) {
            String txt = t.getText();
            if (txt != null && !txt.trim().isEmpty()) {
                prop(sb, padInner, "text", txt);
            }
        } else if (node instanceof JinjaTextNode jt) {
            try {
                java.lang.reflect.Field f = findField(JinjaTextNode.class, "text");
                if (f != null) {
                    f.setAccessible(true);
                    Object val = f.get(jt);
                    if (val != null) prop(sb, padInner, "text", val.toString());
                }
            } catch (Exception ignored) {}
        } else if (node instanceof JinjaExprNode je) {
            prop(sb, padInner, "expression", je.getExpr());
        } else if (node instanceof JinjaForNode jf) {
            if (jf.variables != null && !jf.variables.isEmpty()) {
                sb.append(",\n").append(padInner).append("\"variables\": [");
                for (int i = 0; i < jf.variables.size(); i++) {
                    if (i > 0) sb.append(", ");
                    sb.append("\"").append(escape(jf.variables.get(i))).append("\"");
                }
                sb.append("]");
            }
        } else if (node instanceof JinjaSetNode js) {
            prop(sb, padInner, "name", js.name);
        } else if (node instanceof HtmlNode hn) {
            prop(sb, padInner, "tag", hn.getTagName());
        } else if (node instanceof AttributeNode attr) {
            prop(sb, padInner, "name", attr.getName());
            prop(sb, padInner, "value", attr.getValue());
        }
    }

    private void prop(StringBuilder sb, String padInner, String key, String value) {
        if (value == null) return;
        sb.append(",\n").append(padInner)
                .append("\"").append(key).append("\": \"")
                .append(escape(value)).append("\"");
    }

    private void propNum(StringBuilder sb, String padInner, String key, Number value) {
        if (value == null) return;
        sb.append(",\n").append(padInner)
                .append("\"").append(key).append("\": ").append(value);
    }

    private void propBool(StringBuilder sb, String padInner, String key, boolean value) {
        sb.append(",\n").append(padInner)
                .append("\"").append(key).append("\": ").append(value);
    }

    private String nodeName(ASTNode node) {
        try {
            java.lang.reflect.Field f = findField(node.getClass(), "nodeName");
            if (f != null) {
                f.setAccessible(true);
                Object val = f.get(node);
                if (val != null) return val.toString();
            }
        } catch (Exception ignored) {}
        return node.getClass().getSimpleName();
    }

    private int getLine(ASTNode node) {
        try {
            java.lang.reflect.Field f = findField(node.getClass(), "lineNumber");
            if (f != null) {
                f.setAccessible(true);
                Object val = f.get(node);
                if (val instanceof Integer) return (Integer) val;
            }
        } catch (Exception ignored) {}
        return 0;
    }

    private java.lang.reflect.Field findField(Class<?> clazz, String name) {
        while (clazz != null) {
            try {
                return clazz.getDeclaredField(name);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }

    private String escape(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    private void log(String message) {
        generationLog.append(message).append("\n");
        System.out.println("[OutputWriter] " + message);
    }
}
