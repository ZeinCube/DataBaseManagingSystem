package teststucture.queryresults

import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.layout.Region
import javafx.scene.layout.VBox
import teststucture.tests.BaseTest

class ErrorRes(val exception: String, val what: String) : BaseRes() {
    override fun compare(other: BaseRes): BaseTest.TestResult {
        return if (other is ErrorRes) {
            if ((other.exception == exception) and (other.what == other.what))
                BaseTest.TestResult.OK
            else
                BaseTest.TestResult.WE
        } else {
            BaseTest.TestResult.WA
        }
    }

    override fun toString(): String {
        return "@error: \"${exception}\" \"${what}\""
    }
}