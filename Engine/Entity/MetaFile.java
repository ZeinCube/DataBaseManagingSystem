package Entity;

import java.util.HashMap;

public class MetaFile {
    private String dataBaseName;
    private HashMap<String, String> tableNames;
    private long lastIndex;

    public MetaFile(String dataBaseName) {
        this.dataBaseName = dataBaseName;
        this.lastIndex = 0;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public MetaFile addTableName(String tableName) {
        this.tableNames.put(tableName, tableName.concat(".dbms"));

        return this;
    }

    public HashMap<String, String> getTableNames() {
        return tableNames;
    }

    public MetaFile setLastIndex(long lastIndex) {
        this.lastIndex = lastIndex;

        return this;
    }

    public long getLastIndex() {
        return lastIndex;
    }
}
