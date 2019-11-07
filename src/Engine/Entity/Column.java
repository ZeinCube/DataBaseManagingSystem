package Engine.Entity;

import Engine.Entity.Meta.MetaColumn;

import java.io.Serializable;
import java.util.Objects;

public class Column implements Serializable {

    private String columnName;
    private boolean UNIQUE;
    private boolean PRIMARY_KEY;
    private Class valueClass;

    public Column(String columnName, Class valueClass, boolean unique, boolean primaryKey) {
        PRIMARY_KEY = primaryKey;

        this.valueClass = valueClass;

        UNIQUE = primaryKey || unique;

        this.columnName = columnName;
    }


    public Column(String columnName, Class valueClass, boolean primary_key) {
        PRIMARY_KEY = primary_key;

        this.valueClass = valueClass;

        UNIQUE = primary_key;

        this.columnName = columnName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Column) {
            result = Objects.equals(this.columnName, ((Column) obj).columnName);
        }

        return result;
    }

    public MetaColumn getMeta() {
        MetaColumn meta = new MetaColumn();
        meta.setPRIMARY_KEY(this.PRIMARY_KEY);
        meta.setColumnName(this.columnName);
        meta.setUNIQUE(this.UNIQUE);
        meta.setType(this.getValueClass());
        return meta;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnName() {
        return columnName;
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

    public Class getValueClass() {
        return valueClass;
    }

    public void setValueClass(Class valueClass) {
        this.valueClass = valueClass;
    }
}
