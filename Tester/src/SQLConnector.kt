import java.sql.*
import java.util.*

object DataBase{

    lateinit var conn:Connection;

    init
    {
        val connectionProps = Properties()
        val username = "root"
        val password = "18012000dZ"
        connectionProps.put("user", username)
        connectionProps.put("password", password)
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection(
                    "jdbc:" + "mysql" + "://" +
                            "127.0.0.1" +
                            ":" + "3306" + "/" +
                            "",
                    connectionProps)
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
    }

    fun SendToSQL(s:String):String
    {
        var stmt: Statement? = null
        var resultset: ResultSet? = null
        var res:String = ""
        try {
            stmt = conn.createStatement()
            try {
                resultset = stmt!!.executeQuery(s)
                res = resultset.toString()
            }catch (ex:SQLException)
            {
                if (ex.message == "Can not issue data manipulation statements with executeQuery().")
                {
                    try {
                        stmt!!.executeUpdate(s)
                        res = "executed"
                    }catch (ex:SQLException)
                    {
                        if(ex.message=="No database selected")
                        {
                            stmt!!.executeUpdate("drop database if exists test")
                            stmt!!.executeUpdate("create database test")
                            stmt!!.executeUpdate("use test")
                            stmt!!.executeUpdate(s)
                            res = "executed"
                        }
                    }
                }else
                throw ex
            }

        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
            throw ex
        }
        return res
    }



}
