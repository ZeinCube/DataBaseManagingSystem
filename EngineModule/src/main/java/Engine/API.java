package Engine;

import Engine.Entity.Column;
import Engine.Entity.Commitable;
import Engine.Entity.Meta.MetaFile;
import Engine.Entity.Meta.MetaTable;
import Engine.Entity.Row;
import Engine.Entity.Table;
import Engine.Exceptions.DBMSException;
import Engine.Exceptions.DropException;
import Engine.Exceptions.GetTableException;
import Engine.Exceptions.NoTableException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The type Api.
 */
public class API {
    private MetaFile metaFile;

    /**
     * Instantiates a new Api.
     *
     * @param metaFile the meta file
     */
    public API(MetaFile metaFile) {
        this.metaFile = metaFile;
    }

    /**
     * Create table string.
     *
     * @param tableName the table name
     * @param columns   the columns
     * @return the string
     * @throws DBMSException the dbms exception
     */
    public String createTable(String tableName, HashMap<String, Column> columns) throws DBMSException {
        Table table = new Table(tableName, columns);
        MetaTable metaTable = new MetaTable(table);
        table.setMetaTable(metaTable);

        try {
            metaFile.addTable(metaTable);
        } catch (Exception e) {
            throw new DBMSException("Could not create table " + e.getMessage());
        }

        commit(metaFile);
        commit(table);

        return "Created table " + tableName;
    }

    /**
     * Select array list.
     *
     * @param tableName   the table name
     * @param columnNames the column names
     * @return the array list
     * @throws GetTableException the get table exception
     * @throws NoTableException  the no table exception
     */
    public ArrayList<Column> select(String tableName, ArrayList<String> columnNames) throws GetTableException, NoTableException {
        return this.getTable(tableName).select(columnNames);
    }

    /**
     * Show create table string.
     *
     * @param tableName the table name
     * @return the string
     * @throws Exception the exception
     */
    public String showCreateTable(String tableName) throws Exception {
        return metaFile.getTable(tableName).getCreate();
    }

    /**
     * Insert string.
     *
     * @param tableName the table name
     * @param columns   the columns
     * @param rows      the rows
     * @return the string
     * @throws DBMSException the dbms exception
     */
    public String insert(String tableName, List<Column> columns, List<Row> rows) throws DBMSException {
        Table table = getTable(tableName);
        table.insert(columns, rows);
        commit(table);

        return rows.size() + " rows inserted to \"" + table.getName() + " successfully finished";
    }

    /**
     * Drop table string.
     *
     * @param tableName the table name
     * @return the string
     * @throws DBMSException the dbms exception
     */
    public String dropTable(String tableName) throws DBMSException {
        try {
            metaFile.dropTable(tableName);
        } catch (Exception e) {
            throw new DropException("Table " + tableName + "could not be dropped cause :" + e.getMessage());
        }

        try {
            commit(metaFile);
        } catch (DBMSException e) {
            throw new DropException("Table \"" + tableName + "\" could not be dropped cause:" + e.getMessage());
        }

        return "Table " + tableName + " dropped";
    }

    /**
     * Drop all string.
     *
     * @return the string
     * @throws Exception the exception
     */
    @Deprecated
    public String dropAll() throws Exception {
        DBEngine.deleteDB();

        return "Database dropped";
    }

    private void commit(Commitable object) throws DBMSException {
        DBEngine.commit(object);
    }

    private Table getTable(String name) throws NoTableException, GetTableException {
        if (!metaFile.getTables().containsKey(name)) {
            throw new NoTableException("There is no table with name \"" + name + "\"");
        }

        return Table.load(name);
    }
}
