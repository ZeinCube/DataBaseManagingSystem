import Entity.MetaFile;
import Entity.MetaTable;

import java.io.File;
import java.io.FileNotFoundException;

public class DBEngine {
    private final String homeDirectory = System.getProperty("user.home") + "/.dbms";
    private MetaFile metaFile;

    public DBEngine() throws Exception {
        checkDirectory();
    }

    public boolean createDataBase(String dataBaseName) throws Exception {
        if (isDataBaseExist(dataBaseName)) {
            throw new Exception("Table with name \"" + dataBaseName + "\" already exists");
        }

        metaFile = new MetaFile(dataBaseName);
        MetaFile.toJSON(metaFile);

        return true;
    }

    public void connectToDataBase(String dataBaseName) throws Exception {
        try {
            isDataBaseExist(dataBaseName);
            metaFile = MetaFile.toObject(getMetaFileName(dataBaseName));
        } catch (Exception e) {
            throw new Exception("Such database not exist");
        }

        System.out.println("Connected to DataBase " + dataBaseName);
    }

    public void createTable(String tableName) throws Exception {
        if (metaFile == null) {
            throw new Exception("Not connected to Data Base");
        }

        metaFile.addTable(new MetaTable(tableName));
    }

    private void checkDirectory() throws FileNotFoundException {
        File directory = new File(homeDirectory);

        if (!directory.exists()) {
            if (!directory.mkdir()) {
                throw new FileNotFoundException("Could not create directory");
            }
        }
    }

    private boolean isDataBaseExist(String dataBaseName) throws Exception {
        checkDirectory();
        File mFile = new File(getMetaFileName(dataBaseName));

        return mFile.exists();
    }

    private String getMetaFileName(String dataBaseName) {
        return homeDirectory + "/meta-" + dataBaseName + ".dbms";
    }
}
