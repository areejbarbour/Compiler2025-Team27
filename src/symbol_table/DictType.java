package symbol_table;

public class DictType extends Type {

    private Type keyType;
    private Type valueType;

    public DictType(Type keyType, Type valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
    }

    // ==========================
    // Getters
    // ==========================

    public Type getKeyType() {
        return keyType;
    }

    public Type getValueType() {
        return valueType;
    }

    // إذا احتجت تعديلهم لاحقاً
    public void setKeyType(Type keyType) {
        this.keyType = keyType;
    }

    public void setValueType(Type valueType) {
        this.valueType = valueType;
    }

    @Override
    public String name() {
        return "DICT<" + keyType.name() + "," + valueType.name() + ">";
    }

    @Override
    public String toString() {
        return "DICT<" + keyType + ", " + valueType + ">";
    }
}