package symbol_table;

import java.util.HashMap;

public class Scope {
    private HashMap<String,SymbolEntry>table=new HashMap<>();
    private Scope parent;
    public Scope(Scope parent)
    {
        this.parent=parent;
    }
    public SymbolEntry insert(String name)
    {
        if(table.containsKey(name))
        {
            return null;
        }
        SymbolEntry entry=new SymbolEntry(name);
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
                    "  " + entry.getName() +
                            " | kind=" + entry.getAttribute("kind")
            );
        }
    }




}
