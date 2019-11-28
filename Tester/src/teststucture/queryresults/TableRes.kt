package teststucture.queryresults

import javafx.scene.control.Tab
import teststucture.tests.BaseTest

class TableRes(var table: Table): BaseRes() {
    override fun compare(other: BaseRes): BaseTest.TestResult {
        return if (other is TableRes) {
            if (other.table == table)
                BaseTest.TestResult.OK
            else
                BaseTest.TestResult.WA
        } else {
            if (other is ErrorRes)
                BaseTest.TestResult.WE
            else
                BaseTest.TestResult.WA
        }
    }

    override fun toString(): String {
        return "@table \n ${table}"
    }

}