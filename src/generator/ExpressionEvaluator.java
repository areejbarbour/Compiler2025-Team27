package generator;

import java.util.*;

public class ExpressionEvaluator {

    // الـ scope الحالي (متغيرات الـ for + set + بيانات الـ template)
    private Map<String, Object> scope = new HashMap<>();

    // جدول الراوتات (endpoint -> مسار) المستخرج من @app.route(...) بكود Python
    // مطلوب لحل استدعاءات url_for('endpoint', key=value, ...)
    private Map<String, String> routes = new HashMap<>();

    public void setScope(Map<String, Object> scope) {
        this.scope = scope != null ? scope : new HashMap<>();
    }

    public void setRoutes(Map<String, String> routes) {
        this.routes = routes != null ? routes : new HashMap<>();
    }

    public void put(String name, Object value) {
        scope.put(name, value);
    }

    public void remove(String name) {
        scope.remove(name);
    }

    public Map<String, Object> getScope() {
        return scope;
    }

    /**
     * يقيّم تعبير بسيط مثل:
     *   product
     *   product.name
     *   product.price
     */
    public Object evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            return null;
        }

        expression = expression.trim();

        // دعم استدعاء url_for('endpoint', key=value, ...) لتوليد الروابط
        if (expression.startsWith("url_for(") && expression.endsWith(")")) {
            return evaluateUrlFor(expression);
        }

        // إزالة أقواس بسيطة إن وجدت: total()
        if (expression.endsWith("()") && !expression.contains(".")) {
            expression = expression.substring(0, expression.length() - 2);
        }

        // تقسيم حسب النقطة: product.name → ["product", "name"]
        String[] parts = expression.split("\\.");

        Object current = scope.get(parts[0]);

        // إذا ما لقينا بالمتغيرات المحلية، نرجع null
        if (current == null) {
            return null;
        }

        // نمشي على باقي الأجزاء (product.name.price ...)
        for (int i = 1; i < parts.length; i++) {
            if (current instanceof Map) {
                current = ((Map<?, ?>) current).get(parts[i]);
            } else {
                return null;
            }
        }

        return current;
    }

    /**
     * يقيّم شرط بسيط (لـ {% if %})
     * يدعم حالياً: وجود القيمة / مقارنات بسيطة لاحقاً
     */
    public boolean evaluateCondition(String expression) {
        Object value = evaluate(expression);
        if (value == null) return false;
        if (value instanceof Boolean) return (Boolean) value;
        if (value instanceof Number) return ((Number) value).doubleValue() != 0;
        if (value instanceof String) return !((String) value).isEmpty();
        if (value instanceof Collection) return !((Collection<?>) value).isEmpty();
        return true;
    }

    /**
     * يحوّل أي قيمة إلى نص للطباعة في HTML
     */
    public String toHtmlString(Object value) {
        if (value == null) return "";
        return value.toString();
    }

    // ==================== دعم url_for(...) ====================

    /**
     * يحل استدعاء مثل:
     *   url_for('static', filename='style.css')
     *   url_for('product_details', product_name=product.name)
     * اعتمادًا على جدول الراوتات المستخرج من @app.route(...) بكود Python.
     */
    private Object evaluateUrlFor(String expression) {
        String inner = expression.substring("url_for(".length(), expression.length() - 1);
        List<String> args = splitArgs(inner);
        if (args.isEmpty()) return "";

        String endpoint = stripQuotes(args.get(0).trim());

        Map<String, String> kwargs = new LinkedHashMap<>();
        for (int i = 1; i < args.size(); i++) {
            String arg = args.get(i).trim();
            int eq = arg.indexOf('=');
            if (eq <= 0) continue;
            String key = arg.substring(0, eq).trim();
            String valueExpr = arg.substring(eq + 1).trim();
            Object value = resolveArgValue(valueExpr);
            kwargs.put(key, value != null ? value.toString() : "");
        }

        // ملف ثابت (static/style.css) → بيرجع مسار نسبي لأن الملفات المولدة
        // وملفات الدعم (style.css) بتنكتب بنفس مجلد الخرج
        if ("static".equals(endpoint)) {
            return kwargs.getOrDefault("filename", "");
        }

        String pattern = routes.get(endpoint);
        if (pattern == null) {
            // endpoint مش معروف بجدول الراوتات، ما منقدر نبني رابط له
            return "#";
        }

        String url = pattern;
        for (var entry : kwargs.entrySet()) {
            url = url.replace("<" + entry.getKey() + ">", entry.getValue());
        }
        return url;
    }

    private Object resolveArgValue(String valueExpr) {
        String v = valueExpr.trim();
        if ((v.startsWith("'") && v.endsWith("'")) || (v.startsWith("\"") && v.endsWith("\""))) {
            return stripQuotes(v);
        }
        // متغير أو تعبير نقطي متل product.name → نستخدم نفس منطق evaluate العادي
        return evaluate(v);
    }

    private String stripQuotes(String s) {
        if (s.length() >= 2 &&
                ((s.startsWith("'") && s.endsWith("'")) || (s.startsWith("\"") && s.endsWith("\"")))) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    /**
     * يقسّم محتوى بين قوسين حسب الفواصل بمستوى القوس الأول فقط،
     * مع تجاهل الفواصل الموجودة جوا نصوص أو أقواس متداخلة.
     */
    private List<String> splitArgs(String s) {
        List<String> result = new ArrayList<>();
        int depth = 0;
        boolean inQuote = false;
        char quoteChar = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (inQuote) {
                current.append(c);
                if (c == quoteChar) inQuote = false;
                continue;
            }
            if (c == '\'' || c == '"') {
                inQuote = true;
                quoteChar = c;
                current.append(c);
                continue;
            }
            if (c == '(' || c == '[') depth++;
            if (c == ')' || c == ']') depth--;

            if (c == ',' && depth == 0) {
                result.add(current.toString());
                current.setLength(0);
                continue;
            }
            current.append(c);
        }
        if (current.length() > 0) result.add(current.toString());
        return result;
    }
}