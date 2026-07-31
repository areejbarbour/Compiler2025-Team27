package generator;

import ast.paython.ASTNode;
import ast.web.WebASTNode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

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

    // ==================== AST كـ JSON بسيط ====================
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

    private String astToJson(ASTNode node, int indent) {
        if (node == null) return "null";

        String pad = "  ".repeat(indent);
        String padInner = "  ".repeat(indent + 1);

        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append(padInner).append("\"node\": \"").append(escape(nodeName(node))).append("\",\n");
        sb.append(padInner).append("\"line\": ").append(getLine(node)).append(",\n");
        sb.append(padInner).append("\"children\": [");

        List<ASTNode> children = node.getChildren();
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
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private void log(String message) {
        generationLog.append(message).append("\n");
        System.out.println("[OutputWriter] " + message);
    }
}