package Engine.Entity;

import Engine.Entity.Meta.MetaColumn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * The type Column.
 */
public class Column implements Serializable {

    private String columnName;
    private boolean UNIQUE;
    private boolean PRIMARY_KEY;
    private Class valueClass;
    private ArrayList<Cell> values;

    /**
     * Instantiates a new Column.
     *
     * @param columnName the column name
     * @param valueClass the value class
     * @param unique     the unique
     * @param primaryKey the primary key
     */
    public Column(String columnName, Class valueClass, boolean unique, boolean primaryKey) {
        PRIMARY_KEY = primaryKey;

        this.valueClass = valueClass;
        this.columnName = columnName;

        UNIQUE = primaryKey || unique;

    }


    /**
     * Instantiates a new Column.
     *
     * @param columnName  the column name
     * @param valueClass  the value class
     * @param primary_key the primary key
     */
    public Column(String columnName, Class valueClass, boolean primary_key) {
        PRIMARY_KEY = primary_key;

        this.valueClass = valueClass;
        this.columnName = columnName;

        UNIQUE = primary_key;

    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof Column) {
            result = Objects.equals(this.columnName, ((Column) obj).columnName);
        }

        return result;
    }

    /**
     * Gets meta.
     *
     * @return the meta
     */
    public MetaColumn getMeta() {
        MetaColumn meta = new MetaColumn();
        meta.setPRIMARY_KEY(this.PRIMARY_KEY);
        meta.setColumnName(this.columnName);
        meta.setUNIQUE(this.UNIQUE);
        meta.setType(this.getValueClass());
        return meta;
    }

    /**
     * Sets values.
     *
     * @param values the values
     */
    public void setValues(ArrayList<Cell> values) {
        this.values = values;
    }

    /**
     * Add value.
     *
     * @param value the value
     */
    public void addValue(Cell value) {
        this.values.add(value);
    }

    /**
     * Delete value.
     *
     * @param value the value
     */
    public void deleteValue(Cell value) {
        this.values.remove(value);
    }

    /**
     * Gets values.
     *
     * @return the values
     */
    public ArrayList<Cell> getValues() {
        return values;
    }

    /**
     * Sets column name.
     *
     * @param columnName the column name
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Gets column name.
     *
     * @return the column name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Is unique boolean.
     *
     * @return the boolean
     */
    public boolean isUNIQUE() {
        return UNIQUE;
    }

    /**
     * Sets unique.
     *
     * @param UNIQUE the unique
     */
    public void setUNIQUE(boolean UNIQUE) {
        this.UNIQUE = UNIQUE;
    }

    /**
     * Is primary key boolean.
     *
     * @return the boolean
     */
    public boolean isPRIMARY_KEY() {
        return PRIMARY_KEY;
    }

    /**
     * Gets value class.
     *
     * @return the value class
     */
    public Class getValueClass() {
        return valueClass;
    }

    /**
     * Sets value class.
     *
     * @param valueClass the value class
     */
    public void setValueClass(Class valueClass) {
        this.valueClass = valueClass;
    }
}
