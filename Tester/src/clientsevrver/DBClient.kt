package clientsevrver

import java.sql.*
import java.util.*

class DBClient(var name:String,var server: DBServer) {
    lateinit var conn: Connection;
    init
    {
        val connectionProps = Properties()
        val username = "TestClient"
        val password = "Aa00000000"
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
            stmt.executeUpdate("use test")
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        } catch (ex: Exception) {
            // handle any errors
            ex.printStackTrace()
        }
        try {
            //todo conection to DBMS
        }catch (ex: Exception) {
        }


    }

    fun SendDBMS(s:String):Any{
        //todo SendDBMS
        return 0
    }

    fun SendMySQL(s:String):Any
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