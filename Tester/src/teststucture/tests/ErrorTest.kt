package teststucture.tests

import java.lang.Exception

class ErrorTest(val exp_exception:String, val exp_what:String):BaseTest()
{
    override fun getExpected(): String {
        return "@error \"${exception}\";\"${what}\""
    }

    override fun checkTest(sqlquery:String) {
        super.checkTest(sqlquery)
        if(exception!="")
        {
            if (exp_exception!=exception)
            {
                if (exp_what!=what)
                {
                    conclusion = TestResult.WA
                }else
                {
                    conclusion=TestResult.OK
                }
                conclusion=TestResult.WE
            }
        }else{
            conclusion = TestResult.WA
        }
    }

}