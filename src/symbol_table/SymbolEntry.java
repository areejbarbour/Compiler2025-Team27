package symbol_table;

import java.util.HashMap;
import java.util.Objects;

public class SymbolEntry {

    private  String name;
    private HashMap<String, Object>attributes;
     public  SymbolEntry(String name)
     {
         this.name=name;
         this.attributes = new HashMap<>();
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
}
