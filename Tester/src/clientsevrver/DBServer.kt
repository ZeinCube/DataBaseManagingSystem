package clientsevrver

import sun.awt.Mutex
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*


class DBServer {
    var clients: Array<DBClient> = arrayOf()

    lateinit var conn: Connection;
    companion object
    {
        @JvmStatic
        var mutex:Mutex = Mutex()
    }
    init {
        mutex.lock()
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
        try {
            //todo Создание сервера DBMS
        }catch (ex: java.lang.Exception)
        {

        }

        clearAll()
    }

    fun clearAll() {
        try {
            val stmt = conn.createStatement()
            stmt!!.executeUpdate("drop database if exists test")
            stmt.executeUpdate("create database test")
            stmt.executeUpdate("use test")
        } catch (ex: SQLException) {
            // handle any errors
            ex.printStackTrace()
        }
        try {
            //todo
        }catch (ex: java.lang.Exception)
        {
            //todo очищение DBMS

        }
    }

    fun createClient(name: String): DBClient {
        clients.plus(DBClient(name, this))
        return clients.last()
    }

    operator fun get(s: String): DBClient {
        if (clients.any { it.name == s }) {
            return clients.filter { it.name == s }.first()
        } else {
            return createClient(s)
        }
    }
    fun endServer()
    {
        clearAll()
        mutex.unlock()
    }
}