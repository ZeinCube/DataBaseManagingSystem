package Entity.Meta;

import java.util.Objects;

public class MetaColumn {
    private String columnName;
    private Class type;
    private boolean UNIQUE;
    private boolean PRIMARY_KEY;

    public MetaColumn(String columnName, Class type, boolean unique, boolean primary_key) {
        this.columnName = columnName;
        this.type = type;
        UNIQUE = unique;
        PRIMARY_KEY = primary_key;
    }

    public MetaColumn() {
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof MetaColumn) {
            result = Objects.equals(this.columnName, ((MetaColumn) obj).columnName);
        }

        return result;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
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

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }
}
