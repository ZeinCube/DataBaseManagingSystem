package Engine.Entity;

import Engine.Entity.Meta.MetaTable;
import Engine.Exceptions.*;
import org.apache.commons.lang3.SerializationUtils;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Table.
 */
public class Table extends Commitable {

    private String name;
    private HashMap<String, Column> columns;
    private Class primaryKeyClass;
    private TableBlockContainer container;
    private MetaTable metaTable;

    /**
     * Instantiates a new Table.
     *
     * @param name    the name
     * @param columns the columns
     * @throws DBMSException the dbms exception
     */
    public Table(String name, @NotNull HashMap<String, Column> columns) throws DBMSException {
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

        try {
            container = new TableBlockContainer(getPath(), 0);
        } catch (FileNotFoundException e) {
            throw new NoTableException("Table \"" + getName() + "\" does not exists");
        }
    }

    /**
     * Instantiates a new Table.
     *
     * @param name the name
     */
    public Table(String name) {
        this.name = name;
    }

    /**
     * Insert.
     *
     * @param toColumns the to columns
     * @param rows      the rows
     * @throws NoSuchColumnException the no such column exception
     */
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

    @Override
    public String getPath() {
        return System.getProperty("user.home") + "/.dbms/tables/" + name + ".dbms";
    }

    /**
     * Select array list.
     *
     * @param columns the columns
     * @return the array list
     */
    public ArrayList<Column> select(@NotNull ArrayList<String> columns) {
        HashMap<String, Column> result = new HashMap<>();
        for (String columnName : columns) {
            result.put(columnName, getColumnByName(columnName));
        }

        for (HashMap.Entry<Integer, Row> row : container.getRows().entrySet()) {
            for (String columnName: columns) {
                result.get(columnName).addValue(row.getValue().getValueByColumnName(columnName));
            }
        }

        ArrayList<Column> resultColumns = new ArrayList<>();

        for (HashMap.Entry<String, Column> columnEntry : result.entrySet()) {
            resultColumns.add(columnEntry.getValue());
        }

        return resultColumns;
    }

    /**
     * Add column.
     *
     * @param column the column
     * @throws ExistingColumnException the existing column exception
     */
    public void addColumn(@NotNull Column column) throws ExistingColumnException {
        if (columns.containsKey(column.getColumnName())) {
            throw new ExistingColumnException("Column with name " + column.getColumnName() + " already exists");
        }

        columns.put(column.getColumnName(), column);

    }

    @Override
    public void commit() throws SaveException {
        byte[] bytes = SerializationUtils.serialize(this);
        File file = new File(getPath());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new SaveException("Could not save table cause : " + e.getMessage());
            }
        }

        Path path = Paths.get(getPath());

        try {
            Files.write(path, bytes);
        } catch (IOException e) {
            throw new SaveException("Could not save table cause: " + e.getMessage());
        }
    }

    private String checkColumns(@NotNull List<Column> checkColumns) {
        String result = "ok";

        for (Column column : checkColumns) {
            if (!columns.containsValue(column)) {
                return column.getColumnName();
            }
        }

        return result;
    }

    /**
     * Load table.
     *
     * @param name the name
     * @return the table
     * @throws GetTableException the get table exception
     */
    public static Table load(String name) throws GetTableException {
        byte[] data;

        try {
            data = Files.readAllBytes(Paths.get(getPath(name)));
        } catch (IOException e) {
            throw new GetTableException("Could not get table \"" + name + "\" cause : " + e.getMessage());
        }

        return SerializationUtils.deserialize(data);
    }

    /**
     * Gets column by name.
     *
     * @param columnName the column name
     * @return the column by name
     */
    public Column getColumnByName (String columnName) {
        Column searchingColumn = columns.get(columnName);
        return new Column(searchingColumn.getColumnName(), searchingColumn.getValueClass(), searchingColumn.isUNIQUE(), searchingColumn.isPRIMARY_KEY());
    }

    /**
     * Gets path.
     *
     * @param tableName the table name
     * @return the path
     */
    @NotNull
    public static String getPath(String tableName) {
        return System.getProperty("user.home") + "/.dbms/tables/" + tableName + ".dbms";
    }

    /**
     * Gets columns.
     *
     * @return the columns
     */
    public HashMap<String, Column> getColumns() {
        return columns;
    }

    /**
     * Sets columns.
     *
     * @param columns the columns
     */
    public void setColumns(HashMap<String, Column> columns) {
        this.columns = columns;
    }

    /**
     * Gets primary key class.
     *
     * @return the primary key class
     */
    public Class getPrimaryKeyClass() {
        return primaryKeyClass;
    }

    /**
     * Sets primary key class.
     *
     * @param primaryKeyClass the primary key class
     */
    public void setPrimaryKeyClass(Class primaryKeyClass) {
        this.primaryKeyClass = primaryKeyClass;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets meta table.
     *
     * @return the meta table
     */
    public MetaTable getMetaTable() {
        return metaTable;
    }

    /**
     * Sets meta table.
     *
     * @param metaTable the meta table
     */
    public void setMetaTable(MetaTable metaTable) {
        this.metaTable = metaTable;
    }

}
