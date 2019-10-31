package teststucture.tests

class SkipTest:BaseTest() {

    override fun checkTest(sqlquery: String) {
        super.checkTest(sqlquery)
        conclusion=TestResult.NT

    }

    override fun getExpected(): String {
        return "@skip\n"
    }
}