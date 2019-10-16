import Entity.Column;
import Entity.Commitable;
import Entity.Meta.MetaFile;
import Entity.Meta.MetaTable;
import Entity.Table;
import Exceptions.DBMSException;
import Exceptions.DropException;

import java.util.HashSet;

public class API {
    private MetaFile metaFile;

    public API(MetaFile metaFile) {
        this.metaFile = metaFile;
    }

    public String createTable(String tableName, Class primaryKeyClass, HashSet<Column> columns) throws DBMSException {
        Table table = new Table(tableName, columns, primaryKeyClass);
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

    public String dropTable(String tableName) throws DropException {
        try {
            metaFile.dropTable(tableName);
        } catch (Exception e) {
            throw new DropException("Table " + tableName + "could not be dropped cause :" + e.getMessage());
        }

        return "Table " + tableName + " dropped";
    }

    private void commit(Commitable object) throws DBMSException {
        DBEngine.commit(object);
    }
}
