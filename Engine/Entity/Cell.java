package Entity;

import java.io.Serializable;

public class Cell implements Serializable {
    private Class type;
    private Column columnContain;
    private Object value;

    public Cell(Class type, Column columnContain, Object value) {
        this.type = type;
        this.columnContain = columnContain;
        this.value = value;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Column getColumnContain() {
        return columnContain;
    }

    public void setColumnContain(Column columnContain) {
        this.columnContain = columnContain;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
