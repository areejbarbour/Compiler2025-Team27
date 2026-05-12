package symbol_table;

import java.util.HashMap;

public class Scope {
    private HashMap<String,SymbolEntry>table=new HashMap<>();
    private Scope parent;
    private String scopeName;
    public Scope(Scope parent,String scopeName)
    {
        this.parent=parent;
        this.scopeName=scopeName;
    }
    public String getScopeName()
    {
        return scopeName;
    }
    public SymbolEntry insert(String name, SymbolEntry.SymbolKind kind)
    {
        if(table.containsKey(name))
        {
            return null;
        }
        SymbolEntry entry=new SymbolEntry(name,kind);
        table.put(name,entry);
        return entry;
    }
    public SymbolEntry lookup(String name)
    {
        if(table.containsKey(name))
        {
            return  table.get(name);
        }
        if(parent != null)
        {
            return   parent.lookup(name);
        }
        return null;
    }
    public SymbolEntry lookupCurrentScope(String name)
    {
        return table.get(name);
    }
    public Scope getParent()
    {
        return parent;
    }
    public void print() {
        if (table.isEmpty()) {
            System.out.println("Scope is empty");
            return;
        }

        for (SymbolEntry entry : table.values()) {
            System.out.println(
                    "  "
                            + entry.getName()
                            + " | kind="
                            + entry.getKind()

            );
        }
    }




}
