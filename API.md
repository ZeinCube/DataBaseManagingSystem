# DBMS API Documentation
To get api from engine just make an instance of one and call method `.getAPI();`

Example : 
`DBEngine engine = new DBEngine();`
`API api = new API();`
API has the next methods:
* `createTable(String tableName, Class primaryKeyClass, HashSet<Column> colums)`
    * tableName - is just name of new table
    * primaryKeyClass - is just type (e.g. int, string, ...) of primary key of table, it should be provided once or 
    exception will be thrown.
    * columns - unique array with columns. Column could be created with: `new Column(columnName, Class primaryKeyClass
    , Class valueClass, boolean unique, boolean primaryKey`.
        Note that unique is not needed if you already provided primary key = true
    
    ###### Returns string with message about creating table
        
* `showCreateTable(String tableName)`
    
    Returns script for creating table with provided name

* `dropTable(String tableName)`

    ######Returns string with message about dropping table
    