package Entity;

import java.io.Serializable;
import java.util.HashMap;

public class Row implements Serializable {
    private HashMap<String, Cell> values;

    public Row(HashMap<String, Cell> values) {
        this.values = values;
    }

    public HashMap<String, Cell> getValues() {
        return values;
    }

    public void setValues(HashMap<String, Cell> values) {
        this.values = values;
    }

    public Object getValueByColumnName(String name) {
        return values.get(name);
    }
}
