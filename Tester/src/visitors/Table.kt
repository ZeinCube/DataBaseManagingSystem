package visitors

class Table {
    enum class ColumnType
    {

    }
    class Column(var name:String,var type:ColumnType)
    {

    }
    private var columns :Array<ColumnType> = arrayOf()
    private var records :Array<Array<String>> = arrayOf()
    constructor(ctx:String)
    {

    }
    override fun toString():String
    {
        return ""
    }
}