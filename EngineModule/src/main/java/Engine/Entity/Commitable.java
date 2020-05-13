package Engine.Entity;

import Engine.Exceptions.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 * The type Commitable.
 */
@JsonIgnoreProperties(value = {"path"})
public abstract class Commitable implements Serializable {

    /**
     * Commit.
     *
     * @throws DBMSException the dbms exception
     */
    public abstract void commit() throws DBMSException;

    /**
     * Gets path.
     *
     * @return the path
     */
    protected abstract String getPath();

    /**
     * Save to json.
     *
     * @throws DBMSException the dbms exception
     */
    protected void saveToJSON() throws DBMSException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(getPath()), this);
        } catch (IOException e) {
            throw new DBMSException("Could not create file: \n" + e.getMessage());
        }
    }
}
