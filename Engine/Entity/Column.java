package Entity;

import java.util.HashMap;

public class Column<K, V> {
    private HashMap<K, V> objects; //K is primary key type

    private final boolean UNIQUE;
    private final boolean PRIMARY_KEY;

    public Column(boolean unique, boolean primary_key) {
        PRIMARY_KEY = primary_key;

        if (primary_key) {
            UNIQUE = true;
        } else {
            UNIQUE = unique;
        }

        objects = new HashMap<>();
    }

    public boolean isUNIQUE() {
        return UNIQUE;
    }

    public boolean isPRIMARY_KEY() {
        return PRIMARY_KEY;
    }
}
