package pars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parser {
    String commandRegex = "";

    List<String> keyWords = Arrays.asList(
            "inquiry_type",
            "table",
            "primary_key",
            "unique"
    );

    Map<String, DataType> keyToTypes = new HashMap<String, DataType>() {{
        put("integer", DataType.INTEGER);
        put("real", DataType.REAL);
        put("text", DataType.TEXT);
    }};

    Map<String, Constr> keyToConstr = new HashMap<String, Constr>() {{
        put("primary key", Constr.primary_key);
        put("unique", Constr.unique);
    }};

    int pos = 0;

    public void pars(String[] s) {
        if (s[pos] == "create") {
            ++pos;
            parse_create(words);
        } else if (words[pos] == drop) {
            ++pos;
            parse_drop(words);
        }
        return;
    }
}
