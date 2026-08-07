package server;

import antlr.WebTemplateLexer;
import antlr.WebTemplateParser;
import antlr.pythonLexer;
import antlr.pythonParser;
import ast.paython.ASTNode;
import ast.web.WebASTNode;
import generator.Context;
import generator.DataExtractor;
import generator.HtmlGenerator;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import visitor.PythonASTBuilderVisitor;
import visitor.WebASTBuilderVisitor;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * سيرفر Java مضمّن (embedded) — بديل عن سكربت Flask/Python المكتوب يدوياً.
 * <p>
 * هون فعلياً "الجافا هي يلي بتستمع للمتغيرات وبتعمل regeneration":
 * كل طلب add/edit/delete بيوصل لهاد السيرفر، بيعدّل بيانات المنتجات بالذاكرة،
 * وبعدين بينادي HtmlGenerator.generate(...) من جديد (نفس محرك التوليد
 * المستخدم بمرحلة الـ compile-time بـ CompilerMain) لإعادة توليد HTML
 * بحيث يتزامن الخرج مع البيانات مباشرة — بدون أي كود Python وسيط.
 */
public class AppServer {

    private static final int PORT = 8080;
    private static final Path OUTPUT_DIR = Paths.get("output");

    // ==== حالة التشغيل (Runtime state) ====
    private final List<Map<String, Object>> products = Collections.synchronizedList(new ArrayList<>());
    private final Object generationLock = new Object();

    private HtmlGenerator generator;
    private Context context;

    // AST المُحلَّلة مسبقاً لكل قالب Jinja (تُبنى مرة وحدة، وتُعاد استخدامها
    // مع بيانات جديدة كل مرة عند التوليد)
    private WebASTNode indexAst;
    private WebASTNode addProductAst;
    private WebASTNode editProductAst;
    private WebASTNode productDetailsAst;

    public static void main(String[] args) throws Exception {
        AppServer server = new AppServer();
        server.bootstrap();
        server.start();
    }

    /**
     * تحليل app.py (Phase 6: DataExtractor) + تحليل قوالب Jinja مرة واحدة عند الإقلاع.
     */
    private void bootstrap() throws Exception {
        System.out.println("===== [Java] تحليل app.py واستخراج البيانات الأولية =====");

        String pythonFile = "app.py";
        CharStream pythonInput = CharStreams.fromFileName(pythonFile);
        pythonLexer pyLexer = new pythonLexer(pythonInput);
        CommonTokenStream pyTokens = new CommonTokenStream(pyLexer);
        pythonParser pyParser = new pythonParser(pyTokens);
        pythonParser.ProgContext pyTree = pyParser.prog();

        if (pyParser.getNumberOfSyntaxErrors() != 0) {
            throw new RuntimeException("Python syntax errors in " + pythonFile);
        }

        PythonASTBuilderVisitor pythonVisitor = new PythonASTBuilderVisitor();
        ASTNode pythonAST = pythonVisitor.visit(pyTree);

        DataExtractor extractor = new DataExtractor();
        context = extractor.extract(pythonAST);

        // نحمّل قائمة المنتجات الابتدائية بالذاكرة (Runtime state) من الـ Context المستخرج
        Object initialProducts = context.getGlobalVariable("products");
        if (initialProducts instanceof List<?> list) {
            for (Object o : list) {
                if (o instanceof Map<?, ?> m) {
                    Map<String, Object> product = new LinkedHashMap<>();
                    for (var e : m.entrySet()) {
                        product.put(String.valueOf(e.getKey()), e.getValue());
                    }
                    products.add(product);
                }
            }
        }

        generator = new HtmlGenerator();
        generator.setRoutes(context.getAllRoutes());

        indexAst = parseTemplate("templates/index.jinja", pythonVisitor);
        addProductAst = parseTemplate("templates/add_product.jinja", pythonVisitor);
        editProductAst = parseTemplate("templates/edit_product.jinja", pythonVisitor);
        productDetailsAst = parseTemplate("templates/product_details.jinja", pythonVisitor);

        Files.createDirectories(OUTPUT_DIR);

        // أول توليد (Initial regeneration) قبل استقبال أي طلب
        regenerateIndex();

        System.out.println("===== [Java] جاهز — " + products.size() + " منتج محمّل بالذاكرة =====");
    }

    private WebASTNode parseTemplate(String templatePath, PythonASTBuilderVisitor pythonVisitor) throws Exception {
        CharStream input = CharStreams.fromFileName(templatePath);
        WebTemplateLexer lexer = new WebTemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WebTemplateParser parser = new WebTemplateParser(tokens);
        WebTemplateParser.DocumentContext tree = parser.document();

        if (parser.getNumberOfSyntaxErrors() != 0) {
            throw new RuntimeException("Jinja syntax errors in " + templatePath);
        }

        WebASTBuilderVisitor visitor = new WebASTBuilderVisitor(
                pythonVisitor.symTab,
                PythonASTBuilderVisitor.getFlaskVariables()
        );
        return visitor.visit(tree);
    }

    private void start() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
        server.createContext("/", new RouterHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("===== [Java] السيرفر شغال على http://localhost:" + PORT + " =====");
    }

    // ==================== التوليد (Regeneration) ====================
    // هاي هي النقطة المركزية: كل تعديل على products بينادي هاد المسار،
    // وهو يعيد تشغيل HtmlGenerator.generate() فعلياً (نفس محرك مرحلة التوليد).
    private String regenerateIndex() {
        synchronized (generationLock) {
            Map<String, Object> data = new HashMap<>();
            data.put("products_list", new ArrayList<>(products));
            data.put("title", "قائمة المنتجات");
            String html = generator.generate(indexAst, data);
            writeToOutput("index.html", html);
            System.out.println("[Java][regeneration] index.html أعيد توليده — عدد المنتجات: " + products.size());
            return html;
        }
    }

    private String renderAddProductForm() {
        synchronized (generationLock) {
            return generator.generate(addProductAst, new HashMap<>());
        }
    }

    private String renderEditProductForm(Map<String, Object> product) {
        synchronized (generationLock) {
            Map<String, Object> data = new HashMap<>();
            data.put("product", product);
            return generator.generate(editProductAst, data);
        }
    }

    private String renderProductDetails(Map<String, Object> product) {
        synchronized (generationLock) {
            Map<String, Object> data = new HashMap<>();
            data.put("product", product);
            return generator.generate(productDetailsAst, data);
        }
    }

    private void writeToOutput(String fileName, String content) {
        try {
            Files.writeString(OUTPUT_DIR.resolve(fileName), content, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("تعذّرت كتابة " + fileName + ": " + e.getMessage());
        }
    }

    private Map<String, Object> findProduct(String name) {
        synchronized (products) {
            for (Map<String, Object> p : products) {
                if (Objects.equals(String.valueOf(p.get("name")), name)) {
                    return p;
                }
            }
        }
        return null;
    }

    // ==================== الراوتر (Router) ====================
    private class RouterHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                String method = exchange.getRequestMethod();
                String path = exchange.getRequestURI().getPath();

                if (path.equals("/") || path.equals("/products")) {
                    respondHtml(exchange, regenerateIndex());
                } else if (path.equals("/style.css")) {
                    respondFile(exchange, Paths.get("static/style.css"), "text/css");
                } else if (path.equals("/script.js")) {
                    respondFile(exchange, Paths.get("static/script.js"), "application/javascript");
                } else if (path.equals("/add_product")) {
                    handleAddProduct(exchange, method);
                } else if (path.startsWith("/products/")) {
                    String name = URLDecoder.decode(path.substring("/products/".length()), StandardCharsets.UTF_8);
                    respondHtml(exchange, renderProductDetails(findProduct(name)));
                } else if (path.startsWith("/edit_product/")) {
                    String name = URLDecoder.decode(path.substring("/edit_product/".length()), StandardCharsets.UTF_8);
                    handleEditProduct(exchange, method, name);
                } else if (path.startsWith("/delete_product/")) {
                    String name = URLDecoder.decode(path.substring("/delete_product/".length()), StandardCharsets.UTF_8);
                    Map<String, Object> found = findProduct(name);
                    if (found != null) products.remove(found);
                    regenerateIndex();
                    redirect(exchange, "/products");
                } else {
                    respondText(exchange, 404, "Not found");
                }
            } catch (Exception e) {
                e.printStackTrace();
                respondText(exchange, 500, "Server error: " + e.getMessage());
            }
        }

        private void handleAddProduct(HttpExchange exchange, String method) throws IOException {
            if ("POST".equalsIgnoreCase(method)) {
                Map<String, String> form = parseForm(exchange);
                Map<String, Object> newProduct = new LinkedHashMap<>();
                newProduct.put("name", form.get("name"));
                newProduct.put("price", form.get("price"));
                newProduct.put("details", form.get("details"));
                newProduct.put("image", form.get("image"));
                products.add(newProduct);
                regenerateIndex(); // <-- الجافا بتستمع للتغيير وبتعيد التوليد فوراً
                redirect(exchange, "/products");
            } else {
                respondHtml(exchange, renderAddProductForm());
            }
        }

        private void handleEditProduct(HttpExchange exchange, String method, String name) throws IOException {
            Map<String, Object> found = findProduct(name);
            if ("POST".equalsIgnoreCase(method)) {
                Map<String, String> form = parseForm(exchange);
                Map<String, Object> updated = new LinkedHashMap<>();
                updated.put("name", form.get("name"));
                updated.put("price", form.get("price"));
                updated.put("details", form.get("details"));
                updated.put("image", form.get("image"));
                if (found != null) products.remove(found);
                products.add(updated);
                regenerateIndex(); // <-- نفس الشي هون: تعديل → تستمع الجافا → تعيد التوليد
                redirect(exchange, "/products");
            } else {
                respondHtml(exchange, renderEditProductForm(found));
            }
        }

        private Map<String, String> parseForm(HttpExchange exchange) throws IOException {
            String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            Map<String, String> result = new LinkedHashMap<>();
            for (String pair : body.split("&")) {
                if (pair.isBlank()) continue;
                String[] kv = pair.split("=", 2);
                String key = URLDecoder.decode(kv[0], StandardCharsets.UTF_8);
                String value = kv.length > 1 ? URLDecoder.decode(kv[1], StandardCharsets.UTF_8) : "";
                result.put(key, value);
            }
            return result;
        }

        private void respondHtml(HttpExchange exchange, String html) throws IOException {
            byte[] bytes = html.getBytes(StandardCharsets.UTF_8);
            exchange.getResponseHeaders().set("Content-Type", "text/html; charset=utf-8");
            exchange.sendResponseHeaders(200, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }

        private void respondText(HttpExchange exchange, int code, String text) throws IOException {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(code, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }

        private void respondFile(HttpExchange exchange, Path file, String contentType) throws IOException {
            if (!Files.exists(file)) {
                respondText(exchange, 404, "Not found");
                return;
            }
            byte[] bytes = Files.readAllBytes(file);
            exchange.getResponseHeaders().set("Content-Type", contentType);
            exchange.sendResponseHeaders(200, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }

        private void redirect(HttpExchange exchange, String location) throws IOException {
            exchange.getResponseHeaders().set("Location", location);
            exchange.sendResponseHeaders(302, -1);
            exchange.close();
        }
    }
}