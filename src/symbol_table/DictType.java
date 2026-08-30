package symbol_table;

import java.util.HashMap;
import java.util.Map;

public class DictType extends Type {

    private Type keyType;
    private Type valueType;

    private final Map<String, Type> fieldTypes = new HashMap<>();

    public DictType(Type keyType, Type valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
    }



    public Type getKeyType() {
        return keyType;
    }

    public Type getValueType() {
        return valueType;
    }


    public void setKeyType(Type keyType) {
        this.keyType = keyType;
    }

    public void setValueType(Type valueType) {
        this.valueType = valueType;
    }

    public void addFieldType(String key, Type type) {
        fieldTypes.put(key, type);
    }

    public Type getFieldType(String key) {
        return fieldTypes.get(key);
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