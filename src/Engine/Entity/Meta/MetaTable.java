package Engine.Entity.Meta;

import Engine.Entity.Column;
import Engine.Entity.Table;
import Engine.Exceptions.DBMSException;
import Engine.Exceptions.ExistingColumnException;
import Engine.Exceptions.ExistingPrimaryKeyException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@JsonRootName(value = "MetaTable")
@JsonIgnoreProperties(value = {"create"})
public class MetaTable {
    private String name;
    private List<MetaColumn> columns;
    private Class primaryKeyClass;
    private String fileTable;
    private int rowSize; //size of row in bytes

    public MetaTable(Table table) {
        this.name = table.getName();
        columns = new ArrayList<>();

        for (Map.Entry<String, Column> entry : table.getColumns().entrySet()) {
            columns.add(entry.getValue().getMeta());
        }

        this.primaryKeyClass = table.getPrimaryKeyClass();
        fileTable = table.getPath();
//        rowSize =
    }

    public MetaTable(String name, List<MetaColumn> columns, Class primaryKeyClass, String fileTable) {
        this.name = name;
        this.columns = columns;
        this.primaryKeyClass = primaryKeyClass;
        this.fileTable = fileTable;
    }

    public MetaTable() {
    }

    public void addColumn(MetaColumn column) throws DBMSException {
        if (columns.contains(column)) {
            throw new ExistingColumnException(column, this);
        }

        if (column.isPRIMARY_KEY()) {
            throw new ExistingPrimaryKeyException(column, this.name);
        }

        columns.add(column);
    }

    public String getCreate() {
        StringBuilder builder = new StringBuilder();

        builder.append("CREATE TABLE ").
                append(name).
                append("( \n");

        for (MetaColumn column : columns) {
            String columnClass = column.getType().getName();
            builder
                    .append(column.getColumnName()).append(' ')
                    .append(columnClass.substring(columnClass.lastIndexOf(".") + 1))
            ;

            if (column.isUNIQUE() && !column.isPRIMARY_KEY()) {
                builder.append(" UNIQUE");
            }

            if (column.isPRIMARY_KEY()) {
                builder.append(" PRIMARY KEY");
            }

            if (columns.indexOf(column) != columns.size() - 1) {
                builder.append(", \n");
            }
        }

        builder.append("\n );");

        return builder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MetaColumn> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<MetaColumn> columns) {
        this.columns = columns;
    }

    public Class getPrimaryKeyClass() {
        return primaryKeyClass;
    }

    public void setPrimaryKeyClass(Class primaryKeyClass) {
        this.primaryKeyClass = primaryKeyClass;
    }

    public String getFileTable() {
        return fileTable;
    }

    public void setFileTable(String fileTable) {
        this.fileTable = fileTable;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

//    public int calculateRowSize()
//    {
//        for (Map.Entry<>)
//    }
}
