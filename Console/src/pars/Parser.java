package pars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {
    List<String> keyWords = Arrays.asList(
            "inquiry_type",
            "table",
            "primary_key",
//        "foreign_key",
//        "not_null",
            "unique"
    );

    Map<String, DataType> keyToTypes = new HashMap<String, DataType>() {{
        put("integer", DataType.INTEGER);
        put("real", DataType.REAL);
        put("text", DataType.TEXT);
    }};

    Map<String, Constr> keyToConstr = new HashMap<String, Constr>() {{
        put("primary key", Constr.primary_key);
//        put("foreign key", Constr.foreign_key);
//        put("not null", Constr.not_null);
        put("unique", Constr.unique);
//        put("check", Constr.check);
    }};

    public void pars(String s) {

    }
}
