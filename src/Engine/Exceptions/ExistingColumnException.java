package Engine.Exceptions;


import Engine.Entity.Meta.MetaColumn;
import Engine.Entity.Meta.MetaTable;

public class ExistingColumnException extends DBMSException {

    public ExistingColumnException(MetaColumn column, MetaTable table) {
        super("Table " + table.getName() + " already contains column \"" + column.getColumnName() + "\"");
    }

    public ExistingColumnException(String s) {
        super(s);
    }
}
