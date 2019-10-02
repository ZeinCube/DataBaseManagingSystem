import Entity.MetaFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class DBEngine {
    private final String homeDirectory = System.getProperty("user.home") + "/.dbms";
    private MetaFile metaFile;

    public DBEngine() throws Exception {
        checkDirectory();
    }

    public void createDataBase(String name) throws Exception {
        if (isDataBaseExist(name)) {
            throw new Exception("Table with name \"" + name + "\" already exists");
        }

        File meta = new File(homeDirectory + "/meta-" + name + ".dbms");


    }

    private void checkDirectory() throws FileNotFoundException {
        File directory = new File(homeDirectory);

        if (!directory.exists()) {
            if (!directory.mkdir()) {
                throw new FileNotFoundException("Could not create directory");
            }
        }

    }

    private boolean isDataBaseExist(String name) throws Exception {
        checkDirectory();
        File mFile = new File(homeDirectory + "/meta-" + name + ".dbms");

        return !mFile.exists();
    }

    private String getContentOfFile(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fileInputStream.read(data);
        fileInputStream.close();
        return new String(data, StandardCharsets.UTF_8);
    }
}
