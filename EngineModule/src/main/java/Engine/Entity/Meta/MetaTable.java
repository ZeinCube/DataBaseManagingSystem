package Engine.Entity.Meta;

import Engine.Entity.Column;
import Engine.Entity.Table;
import Engine.Exceptions.DBMSException;
import Engine.Exceptions.ExistingColumnException;
import Engine.Exceptions.ExistingPrimaryKeyException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The type Meta table.
 */
@JsonRootName(value = "MetaTable")
@JsonIgnoreProperties(value = {"create"})
public class MetaTable {
    private String name;
    private List<MetaColumn> columns;
    private String fileTable;
    private BigInteger rowsCount;
    private long lastRowIndex;
    private long pagesCount;

    /**
     * Instantiates a new Meta table.
     *
     * @param table the table
     */
    public MetaTable(@NotNull Table table) {
        this.name = table.getName();
        columns = new ArrayList<>();

        for (Map.Entry<String, Column> entry : table.getColumns().entrySet()) {
            columns.add(entry.getValue().getMeta());
        }

        fileTable = table.getPath();
    }

    /**
     * Instantiates a new Meta table.
     *
     * @param name         the name
     * @param columns      the columns
     * @param fileTable    the file table
     * @param lastRowIndex the last row index
     * @param rowsCount    the rows count
     * @param pagesCount   the pages count
     */
    public MetaTable(
            String name,
            List<MetaColumn> columns,
            String fileTable,
            long lastRowIndex,
            BigInteger rowsCount,
            long pagesCount
    ) {
        this.name         = name;
        this.columns      = columns;
        this.fileTable    = fileTable;
        this.lastRowIndex = lastRowIndex;
        this.rowsCount    = rowsCount;
        this.pagesCount   = pagesCount;
    }

    /**
     * Instantiates a new Meta table.
     */
    public MetaTable() {
    }

    /**
     * Add column.
     *
     * @param column the column
     * @throws DBMSException the dbms exception
     */
    public void addColumn(MetaColumn column) throws DBMSException {
        if (columns.contains(column)) {
            throw new ExistingColumnException(column, this);
        }

        if (column.isPRIMARY_KEY()) {
            throw new ExistingPrimaryKeyException(column, this.name);
        }

        columns.add(column);
    }

    /**
     * Gets create.
     *
     * @return the create
     */
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

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets columns.
     *
     * @return the columns
     */
    public List<MetaColumn> getColumns() {
        return columns;
    }

    /**
     * Sets columns.
     *
     * @param columns the columns
     */
    public void setColumns(ArrayList<MetaColumn> columns) {
        this.columns = columns;
    }

    /**
     * Gets file table.
     *
     * @return the file table
     */
    public String getFileTable() {
        return fileTable;
    }

    /**
     * Sets file table.
     *
     * @param fileTable the file table
     */
    public void setFileTable(String fileTable) {
        this.fileTable = fileTable;
    }

    /**
     * Gets rows count.
     *
     * @return the rows count
     */
    public BigInteger getRowsCount() {
        return rowsCount;
    }

    /**
     * Sets rows count.
     *
     * @param rowsCount the rows count
     */
    public void setRowsCount(BigInteger rowsCount) {
        this.rowsCount = rowsCount;
    }

    /**
     * Gets last row index.
     *
     * @return the last row index
     */
    public long getLastRowIndex() {
        return lastRowIndex;
    }

    /**
     * Sets last row index.
     *
     * @param lastRowIndex the last row index
     */
    public void setLastRowIndex(long lastRowIndex) {
        this.lastRowIndex = lastRowIndex;
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
    public void setPagesCount(long pagesCount) {
        this.pagesCount = pagesCount;
    }
}
