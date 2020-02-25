package Engine.Entity;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.HashMap;

public class TableContainer {
    private HashMap<Integer, Row> rows;
    private RandomAccessFile tableFile;

    public TableContainer setRows(HashMap<Integer, Row> rows) {
        this.rows = rows;

        return this;
    }

    public TableContainer(String fileName) throws FileNotFoundException {
        this.tableFile = new RandomAccessFile(fileName, "rw");
    }
//
//    public Row getRow() {
//
//    }

    public TableContainer addRow(Row row, int id) {
        this.rows.put(id, row);

        return this;
    }

    public TableContainer removeRow(int id) {
        this.rows.remove(id);

        return this;
    }

    public HashMap<Integer, Row> getRows() {
        return rows;
    }
}
