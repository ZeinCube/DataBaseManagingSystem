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
        var rs: ResultSet? = null
        var res:String = ""
        try {
            stmt = conn.createStatement()
            try {
                rs = stmt!!.executeQuery(s)
                val rsmd = rs?.getMetaData()
                val columnsNumber = rsmd?.getColumnCount()
                while (rs!!.next()) {
                    for (i in 1..columnsNumber!!) {
                        if (i > 1) res = res + (",  ")
                        val columnValue = rs.getString(i)
                        res= res+(columnValue + " " + rsmd.getColumnName(i))
                    }
                    res = res+ "\n"
                }
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
                            res = this.SendToSQL(s)
                        }
                    }
                }else
                throw ex
            }

        } catch (ex: SQLException) {
            throw ex
        }
        return res
    }



}
