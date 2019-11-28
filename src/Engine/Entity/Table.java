package Engine.Entity;

import Engine.Exceptions.*;
import org.apache.commons.lang3.SerializationUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table extends Commitable {

    private String name;
    private HashMap<String, Column> columns;
    private Class primaryKeyClass;
    private HashMap<Integer, Row> rows;
    private TableContainer container;
    private String pathToContainer;

    public Table(String name, HashMap<String, Column> columns) throws DBMSException {
        boolean hasPrimaryKey = false;

        ArrayList<String> columnNames = new ArrayList<>();

        for (HashMap.Entry<String, Column> entry : columns.entrySet()) {
            if (hasPrimaryKey && entry.getValue().isPRIMARY_KEY()) {
                throw new ExistingPrimaryKeyException(entry.getValue().getMeta(), name);
            }

            hasPrimaryKey = hasPrimaryKey || entry.getValue().isPRIMARY_KEY();

            if (!columnNames.contains(entry.getKey())) {
                columnNames.add(entry.getKey());
            } else {
                throw new DBMSException("Column with name " + entry.getKey() + " already exists");
            }

            this.columns = new HashMap<>();
        }

        if (!hasPrimaryKey) {
            throw new NoPrimaryKeyException();
        }


        for (HashMap.Entry<String, Column> entry : columns.entrySet()) {
            this.columns.put(entry.getValue().getColumnName(), entry.getValue());
        }

        this.name = name;

        rows = new HashMap<>();
    }

    public Table(String name) {
        this.name = name;
    }

    public void insert(List<Column> toColumns, List<Row> rows) throws NoSuchColumnException {
        String checkResult = checkColumns(toColumns);

        if (!checkResult.equals("ok")) {
            throw new NoSuchColumnException("Error while inserting : No such column \"" + checkResult + "\"");
        }

        for (Row row : rows) {
            for (Map.Entry<String, Column> columnEntry : columns.entrySet()) {
                row.getValueByColumnName(columnEntry.getKey());
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addColumn(Column column) throws ExistingColumnException {
        if (columns.containsKey(column.getColumnName())) {
            throw new ExistingColumnException("Column with name " + column.getColumnName() + " already exists");
        }

        columns.put(column.getColumnName(), column);
    }

    public HashMap<String, Column> getColumns() {
        return columns;
    }

    public void setColumns(HashMap<String, Column> columns) {
        this.columns = columns;
    }

    public Class getPrimaryKeyClass() {
        return primaryKeyClass;
    }

    public void setPrimaryKeyClass(Class primaryKeyClass) {
        this.primaryKeyClass = primaryKeyClass;
    }

    public HashMap<Integer, Row> getRows() {
        return rows;
    }

    public void setRows(HashMap<Integer, Row> rows) {
        this.rows = rows;
    }

    public static String getPath(String tableName) {
        return System.getProperty("user.home") + "/.dbms/tables/" + tableName + ".dbms";
    }

    public static Table load(String name) throws GetTableException {
        byte[] data;

        try {
            data = Files.readAllBytes(Paths.get(getPath(name)));
        } catch (IOException e) {
            throw new GetTableException("Could not get table \"" + name + "\" cause : " + e.getMessage());
        }

        return SerializationUtils.deserialize(data);
    }

    @Override
    public void commit() throws DBMSException {
        byte[] bytes = SerializationUtils.serialize(this);
        File file = new File(getPath());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new DBMSException("Could not save table cause : " + e.getMessage());
            }
        }

        Path path = Paths.get(getPath());

        try {
            Files.write(path, bytes);
        } catch (IOException e) {
            throw new DBMSException("Could not save table cause: " + e.getMessage());
        }
    }

    @Override
    public String getPath() {
        return System.getProperty("user.home") + "/.dbms/tables/" + name + ".dbms";
    }

    private String checkColumns(List<Column> checkColumns) {
        String result = "ok";

        for (Column column : checkColumns) {
            if (!columns.containsValue(column)) {
                return column.getColumnName();
            }
        }

        return result;
    }
}
