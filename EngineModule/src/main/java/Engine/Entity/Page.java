package Engine.Entity;

import Engine.DBEngine;
import Engine.Exceptions.DamagedDataException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Page.
 */
public class Page{
    private int positionInFile;
    private int freeBytes = DBEngine.PAGE_SIZE;
    private boolean changed = false;
    private ArrayList<Row> rows;

    /**
     * Instantiates a new Page.
     *
     * @param data           the data
     * @param positionInFile the position in file
     * @throws DamagedDataException the damaged data exception
     */
    public Page(byte[] data, int positionInFile) throws DamagedDataException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
        } catch (IOException e) {
            throw new DamagedDataException("Error occurred while reading page with data: " + e.getMessage());
        }

        this.positionInFile = positionInFile;

        try {
            rows = (ArrayList) objectInputStream.readObject();
            freeBytes -= data.length;
        } catch (IOException | ClassNotFoundException e) {
            throw new DamagedDataException("Error occurred while reading page with data: " + e.getMessage());
        }
    }

    /**
     * To bytes byte [ ].
     *
     * @return the byte [ ]
     */
    public byte[] toBytes() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(DBEngine.PAGE_SIZE);
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(baos, rows);
            baos.close();
        } catch (IOException ignored) {}

        return baos.toByteArray();
    }

    /**
     * Has space for boolean.
     *
     * @param row the row
     * @return the boolean
     */
    public boolean hasSpaceFor(Row row) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(8);

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(baos, row);
            baos.close();
        } catch (IOException ignored) {}

        return freeBytes - baos.toByteArray().length >= 0;
    }

    /**
     * Insert row boolean.
     *
     * @param row the row
     * @return the boolean
     */
    public boolean insertRow(Row row) {
        if (hasSpaceFor(row)) {
            rows.add(row);

            return true;
        } else {
            return false;
        }
    }

    /**
     * Delete row boolean.
     *
     * @param index the index
     * @return the boolean
     */
    public boolean deleteRow(int index) {
        rows.remove(index);

        return true;
    }

    /**
     * Gets rows.
     *
     * @return the rows
     */
    public List<Row> getRows() {
        return rows;
    }

    /**
     * Sets rows.
     *
     * @param rows the rows
     */
    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    /**
     * Sets changed.
     *
     * @param changed the changed
     */
    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    /**
     * Is changed boolean.
     *
     * @return the boolean
     */
    public boolean isChanged() {
        return changed;
    }

    /**
     * Gets position in file.
     *
     * @return the position in file
     */
    public int getPositionInFile() {
        return positionInFile;
    }

    /**
     * Sets position in file.
     *
     * @param positionInFile the position in file
     */
    public void setPositionInFile(int positionInFile) {
        this.positionInFile = positionInFile;
    }
}
