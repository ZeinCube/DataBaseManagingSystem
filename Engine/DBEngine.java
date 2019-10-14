import Entity.Commitable;
import Entity.Meta.MetaFile;
import Exceptions.DBMSException;

import java.io.File;
import java.io.FileNotFoundException;

public class DBEngine {
    private final String defaultDatabaseName = "main";
    private final String homeDirectory = System.getProperty("user.home") + "/.dbms";
    private final String homeTablesDirectory = System.getProperty("user.home") + "/.dbms/tables";
    private MetaFile metaFile;


    public DBEngine() throws Exception {
        checkDirectory();

        if (!isDataBaseExist(defaultDatabaseName)) {
            createDataBase(defaultDatabaseName);
        }

        connectToDataBase(defaultDatabaseName);
    }

    public API getApi() {
        return new API(metaFile);
    }

    public API createDataBase(String dataBaseName) throws Exception {
        if (isDataBaseExist(dataBaseName)) {
            throw new Exception("Data Base with name \"" + dataBaseName + "\" already exists");
        }

        MetaFile metaFile = new MetaFile(dataBaseName);
        commit(metaFile);

        return new API(metaFile);
    }

    private API connectToDataBase(String dataBaseName) throws Exception {
        try {
            isDataBaseExist(dataBaseName);
            metaFile = new MetaFile().toObject(getMetaFilePath(dataBaseName));
        } catch (DBMSException e) {
            throw new DBMSException("Database with name \"" + dataBaseName + "\" does not exist ");
        }

        return new API(metaFile);
    }

    private boolean isDataBaseExist(String dataBaseName) throws Exception {
        checkDirectory();
        File mFile = new File(getMetaFilePath(dataBaseName));

        return mFile.exists();
    }

    private String getMetaFilePath(String dataBaseName) {
        return homeDirectory + "/meta-" + dataBaseName + ".dbms";
    }

    private void checkDirectory() throws FileNotFoundException {
        File directory = new File(homeDirectory);
        File tableDirectory = new File(homeTablesDirectory);

        if (!directory.exists()) {
            if (!directory.mkdir()) {
                throw new FileNotFoundException("Could not create storage");
            }
        }

        if (!tableDirectory.exists()) {
            if (!tableDirectory.mkdir()) {
                throw new FileNotFoundException("Could not create table storage");
            }
        }
    }

    public static void commit(Commitable object) throws DBMSException {
        object.commit();
    }
}
