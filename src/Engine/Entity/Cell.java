package Engine.Entity;

import java.io.Serializable;

public class Cell implements Serializable {
    private Class type;
    private String columnName;
    private Object value;

    public Cell(Class type, String columnName, Object value) {
        this.type = type;
        this.columnName = columnName;
        this.value = value;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Object getValue() {
        return type.cast(value);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
