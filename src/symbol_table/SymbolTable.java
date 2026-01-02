package symbol_table;

import java.util.Stack;

public class SymbolTable {
    private Stack<Scope>scopes=new Stack<>();;
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
        scopes.push(new Scope(parent));

    }
    public void exitscope()
    {
        if(scopes.size()>1)
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




}
