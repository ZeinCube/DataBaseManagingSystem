package controller

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import teststucture.hierarchy.TestScript
import java.net.URL
import java.util.*

class CodeController(val test: TestScript): Initializable {
    @FXML
    lateinit var codearea: TextArea
    @FXML
    lateinit var savebtn: Button

    fun save()
    {
        test.update(null,codearea.text);
    }


    override fun initialize(location: URL?, resources: ResourceBundle?) {
        codearea.text = test.code
    }
}