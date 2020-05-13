package Engine;

import Engine.Entity.Commitable;
import Engine.Entity.Meta.MetaFile;
import Engine.Exceptions.DBMSException;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * The type Db engine.
 */
public class DBEngine {
    /**
     * The constant PAGE_SIZE.
     */
    public static int PAGE_SIZE = 65536;
    private final String defaultDatabaseName = "main";
    private static final String homeDirectory = System.getProperty("user.home") + "/.dbms";
    private final String homeTablesDirectory = System.getProperty("user.home") + "/.dbms/tables";
    private MetaFile metaFile;


    /**
     * Instantiates a new Db engine.
     *
     * @throws Exception the exception
     */
    public DBEngine() throws Exception {
        checkDirectory();

        if (!isDataBaseExist(defaultDatabaseName)) {
            createDataBase(defaultDatabaseName);
        }

        connectToDataBase();
    }

    /**
     * Gets api.
     *
     * @return the api
     */
    public API getApi() {
        return new API(metaFile);
    }

    /**
     * Create data base api.
     *
     * @param dataBaseName the data base name
     * @return the api
     * @throws Exception the exception
     */
    public API createDataBase(String dataBaseName) throws Exception {
        if (isDataBaseExist(dataBaseName)) {
            throw new Exception("Data Base with name \"" + dataBaseName + "\" already exists");
        }

        MetaFile metaFile = new MetaFile(dataBaseName);
        commit(metaFile);

        return new API(metaFile);
    }

    @NotNull
    @Contract(" -> new")
    private API connectToDataBase() throws Exception {
        try {
            isDataBaseExist("main");
            metaFile = new MetaFile().toObject(getMetaFilePath("main"));
        } catch (DBMSException e) {
            throw new DBMSException("Database with name \"" + "main" + "\" does not exist ");
        }

        return new API(metaFile);
    }

    private boolean isDataBaseExist(String dataBaseName) throws Exception {
        checkDirectory();
        File mFile = new File(getMetaFilePath(dataBaseName));

        return mFile.exists();
    }

    @org.jetbrains.annotations.NotNull
    @org.jetbrains.annotations.Contract(pure = true)
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

    /**
     * Commit.
     *
     * @param object the object
     * @throws DBMSException the dbms exception
     */
    public static void commit(@NotNull Commitable object) throws DBMSException {
        object.commit();
    }

    /**
     * Delete db.
     *
     * @throws Exception the exception
     */
    protected static void deleteDB() throws Exception {
        FileUtils.deleteDirectory(new File(homeDirectory));

        new DBEngine();
    }
}
