package controller
enum class TestType{
    group,
    test,
    root
}
class Test(val name: String, val result: String, val _in: Array<String>? = null, val _out: Array<String>? = null, val type: TestType)

