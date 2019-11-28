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
        fun getInstance():DBServer
        {
            mutex.lock()
            _instance = DBServer()
            return _instance
        }
        fun returnInstance()
        {
            _instance.endServer()
            mutex.unlock()
        }
        private lateinit var _instance:DBServer
    }
    init {
        val connectionProps = Properties()
        connectionProps["user"] = "root"
        connectionProps["password"] = ""
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
        for (i in clients)
        {
            i.conn.close()
            //todo Удаление наши клиентов и сервера
        }
        clearAll()
        conn.close()
    }
}