import java.io.File;
import java.io.FileNotFoundException;

public class DBEngine {
    private final String homeDirectory = System.getProperty("user.home") + "/.dbms";

    public void createDataBase(String name) {

    }

    public void checkFiles(String name) throws FileNotFoundException {

        File directory = new File(homeDirectory);

        if (!directory.exists()) {
            if (!directory.mkdir()) {
                throw new FileNotFoundException("Could not create directory");
            }
        }

        File metaFile = new File(homeDirectory + "/");
    }
}
