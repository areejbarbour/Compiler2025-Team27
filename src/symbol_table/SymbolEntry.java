package symbol_table;

import java.util.HashMap;
import java.util.Objects;

public class SymbolEntry {

    public enum SymbolKind {
        CLASS,
        MODULE,
        VARIABLE,
        FUNCTION,
        PARAMETER,
        ROUTE,
        TEMPLATE_VARIABLE,
        LOOP_VARIABLE,
        BLOCK,
        OBJECT,
        HTML_TAG

    }
    private  String name;
    private SymbolKind kind;
    private Type type;
    private HashMap<String, Object>attributes;
    public  SymbolEntry(String name,SymbolKind kind)
    {
        this.name=name;
        this.kind=kind;
        this.type = null;
        this.attributes = new HashMap<>();
    }
    public  SymbolKind getKind()
    {
        return kind;
    }

    public String getName()
    {
        return  name;
    }

    public void setAttribute(String name,Object value)
    {
        attributes.put(name,value);
    }
    public Object getAttribute(String key) {
        return attributes.get(key);
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
