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
            throw new DBMSException("Could not create table " + e.getMessage());
        }

        commit(metaFile);
        commit(table);

        return "Created table " + tableName;
    }

    public String showCreateTable(String tableName) throws Exception {
        return metaFile.getTable(tableName).getCreate();
    }

    public String insert(String tableName, List<Column> columns, List<Row> rows) throws DBMSException {
        Table table = getTable(tableName);
        table.insert(columns, rows);
        commit(table);

        return rows.size() + " rows inserted to \"" + table.getName() + " successfully finished";
    }

    public String dropTable(String tableName) throws DBMSException {
        try {
            metaFile.dropTable(tableName);
        } catch (Exception e) {
            throw new DropException("Table " + tableName + "could not be dropped cause :" + e.getMessage());
        }

        commit(metaFile);

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
