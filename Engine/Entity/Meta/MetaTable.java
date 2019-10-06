package Entity.Meta;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;

@JsonRootName(value = "MetaTable")
public class MetaTable {
    private String name;
    private long totalRows;
    private ArrayList<MetaColumn> columns;
    private MetaColumn primaryKey;

    public MetaTable(String name) {
        this.name = name;
        columns = new ArrayList<>();
        totalRows = 0;
    }

    public MetaTable(String name, ArrayList<MetaColumn> columns, MetaColumn primaryKey, long totalRows) {
        this.name = name;
        this.columns = columns;
        this.primaryKey = primaryKey;
        this.totalRows = totalRows;
    }

    public MetaTable(String name, ArrayList<MetaColumn> columns, MetaColumn primaryKey) {
        this.name = name;
        this.columns = columns;
        this.primaryKey = primaryKey;
        this.totalRows = 0;
    }

    public MetaTable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(long totalRows) {
        this.totalRows = totalRows;
    }

    public ArrayList<MetaColumn> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<MetaColumn> columns) {
        this.columns = columns;
    }

    public MetaColumn getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(MetaColumn primaryKey) {
        this.primaryKey = primaryKey;
    }
}
