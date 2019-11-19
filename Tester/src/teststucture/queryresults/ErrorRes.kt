package teststucture.queryresults

import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.layout.Region
import javafx.scene.layout.VBox

class ErrorRes(val exception:String, val what:String): BaseRes() {
    override fun toString(): String {
        return "@error: \"${exception}\" \"${what}\""
    }
}