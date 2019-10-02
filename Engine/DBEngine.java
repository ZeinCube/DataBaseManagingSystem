import Entity.MetaFile;

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

    private void checkDirectory() throws FileNotFoundException {
        File directory = new File(homeDirectory);

        if (!directory.exists()) {
            if (!directory.mkdir()) {
                throw new FileNotFoundException("Could not create directory");
            }
        }

        System.out.println("Directory " + homeDirectory + " exists");
    }

    private boolean isDataBaseExist(String name) throws Exception {
        checkDirectory();
        File mFile = new File(homeDirectory + "/meta-" + name + ".dbms");

        return mFile.exists();
    }
}
