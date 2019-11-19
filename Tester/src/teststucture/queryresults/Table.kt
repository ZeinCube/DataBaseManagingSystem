package teststucture.queryresults

import MySQLRealGetString
import parser.parseQueryResult
import visitors.TableVisitor

class Table() {
    constructor(s:String) : this() {
        val res = TableVisitor().visit(parseQueryResult("@table\n"+s,"rq_table"))!!
        columns=res.columns
        records=res.records
    }
    class Record()
    {
        var values:Array<String> = arrayOf()
        override fun toString(): String {
            return "\n"+values.joinToString(" ")
        }
        operator fun get(i:Int):String
        {
            while(i>=values.size)
            {
                values+="NULL"
            }
            return MySQLRealGetString(values[i])
        }
        operator fun plus(s: Any)
        {
            values += s.toString()
        }
    }
    var columns :Array<String> = arrayOf()
    var records :Array<Record> = arrayOf()
    operator fun plus(s: String)
    {
        columns += s
    }
    operator fun plus(s: Record)
    {
        records += s
    }
    operator fun get(i:Int):Record
    {
        return records[i]
    }
    override fun toString():String
    {
        return columns.joinToString (" ")+records.joinToString("")
    }
}