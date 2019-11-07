package Engine.Entity.Meta;

import Engine.Entity.Commitable;
import Engine.Exceptions.DBMSException;
import Engine.Exceptions.DropException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

@JsonIgnoreProperties(value = {"path"})
public class MetaFile extends Commitable {
    private String dataBaseName;
    private HashMap<String, MetaTable> tables;

    public MetaFile(String dataBaseName) {
        this.dataBaseName = dataBaseName;
        this.tables = new HashMap<>();
    }

    public MetaFile(String dataBaseName, HashMap<String, MetaTable> tables) {
        this.dataBaseName = dataBaseName;
        this.tables = tables;
    }

    public MetaFile() {
    }

    public MetaFile addTable(MetaTable table) throws Exception {
        if (tables.containsKey(table.getName())) {
            throw new DBMSException("Such table already exists");
        }

        tables.put(table.getName(), table);

        return this;
    }

    public void dropTable(String tableName) throws Exception {
        if (!tables.containsKey(tableName)) {
            throw new DropException("Table with name \"" + tableName + "does not exist\"");
        }

        FileUtils.forceDelete(new File(tables.get(tableName).getFileTable()));
        tables.remove(tableName);
    }

    public MetaTable getTable(String tableName) throws DBMSException {
        if (!tables.containsKey(tableName)) {
            throw new DBMSException("Table with name \"" + tableName + "does not exist\"");
        }

        return tables.get(tableName);
    }

    public MetaFile toObject(String fileName) throws DBMSException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(new File(fileName), this.getClass());
        } catch (IOException e) {
            throw new DBMSException("Could not read value from file: \n" + e.getMessage());
        }
    }

    public HashMap<String, MetaTable> getTables() {
        return tables;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public String getPath() {
        return System.getProperty("user.home") + "/.dbms/meta-" + dataBaseName + ".dbms";
    }

    @Override
    public void commit() throws DBMSException {
        saveToJSON();
    }
}
