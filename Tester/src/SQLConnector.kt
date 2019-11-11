import java.sql.*
import java.util.*

class DataBase{

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
            val stmt = conn.createStatement()
            stmt!!.executeUpdate("drop database if exists test")
            stmt.executeUpdate("create database test")
            stmt.executeUpdate("use test")
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
    }

    fun SendToSQL(s:String):Any
    {
        var stmt: Statement? = null
        var rs: ResultSet? = null
            stmt = conn.createStatement()
            try {
                rs = stmt!!.executeQuery(s)
                return rs!!;
            }catch (ex:SQLException)
            {
                if (ex.message == "Can not issue data manipulation statements with executeQuery().")
                {
                    stmt!!.executeUpdate(s)
                    return true;
                }else
                return ex
            }
    }



}
