package Entity;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MetaFile {
    private String dataBaseName;
    private HashMap<String, MetaTable> tableNamesToFiles = new HashMap<>();
    private long lastIndex;

    public static void toJSON(MetaFile file) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(file.getPath()), file);
        } catch (IOException e) {
            System.err.println("Could not create meta file: \n" + e.getMessage());
            System.exit(1);
        }
    }

    public static MetaFile toObject(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(fileName), MetaFile.class);
        } catch (IOException e) {
            System.err.println("Could not read value from meta file: \n" + e.getMessage());
            System.exit(1);
        }

        return null;
    }

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

    public MetaFile addTable(MetaTable table) {
        tableNamesToFiles.put(table.getName(), table);

        return this;
    }

    public HashMap<String, MetaTable> getTableNamesToFiles() {
        return tableNamesToFiles;
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

    private String getPath() {
        return System.getProperty("user.home") + "/.dbms/meta-" + dataBaseName + ".dbms";
    }
}
