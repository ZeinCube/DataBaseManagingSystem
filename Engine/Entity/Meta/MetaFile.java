package Entity.Meta;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MetaFile {
    private String dataBaseName;
    private HashMap<String, MetaTable> Tables = new HashMap<>();
    private long lastIndex;

    public MetaFile() {
    }

    public MetaFile(String dataBaseName) {
        this.dataBaseName = dataBaseName;
        this.lastIndex = 0;
    }

    public MetaFile(String dataBaseName, long lastIndex) {
        this.dataBaseName = dataBaseName;
        this.lastIndex = lastIndex;
    }

    public MetaFile addTable(MetaTable table) throws Exception {
        if (Tables.containsKey(table.getName())) {
            throw new Exception("Such table already exists");
        }

        Tables.put(table.getName(), table);

        return this;
    }

    public void dropTable(String tableName) throws Exception {
        if (!Tables.containsKey(tableName)) {
            throw new Exception("Table with name \"" + tableName + "does not exist\"");
        }

        Tables.remove(tableName);
    }

    public HashMap<String, MetaTable> getTables() {
        return Tables;
    }

    public MetaFile setLastIndex(long lastIndex) {
        this.lastIndex = lastIndex;

        return this;
    }

    public long getLastIndex() {
        return lastIndex;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public MetaTable getMetaTable(String tableName) throws Exception {
        if (!Tables.containsKey(tableName)) {
            throw new Exception("Table with name \"" + tableName + "does not exist\"");
        }

        return Tables.get(tableName);
    }

    public void saveToJSON() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(this.getPath()), this);
        } catch (IOException e) {
            System.err.println("Could not create file: \n" + e.getMessage());
            System.exit(1);
        }
    }

    public MetaFile toObject(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(fileName), this.getClass());
        } catch (IOException e) {
            System.err.println("Could not read value from file: \n" + e.getMessage());
            System.exit(1);
        }

        return null;
    }

    public String getPath() {
        return System.getProperty("user.home") + "/.dbms/meta-" + dataBaseName + ".dbms";
    }
}
