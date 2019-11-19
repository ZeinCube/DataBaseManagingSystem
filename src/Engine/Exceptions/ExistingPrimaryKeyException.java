package Engine.Exceptions;


import Engine.Entity.Meta.MetaColumn;

public class ExistingPrimaryKeyException extends DBMSException {

    public ExistingPrimaryKeyException(MetaColumn column, String tableName) {
        super("Table " + tableName + " could not contain two or more primary keys : column \""
                + column.getColumnName()
                + "\" is provided as primary key");
    }
}
