package Engine.Entity;

import java.io.Serializable;

public class Cell implements Serializable {
    private Column column;
    private Object value;

    public Cell(Column column, Object value) {
        this.column = column;
        this.value = value;
    }

    public Object getValue() {
        return column.getValueClass().cast(value);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public Column getColumn() {
        return column;
    }
}
