package teststucture.queryresults

import teststucture.tests.BaseTest

class ExecutedRes:BaseRes() {
    override fun compare(other: BaseRes): BaseTest.TestResult {
        return if (other is ExecutedRes) {
                BaseTest.TestResult.OK
        } else {
            if (other is ErrorRes)
                BaseTest.TestResult.WE
            else
                BaseTest.TestResult.WA
        }
    }

    override fun toString(): String {
        return "@executed"
    }
}