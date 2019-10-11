package Entity.Meta;

public class MetaColumn<T> {
    private String columnName;
    private T type;
    private boolean UNIQUE;
    private boolean PRIMARY_KEY;

    public MetaColumn(String columnName, T type, boolean unique, boolean primary_key) {
        this.columnName = columnName;
        this.type = type;
        UNIQUE = unique;
        PRIMARY_KEY = primary_key;
    }

    public MetaColumn() {
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public boolean isUNIQUE() {
        return UNIQUE;
    }

    public void setUNIQUE(boolean UNIQUE) {
        this.UNIQUE = UNIQUE;
    }

    public boolean isPRIMARY_KEY() {
        return PRIMARY_KEY;
    }

    public void setPRIMARY_KEY(boolean PRIMARY_KEY) {
        this.PRIMARY_KEY = PRIMARY_KEY;
    }
}
