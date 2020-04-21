package RandomQueryGenerator.Generators;

import java.util.HashMap;

public class DataGenerator {

    public DataGenerator() {
        initDataTypes();
    }

    private HashMap<String, Generator> dataTypes;

    private void initDataTypes() {
        dataTypes = new HashMap<>();

        dataTypes.put("_letter", new LetterGen());
        dataTypes.put("_digit", new DigitGen());
        dataTypes.put("_number", new NumberGen());
        dataTypes.put("_string", new StringGen());
        dataTypes.put("_double", new DoubleGen());
    }

    public boolean checkType(String type) {
        return dataTypes.containsKey(type);
    }

    public String getData(String type) {
        return dataTypes.get(type).getData().toString();
    }


}
