package teststucture.queryresults

import teststucture.tests.BaseTest

class VoidRes: BaseRes() {
    override fun compare(other: BaseRes): BaseTest.TestResult {
        return if (other is VoidRes) {
            BaseTest.TestResult.NT
        } else {
            if (other is ErrorRes)
                BaseTest.TestResult.WE
            else
                BaseTest.TestResult.WA
        }
    }

    override fun toString(): String {
        return "@void"
    }
}