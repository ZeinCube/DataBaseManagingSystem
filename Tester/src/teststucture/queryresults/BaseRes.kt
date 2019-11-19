package teststucture.queryresults

import javafx.scene.layout.Region
import parser.ParseToTree
import parser.sqlqueryresultparser.QueryResultLexer
import parser.sqlqueryresultparser.QueryResultParser
import visitors.ResVisitor
import java.lang.Exception
import java.sql.ResultSet


abstract class BaseRes {

/*
    var exception: String = TestResult.NT.toString()
    var what: String = TestResult.NT.toString()
    var sqlquery: String = TestResult.NT.toString()
    var result: String = TestResult.NT.toString()
*/
    var newExpected : BaseRes? = null;

    fun setExpected(s:String)
    {
        try {
            newExpected = parseMyResult(s)
        }catch (ex:Exception)
        {
            newExpected = null
        }
    }
    fun setExpected(e: BaseRes)
    {
        newExpected = e
    }

    fun getExpected():BaseRes
    {
        if (newExpected != null)
        {
            return newExpected!!
        }
        return this
    }

    abstract override fun toString(): String
    companion object{
        fun parseDBMSResult(s:String):BaseRes?
        {
            return null//todo парсинг их выражиний
        }
        fun parseMyResult(s:String):BaseRes
        {
            return ResVisitor().visit(ParseToTree(s,QueryResultParser::class.java,QueryResultLexer::class.java))[0]
        }
        fun parseMySQLResult(rs:Any):BaseRes
        {
            var res = ""
            if (rs is ResultSet) {
                val rsmd = rs.getMetaData()
                val columnsNumber = rsmd?.getColumnCount()
                while (rs.next()) {
                    for (i in 1..columnsNumber!!) {
                        if (i > 1) res = res + (",  ")
                        val columnValue = rs.getObject(i).toString()
                        res = res + (columnValue + " " + rsmd.getColumnName(i))
                    }
                    res = res + "\n"
                }
                return VoidRes();
            }
            if (rs is Boolean)
            {
                return ExecutedRes()
            }
            if (rs is Exception)
            {
                if (rs.message!=null)
                    return ErrorRes(rs.javaClass.name,rs.message!!)
                else
                    return ErrorRes(rs.javaClass.name,"")

            }
            throw Exception("WTF")
        }

    }
}



