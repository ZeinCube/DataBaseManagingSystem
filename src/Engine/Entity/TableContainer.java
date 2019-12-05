package Engine.Entity;

import java.util.HashMap;

public class TableContainer {
    private HashMap<Integer, Row> rows;

    public TableContainer setRows(HashMap<Integer, Row> rows) {
        this.rows = rows;

        return this;
    }

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
