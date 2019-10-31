package teststucture.tests

import java.lang.Exception

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


abstract class BaseTest() {
    lateinit var exception: String
    lateinit var what: String
    lateinit var sqlquery: String
    lateinit var result: String

    var conclusion: TestResult = TestResult.NT
    lateinit var type: TestType
    var selected: Boolean = true

    open fun checkTest(sqlquery: String) {
        this.sqlquery = sqlquery
        try {
            result = "@string \n\" ${DataBase.SendToSQL(sqlquery).replace("@", "\"@\"")}\""
            exception = ""
            what = ""
        } catch (e: Exception) {
            exception = e.javaClass.name
            what = e.message.toString()
            result = "@error \n\"${e.javaClass.name}\";\n\"${e.message}\""
        }
    }

    fun getSQLQuery(): String {
        return sqlquery
    }

    fun getSQLQueryResult(): String {
        return result
    }

    abstract fun getExpected(): String
}




