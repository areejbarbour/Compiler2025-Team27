package app;

import antlr.WebTemplateLexer;
import antlr.WebTemplateParser;
import antlr.pythonLexer;
import antlr.pythonParser;
import ast.paython.ASTNode;
import ast.web.WebASTNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import symbol_table.SymbolTable;
import visitor.PythonASTBuilderVisitor;
import visitor.WebASTBuilderVisitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SemanticErrorTestMain {

    private static final String PYTHON_TEST_FILE = "example/semantic_errors_python.py";
    private static final String WEB_TEST_FILE    = "example/semantic_errors_web.jinja";

    private static final String RED   = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String CYAN  = "\u001B[36m";
    private static final String BOLD  = "\u001B[1m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws Exception {
        System.out.println(BOLD + CYAN + "==============================================" + RESET);
        System.out.println(BOLD + CYAN + "   SEMANTIC ERRORS TEST RUNNER" + RESET);
        System.out.println(BOLD + CYAN + "==============================================" + RESET);


        System.out.println("\n" + BOLD + ">>> Analyzing Python file: " + PYTHON_TEST_FILE + RESET);

        List<String> pythonErrors = runPythonSemantic(PYTHON_TEST_FILE);

        System.out.println("\n" + BOLD + "===== PYTHON SEMANTIC ERRORS =====" + RESET);
        if (pythonErrors.isEmpty()) {
            System.out.println(GREEN + "No Python semantic errors found." + RESET);
        } else {
            int i = 1;
            for (String err : pythonErrors) {
                System.out.println(RED + "  [" + i + "] " + err + RESET);
                i++;
            }
            System.out.println(BOLD + "Total Python errors: " + pythonErrors.size() + RESET);
        }


        System.out.println("\n" + BOLD + ">>> Analyzing Web/Jinja file: " + WEB_TEST_FILE + RESET);


        SymbolTable emptySymTab = new SymbolTable();
        emptySymTab.enterscope("global");
        Set<String> emptyFlaskVars = new HashSet<>();

        List<String> webErrors = runWebSemantic(WEB_TEST_FILE, emptySymTab, emptyFlaskVars);

        System.out.println("\n" + BOLD + "===== WEB / JINJA SEMANTIC ERRORS =====" + RESET);
        if (webErrors.isEmpty()) {
            System.out.println(GREEN + "No Web/Jinja semantic errors found." + RESET);
        } else {
            int i = 1;
            for (String err : webErrors) {
                System.out.println(RED + "  [" + i + "] " + err + RESET);
                i++;
            }
            System.out.println(BOLD + "Total Web/Jinja errors: " + webErrors.size() + RESET);
        }


        System.out.println("\n" + BOLD + CYAN + "==============================================" + RESET);
        System.out.println(BOLD + "SUMMARY" + RESET);
        System.out.println("  Python errors : " + pythonErrors.size());
        System.out.println("  Web errors    : " + webErrors.size());
        System.out.println("  Total         : " + (pythonErrors.size() + webErrors.size()));
        System.out.println(BOLD + CYAN + "==============================================" + RESET);
    }


    private static List<String> runPythonSemantic(String filePath) throws Exception {
        CharStream input = CharStreams.fromFileName(filePath);
        pythonLexer lexer = new pythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pythonParser parser = new pythonParser(tokens);
        pythonParser.ProgContext tree = parser.prog();

        if (parser.getNumberOfSyntaxErrors() != 0) {
            System.err.println(RED + "Python syntax errors found (" +
                    parser.getNumberOfSyntaxErrors() + "). Semantic analysis may be incomplete." + RESET);
        } else {
            System.out.println(GREEN + "Python parse: OK" + RESET);
        }

        PythonASTBuilderVisitor visitor = new PythonASTBuilderVisitor();
        ASTNode ast = visitor.visit(tree);

        List<String> errors = visitor.getSemanticErrors();
        if (errors == null) {

            errors = new ArrayList<>();
        }
        return new ArrayList<>(errors);
    }


    private static List<String> runWebSemantic(String filePath,
                                               SymbolTable symTab,
                                               Set<String> flaskVariables) throws Exception {
        CharStream input = CharStreams.fromFileName(filePath);
        WebTemplateLexer lexer = new WebTemplateLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WebTemplateParser parser = new WebTemplateParser(tokens);
        WebTemplateParser.DocumentContext tree = parser.document();

        if (parser.getNumberOfSyntaxErrors() != 0) {
            System.err.println(RED + "Web/Jinja syntax errors found (" +
                    parser.getNumberOfSyntaxErrors() + "). Semantic analysis may be incomplete." + RESET);
        } else {
            System.out.println(GREEN + "Web/Jinja parse: OK" + RESET);
        }

        WebASTBuilderVisitor visitor = new WebASTBuilderVisitor(symTab, flaskVariables);
        WebASTNode ast = visitor.visit(tree);

        List<String> errors = visitor.getSemanticErrors();
        if (errors == null) {
            errors = new ArrayList<>();
        }
        return new ArrayList<>(errors);
    }
}
