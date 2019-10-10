package teststucture

enum class TestResult{
    WA,
    WE,
    OK,
    SWA,
    NT;

    override fun toString(): String{
        when(this)
        {
            NT -> {return "Not tested"}
            OK -> {return "OK"}
            SWA -> {return "OK, get WA"}
            WE -> {return "Wrong error"}
            WA -> {return "Wrong answer"}
        }
    }

}
abstract class BaseTest(var name:String) {
    var conclusion: TestResult = TestResult.NT
    lateinit var type: TestType
    var selected: Boolean = true
    abstract fun checkTest()
}