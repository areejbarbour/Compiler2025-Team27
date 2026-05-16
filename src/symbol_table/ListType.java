package symbol_table;

public class ListType extends Type{
    private Type elementtype;
    public ListType (Type elementtype)
    {
        this.elementtype=elementtype;
    }
    public Type getElementtype()
    {
        return elementtype;
    }
    @Override
    public String name()
    {
        return "LIST<" + elementtype.name() + ">";
    }
    @Override
    public String toString() {
        return "LIST<" + elementtype + ">";
    }

}
