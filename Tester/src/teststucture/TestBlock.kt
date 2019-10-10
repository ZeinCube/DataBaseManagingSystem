package teststucture

class TestBlock:BaseTest {
    lateinit var test:String
    lateinit var expect:String
    constructor(s1:String,s2:String) : super("")
    {
        test = s1
        expect = s2
        conclusion = TestResult.NT
    }
    var result:String = ""
    fun update(s1:String,s2:String)
    {
        test = s1
        expect = s2
        update()
    }
    private fun update()
    {

    }
    override fun checkTest()
    {

    }
}