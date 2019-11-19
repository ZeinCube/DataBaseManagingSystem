package teststucture.tests

import javafx.scene.layout.Region
import teststucture.queryresults.BaseRes
import teststucture.queryresults.VoidRes
import clientsevrver.DBClient
import myjavafxblocks.SingleTestDescription


class SingleQueryTest(val sqlQuery: String, var expected:BaseRes,client: DBClient):BaseTest(client) {
    override fun getResult(): String {
        return expected.getExpected().toString()
    }

    var resultDBMS:BaseRes = VoidRes()
    var resultMySQL:BaseRes = VoidRes()

    override fun execute() {

        resultMySQL = BaseRes.parseMySQLResult(client.SendMySQL(sqlQuery))
        //todo conclusion = TestResult.compare(resultDBMS,expected)
        for (i in postSQLQueries)
            i.execute(client)
    }

    override fun getView(): Region {
        return SingleTestDescription(this)
    }

}