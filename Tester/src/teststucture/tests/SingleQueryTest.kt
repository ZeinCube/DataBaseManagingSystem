package teststucture.tests

import javafx.scene.layout.Region
import teststucture.queryresults.BaseRes
import teststucture.queryresults.VoidRes
import DataBase
import myjavafxblocks.SingleTestDescription


class SingleQueryTest(val sqlQuery: String, var expected:BaseRes):BaseTest() {
    override fun getResult(): String {
        return expected.getExpected().toString()
    }

    var resultDBMS:BaseRes = VoidRes()
    var resultMySQL:BaseRes = VoidRes()

    override fun execute(dataBase: DataBase) {

        resultMySQL = BaseRes.parseMySQLResult(dataBase.SendToSQL(sqlQuery))
        //todo conclusion = TestResult.compare(resultDBMS,expected)
        for (i in postSQLQueries)
            i.execute(dataBase)
    }

    override fun getView(): Region {
        return SingleTestDescription(this)
    }

}