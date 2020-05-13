package Engine.Entity;

import java.io.Serializable;
import java.util.HashMap;

/**
 * The type Row.
 */
public class Row implements Serializable {

    private HashMap<String, Cell> values;
    private long tableIndex;

    /**
     * Instantiates a new Row.
     *
     * @param values     the values
     * @param tableIndex the table index
     */
    public Row(HashMap<String, Cell> values, int tableIndex) {
        this.values = values;
        this.tableIndex = tableIndex;
    }

    /**
     * Gets values.
     *
     * @return the values
     */
    public HashMap<String, Cell> getValues() {
        return values;
    }

    /**
     * Sets values.
     *
     * @param values the values
     */
    public void setValues(HashMap<String, Cell> values) {
        this.values = values;
    }

    /**
     * Gets value by column name.
     *
     * @param name the name
     * @return the value by column name
     */
    public Cell getValueByColumnName(String name) {
        return values.get(name);
    }

    /**
     * Gets table index.
     *
     * @return the table index
     */
    public long getTableIndex() {
        return tableIndex;
    }
}
