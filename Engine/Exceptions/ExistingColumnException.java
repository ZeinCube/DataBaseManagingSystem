package Exceptions;

import Entity.Meta.MetaColumn;
import Entity.Meta.MetaTable;

public class ExistingColumnException extends DBMSException {

    public ExistingColumnException(MetaColumn column, MetaTable table) {
        super("Table " + table.getName() + " already contains column \"" + column.getColumnName() + "\"");
    }

    public ExistingColumnException(String s) {
        super(s);
    }
}
