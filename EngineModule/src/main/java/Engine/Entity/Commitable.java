package Engine.Entity;

import Engine.Exceptions.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

@JsonIgnoreProperties(value = {"path"})
public abstract class Commitable implements Serializable {

    public abstract void commit() throws DBMSException;

    protected abstract String getPath();

    protected void saveToJSON() throws DBMSException {
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(getPath()), this);
        } catch (IOException e) {
            throw new DBMSException("Could not create file: \n" + e.getMessage());
        }
    }
}
