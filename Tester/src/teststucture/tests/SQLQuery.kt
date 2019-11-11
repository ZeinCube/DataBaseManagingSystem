package teststucture.tests

import javafx.scene.layout.Region
import teststucture.queryresults.BaseRes
import DataBase
open class SQLQuery(sqlquery: String) {

    var sqlQuery : String? = sqlquery
    fun execute(dataBase: DataBase) {
        dataBase.SendToSQL(sqlQuery!!)
        //todo Запуск на нашей БД
    }

}