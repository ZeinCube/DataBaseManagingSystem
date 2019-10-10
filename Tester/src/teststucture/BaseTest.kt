package teststucture

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

abstract class BaseTest(var name: String) {
    var conclusion: TestResult = TestResult.NT
    lateinit var type: TestType
    val a = true and false
    var selected: Boolean = true
    abstract fun checkTest()
}