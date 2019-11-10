package teststucture.tests

class StringTest(val expect:String): BaseTest() {

    override fun getExpected(): String {
        return expect
    }
    override fun checkTest(sqlquery:String) {
        super.checkTest(sqlquery)
        if (result==expect){
            conclusion=TestResult.OK
        }else
        {
            conclusion=TestResult.WA
        }
    }


}