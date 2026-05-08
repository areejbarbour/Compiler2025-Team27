package ast.paython;

import java.util.List;
import java.util.List;

public class ImportNode extends ASTNode {

    private String moduleName;
    private List<String> imports;

    public ImportNode(String moduleName, List<String> imports) {
        super("Import", 0);
        this.moduleName = moduleName;
        this.imports = imports;
    }

    @Override
    public void print(String indent) {
        System.out.println(
                indent + nodeName + " from " + moduleName
        );

        for (String imp : imports) {
            System.out.println(indent + "  import " + imp);
        }
    }
}
