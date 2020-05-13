package Engine.Entity;

import Engine.DBEngine;
import Engine.Exceptions.DamagedDataException;
import Engine.Exceptions.SaveException;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

/**
 * The type Table block container.
 */
public class TableBlockContainer implements Serializable {
    private final RandomAccessFile tableFile;
    private int pagesCount;

    /**
     * Instantiates a new Table block container.
     *
     * @param fileName   the file name
     * @param pagesCount the pages count
     * @throws FileNotFoundException the file not found exception
     */
    public TableBlockContainer(String fileName, int pagesCount) throws FileNotFoundException {
        this.tableFile  = new RandomAccessFile(fileName, "rwd");
        this.pagesCount = pagesCount;
    }

    /**
     * Gets iterator.
     *
     * @return the iterator
     */
    public RowIterator getIterator() {
        return new RowIterator(this, pagesCount);
    }

    /**
     * Gets pages count.
     *
     * @return the pages count
     */
    public long getPagesCount() {
        return pagesCount;
    }

    /**
     * Sets pages count.
     *
     * @param pagesCount the pages count
     */
    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    /**
     * Gets next page.
     *
     * @param index the index
     * @return the next page
     * @throws DamagedDataException the damaged data exception
     */
    public Page getPageByIndex(int index) throws DamagedDataException {
        try {
            byte[] bytes = new byte[DBEngine.PAGE_SIZE];
            tableFile.read(bytes, (DBEngine.PAGE_SIZE * index + 1), DBEngine.PAGE_SIZE);

            return new Page(bytes, index);
        } catch (IOException e) {
            throw new DamagedDataException("Error occurred while reading table : " + e.getMessage());
        }
    }

    /**
     * Write page.
     *
     * @param page the page
     */
    public void writePage(@NotNull Page page) throws SaveException {
        try {
            if (page.getPositionInFile() > -1 && page.getPositionInFile() * DBEngine.PAGE_SIZE + 1 < tableFile.length()) {
                tableFile.seek(page.getPositionInFile() * DBEngine.PAGE_SIZE + 1);
            } else {
                tableFile.seek(tableFile.length());
            }

            tableFile.write(page.toBytes());
        } catch (IOException e) {
            throw new SaveException("Error occurred while saving page");
        }
    }
}
