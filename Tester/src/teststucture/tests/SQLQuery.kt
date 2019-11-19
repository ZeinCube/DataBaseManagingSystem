package teststucture.tests

import clientsevrver.DBClient

open class SQLQuery(sqlquery: String) {

    var sqlQuery : String = sqlquery
    fun execute(client: DBClient) {
        client.SendMySQL(sqlQuery!!)
        client.SendDBMS(sqlQuery!!)
        //todo Запуск на нашей БД
    }

}