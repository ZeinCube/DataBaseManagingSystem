package teststucture.tests

import javafx.scene.layout.Region
import clientsevrver.DBClient

abstract class BaseTest(var client: DBClient) {
    enum class TestResult {
        WA,
        WE,
        OK,
        NT;

        public infix fun and(other: TestResult): TestResult {
            when (this) {
                NT -> {
                    return other
                }
                OK -> {
                    when (other) {
                        NT -> {
                            return OK
                        }
                        OK -> {
                            return OK
                        }
                        WE -> {
                            return WE
                        }
                        WA -> {
                            return WA
                        }
                    }
                }
                WA -> {

                    when (other) {
                        WE -> {
                            return WE
                        }
                        else -> {
                            return WA
                        }
                    }
                }
                WE -> {
                    return WE
                }
            }
        }

        override fun toString(): String {
            when (this) {
                NT -> {
                    return "Not tested"
                }
                OK -> {
                    return "OK"
                }
                WE -> {
                    return "Wrong error"
                }
                WA -> {
                    return "Wrong answer"
                }
            }
        }
    }

    abstract fun execute()
    abstract fun getView(): Region

    var postSQLQueries : Array<SQLQuery> = arrayOf()
    var selected: Boolean = true
    var conclusion: TestResult = TestResult.NT

    fun addSQLQuery(sql:SQLQuery)
    {
        postSQLQueries+=sql
    }
    abstract fun getResult():String
}