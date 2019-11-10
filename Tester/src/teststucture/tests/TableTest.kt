package teststucture.tests

import source.Table

class TableTest:BaseTest() {
    lateinit var table:Table;
    override fun getExpected(): String {
        return table.toString()
    }
}