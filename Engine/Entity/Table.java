package Entity;

import Exceptions.*;
import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Table extends Commitable {

    private String name;
    private HashMap<String, Column> columns;
    private Class primaryKeyClass;
    private HashMap<Integer, Row> rows;

    public Table(String name, HashSet<Column> columns) throws ExistingPrimaryKeyException, NoPrimaryKeyException {
        boolean hasPrimaryKey = false;

        for (Column column : columns) {
            if (hasPrimaryKey && column.isPRIMARY_KEY()) {
                throw new ExistingPrimaryKeyException(column.getMeta(), name);
            }

            hasPrimaryKey = column.isPRIMARY_KEY();
        }

        if (!hasPrimaryKey) {
            throw new NoPrimaryKeyException();
        }

        this.columns = new HashMap<>();

        for (Column column : columns) {
            this.columns.put(column.getColumnName(), column);
        }

        this.name = name;

        rows = new HashMap<>();
    }

    public void insert(List<Row> rows) throws NoSuchColumnException {
        for (Row row : rows) {
            for (Map.Entry<String, Cell> cell : row.getValues().entrySet()) {
                if (!columns.containsKey(cell.getKey())) {
                    throw new NoSuchColumnException("Error while inserting value \"" + cell.getValue().getValue() +
                            "\" in non-existing column \"" + cell.getKey() + "\"");
                }

                this.rows.put(rows.size() - 1, row);
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
    protected String getPath() {
        return System.getProperty("user.home") + "/.dbms/tables/" + name + ".dbms";
    }
}
