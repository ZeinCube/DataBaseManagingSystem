package Entity;

import java.util.HashMap;

public class Column<K, V> {
    private HashMap<K, V> objects; //K is primary key type

    private String columnName;
    private boolean UNIQUE;
    private boolean PRIMARY_KEY;

    public Column(boolean unique, boolean primary_key, String columnName) {
        PRIMARY_KEY = primary_key;

        if (primary_key) {
            UNIQUE = true;
        } else {
            UNIQUE = unique;
        }

        objects = new HashMap<>();
    }

    public Column() {
    }

    ;

    public HashMap<K, V> getObjects() {
        return objects;
    }

    public void setObjects(HashMap<K, V> objects) {
        this.objects = objects;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
    }

    public boolean isUNIQUE() {
        return UNIQUE;
    }

    public void setUNIQUE(boolean UNIQUE) {
        this.UNIQUE = UNIQUE;
    }

    public boolean isPRIMARY_KEY() {
        return PRIMARY_KEY;
    }

    public void setPRIMARY_KEY(boolean PRIMARY_KEY) {
        this.PRIMARY_KEY = PRIMARY_KEY;
    }
}
