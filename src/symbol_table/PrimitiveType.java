package symbol_table;

public class PrimitiveType extends Type{
    private String name;
    public PrimitiveType(String name)
    {
        this.name=name;
    }
    @Override
    public String name()
    {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
