package Engine.Entity;

import java.io.Serializable;
import java.util.HashMap;

public class Row implements Serializable {

    private HashMap<String, Column> columns;

    private HashMap<String, Cell> values;

    public Row(HashMap<String, Cell> values, HashMap<String, Column> columns) {
        this.columns = columns;
        this.values = values;
    }

    public void setColumns(HashMap<String, Column> columns) {
        this.columns = columns;
    }

    public HashMap<String, Column> getColumns() {
        return columns;
    }

    public HashMap<String, Cell> getValues() {
        return values;
    }

    public void setValues(HashMap<String, Cell> values) {
        this.values = values;
    }

    public Cell getValueByColumnName(String name) {
        return values.get(name);
    }
}
