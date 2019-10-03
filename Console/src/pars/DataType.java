package pars;

import java.time.temporal.Temporal;
import java.util.HashMap;

public enum DataType {
    INTEGER,
    REAL,
    TEXT;

    static {
        HashMap<DataType, Class> types = new HashMap<DataType, Class>() {{
            put(INTEGER, Integer.class);
            put(REAL, Double.class);
            put(TEXT, String.class);
        }};
    }
}
