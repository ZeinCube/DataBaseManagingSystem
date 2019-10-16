package Entity;

import Exceptions.DBMSException;
import Exceptions.ExistingColumnException;
import Exceptions.ExistingPrimaryKeyException;
import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;

public class Table extends Commitable {

    private String name;
    private HashSet<Column> columns;
    private Class primaryKeyClass;
    private HashMap<Object, Row> rows;

    public Table(String name, HashSet<Column> columns, Class primaryKeyClass) throws ExistingPrimaryKeyException {
        boolean hasPrimaryKey = false;

        for (Column column : columns) {
            if (hasPrimaryKey && column.isPRIMARY_KEY()) {
                throw new ExistingPrimaryKeyException(column.getMeta(), name);
            }

            hasPrimaryKey = column.isPRIMARY_KEY();
        }

        this.name = name;
        this.columns = columns;
        this.primaryKeyClass = primaryKeyClass;
        rows = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Column> getColumns() {
        return columns;
    }

    public void addColumn(Column column) throws ExistingColumnException {
        if (columns.contains(column)) {
            throw new ExistingColumnException("Column with name " + column.getColumnName() + " already exists");
        }

        columns.add(column);
    }

    public void setColumns(HashSet<Column> columns) {
        this.columns = columns;
    }

    public Class getPrimaryKeyClass() {
        return primaryKeyClass;
    }

    public void setPrimaryKeyClass(Class primaryKeyClass) {
        this.primaryKeyClass = primaryKeyClass;
    }

    public HashMap<Object, Row> getRows() {
        return rows;
    }

    public void setRows(HashMap<Object, Row> rows) {
        this.rows = rows;
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
