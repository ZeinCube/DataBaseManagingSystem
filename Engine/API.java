import Entity.Column;
import Entity.Commitable;
import Entity.Meta.MetaFile;
import Entity.Meta.MetaTable;
import Entity.Row;
import Entity.Table;
import Exceptions.DBMSException;
import Exceptions.DropException;
import Exceptions.GetTableException;
import Exceptions.NoTableException;

import java.util.HashSet;
import java.util.List;

public class API {
    private MetaFile metaFile;

    public API(MetaFile metaFile) {
        this.metaFile = metaFile;
    }

    public String createTable(String tableName, HashSet<Column> columns) throws DBMSException {
        Table table = new Table(tableName, columns);
        MetaTable metaTable = new MetaTable(table);

        try {
            metaFile.addTable(metaTable);
        } catch (Exception e) {
            throw new DBMSException("Could not create database " + e.getMessage());
        }

        commit(metaFile);
        commit(table);

        return "Created table " + tableName;
    }



    public String showCreateTable(String tableName) throws Exception {
        return metaFile.getTable(tableName).getCreate();
    }

    public String insert(String tableName, List<Row> rows) throws DBMSException {
        Table table = getTable(tableName);
        table.insert(rows);
        commit(table);

        return rows.size() + " rows inserted to \"" + table.getName() + " successfully finished";
    }

    public String dropTable(String tableName) throws DropException {
        try {
            metaFile.dropTable(tableName);
        } catch (Exception e) {
            throw new DropException("Table " + tableName + "could not be dropped cause :" + e.getMessage());
        }

        return "Table " + tableName + " dropped";
    }

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
