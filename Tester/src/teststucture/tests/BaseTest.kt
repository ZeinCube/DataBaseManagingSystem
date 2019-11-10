package teststucture.tests

import java.lang.Exception
import DataBase
import javafx.scene.Node
import javafx.scene.layout.Region

enum class TestType {
    skip,
    error,
    simple;
}

enum class TestResult {
    WA,
    WE,
    OK,
    SWA,
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
                    SWA -> {
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
            SWA -> {
                return OK and other
            }
            WE -> {
                when (other) {
                    WA -> {
                        return WA
                    }
                    else -> {
                        return WE
                    }
                }
            }
            WA -> {
                return WA

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
            SWA -> {
                return "OK, get WA"
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


abstract class BaseTest {
    var exception: String = TestResult.NT.toString()
    var what: String = TestResult.NT.toString()
    var sqlquery: String = TestResult.NT.toString()
    var result: String = TestResult.NT.toString()
    var conclusion: TestResult = TestResult.NT
    lateinit var type: TestType
    var selected: Boolean = true

    open fun checkTest(sqlquery: String) {
        this.sqlquery = sqlquery
        try {
            result = "@string \n\" ${DataBase.SendToSQL(sqlquery)}\""
            exception = ""
            what = ""
        } catch (e: Throwable) {
            exception = e.javaClass.name
            what = e.message.toString()
            result = "@error \n\"${e.javaClass.name}\";\n\"${e.message}\""
        }
    }

    open fun getSQLQuery(): String {
        return sqlquery
    }

    open fun getSQLQueryResult(): String {
        return result
    }

    abstract fun getExpected():String

}




