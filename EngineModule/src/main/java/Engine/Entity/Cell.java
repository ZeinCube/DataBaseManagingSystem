package Engine.Entity;

import java.io.Serializable;

/**
 * The type Cell.
 */
public class Cell implements Serializable {
    private Column column;
    private Object value;

    /**
     * Instantiates a new Cell.
     *
     * @param column the column
     * @param value  the value
     */
    public Cell(Column column, Object value) {
        this.column = column;
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public Object getValue() {
        return column.getValueClass().cast(value);
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Sets column.
     *
     * @param column the column
     */
    public void setColumn(Column column) {
        this.column = column;
    }

    /**
     * Gets column.
     *
     * @return the column
     */
    public Column getColumn() {
        return column;
    }
}
