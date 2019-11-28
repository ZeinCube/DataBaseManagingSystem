package teststucture.queryresults

import teststucture.tests.BaseTest

class StringRes(val expect: String) : BaseRes() {
    override fun compare(other: BaseRes): BaseTest.TestResult {
        return if (other is StringRes) {
            if (other.expect == expect)
                BaseTest.TestResult.OK
            else
                BaseTest.TestResult.WA
        } else {
            if (other is ErrorRes)
                BaseTest.TestResult.WE
            else
                BaseTest.TestResult.WA
        }
    }

    override fun toString(): String {
        return "@string: \"${expect}\""
    }

}