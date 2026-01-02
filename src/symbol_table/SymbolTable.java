package symbol_table;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {
    private Stack<Scope>scopes=new Stack<>();;
    private List<Scope> allScopes = new ArrayList<>();

    public SymbolTable()
    {
        enterscope();
    }

    public void free()
    {
        scopes.clear();
    }
    public void enterscope()
    {
        Scope parent = scopes.isEmpty() ? null : scopes.peek();
        Scope newScope=new Scope(parent);
        scopes.push(newScope);
        allScopes.add(newScope);

    }
    public void exitscope()
    {
        if(!scopes.isEmpty())
        {
            scopes.pop();
        }
    }
    public SymbolEntry insert(String name)
    {
        return  scopes.peek().insert(name);

    }
    public SymbolEntry lookup(String name)
    {
        return  scopes.peek().lookup(name);

    }
    public  void setAttribute(String name, String key, Object value){
        SymbolEntry entry=lookup(name);
        if(entry!=null)
        {
            entry.setAttribute(key,value);
        }

    }
    public Object getAttribute(String name, String key) {
        SymbolEntry entry = lookup(name);
        return entry != null ? entry.getAttribute(key) : null;
    }

    public void print() {
        System.out.println("===== SYMBOL TABLE =====");
        int level = 0;
        for (Scope scope : allScopes) {
            System.out.println("Scope level " + level + ":");
            scope.print();
            level++;
        }
    }


}
