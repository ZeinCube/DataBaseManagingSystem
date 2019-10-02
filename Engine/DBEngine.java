import Entity.Column;
import Entity.MetaFile;
import Entity.MetaTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DBEngine {
    private final String homeDirectory = System.getProperty("user.home") + "/.dbms";
    private MetaFile metaFile;

    public DBEngine() throws Exception {
        checkDirectory();
    }

    public boolean createDataBase(String dataBaseName) throws Exception {
        if (isDataBaseExist(dataBaseName)) {
            throw new Exception("Data Base with name \"" + dataBaseName + "\" already exists");
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
        checkIfConnectedToDataBase();

        MetaTable table = new MetaTable(tableName, new ArrayList<>());
        metaFile.addTable(table);
        MetaFile.toJSON(metaFile);

        System.out.println("Created table " + tableName);
    }

    public void createTable(String tableName, ArrayList<Column> columns) {
        checkIfConnectedToDataBase();

        MetaTable table = new MetaTable(tableName, columns);
        try {
            metaFile.addTable(table);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return;
        }
        MetaFile.toJSON(metaFile);

        System.out.println("Created table " + tableName);
    }

    public void dropTable(String tableName) {
        checkIfConnectedToDataBase();

        try {
            metaFile.dropTable(tableName);
        } catch (Exception e) {
            System.err.println(e.getMessage());

            return;
        }

        MetaFile.toJSON(metaFile);
        System.out.println("Table " + tableName + " dropped");
    }

    public MetaTable getTable(String tableName) {
        checkIfConnectedToDataBase();

        try {
            return metaFile.getMetaTable(tableName);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
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

    private void checkIfConnectedToDataBase() {
        if (metaFile == null) {
            System.err.println("Not connected to Data Base");
        }
    }
}
