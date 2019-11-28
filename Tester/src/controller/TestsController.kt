package controller

import javafx.fxml.FXML
import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.layout.*
import javafx.beans.property.StringProperty
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.text.Font
import javafx.scene.text.Text
import javafx.stage.Stage
import teststucture.hierarchy.TestScript
import java.net.URL
import java.util.*


class TestsController(var testScript: TestScript):Initializable {
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        initialize()
    }

    @FXML
    lateinit var mainBox: VBox

    private var testsDescrAreas : Array<Region> = arrayOf();

        lateinit var nameBox : TextArea

        val layout: String = "/res/codeInfo.fxml"
        fun showcode()
        {
                val loader = FXMLLoader(javaClass.getResource(layout))

                // Create a controller instance
                val controller = CodeController(testScript)
                // Set it in the FXMLLoader
                loader.setController(controller)
                val flowPane = loader.load<AnchorPane>()
                val scene = Scene(flowPane)
                val testStage = Stage()
                testStage.scene = scene
                testStage.show()

        }

        fun save(){
            testScript.update(nameBox.text.trim(),null,true)
        }

        fun retest(){
            save()
            testScript.checkTests(true)
        }

        fun updateScene()
        {
            val c = mainBox.children[0];
            mainBox.children.removeAll(mainBox.children)
            mainBox.children.add(c)
            testsDescrAreas= arrayOf()
            for (i in testScript.tests)
                testsDescrAreas= testsDescrAreas+i.getView()
            mainBox.children.addAll(testsDescrAreas)
            mainBox.children.addAll(Text(" "))
            mainBox.isVisible = false
            mainBox.isVisible = true
        }

        fun initialize() {
            nameBox = TextArea(testScript.name)
            nameBox.maxHeight = 26.0
            nameBox.minHeight = 26.0
            nameBox.maxWidth = 150.0
            nameBox.textProperty().addListener {
                observable, oldValue, newValue ->
                (observable as StringProperty).value = if (newValue.matches(Regex("[ a-zA-Z0-9а-яА-Я]*"))) {
                    newValue
                } else
                    oldValue
            }
            testScript.selected = true
            HBox.setMargin(nameBox, Insets(2.0, 0.0, 0.0, 13.0))

            val saveBtn = Button("Save Test")
            val retestBtn = Button("Save and Retest")
            val updateBtn = Button("Update")
            val showCodeBtn = Button("Show code")
            val setToMySQLBtn = Button("Set to MySQL")
            val setToDBMSBtn = Button("Set to DBMS")

            saveBtn.setOnAction { save() }
            retestBtn.setOnAction { retest() }
            updateBtn.setOnAction { updateScene() }
            showCodeBtn.setOnAction { showcode() }
            setToDBMSBtn.setOnAction {
                for (i in testScript.tests)
                {
                    i.setToDBMS()
                }
            }
            setToMySQLBtn.setOnAction {
                for (i in testScript.tests)
                {
                    i.setToMySQL()
                }
            }

            val btnBox = HBox(saveBtn,retestBtn,showCodeBtn,updateBtn,VBox(setToDBMSBtn,setToMySQLBtn))
            HBox.setMargin(retestBtn, Insets(0.0, 0.0, 0.0, 20.0))
            btnBox.alignment = Pos.BASELINE_RIGHT
            val lb = Label("Test name:")
            lb.font = Font.font("System",14.0)
            HBox.setMargin(lb, Insets(4.0, 0.0, 0.0, .0))
            HBox.setMargin(nameBox, Insets(4.0, 0.0, 0.0, 13.0))
            VBox.setMargin(setToMySQLBtn,Insets(4.0, 0.0, 0.0, 0.0))
            val pane = HBox(lb,nameBox,btnBox)
            HBox.setMargin(btnBox, Insets(4.0, 0.0, 0.0, 200.0))

            mainBox.children.addAll(pane)

            updateScene()

        }

}
