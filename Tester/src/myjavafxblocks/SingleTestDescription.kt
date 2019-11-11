package myjavafxblocks

import controller.CodeController
import controller.ShowControler
import javafx.beans.property.StringProperty
import javafx.fxml.FXMLLoader
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.HBox
import javafx.scene.layout.Priority
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import javafx.stage.Stage
import teststucture.queryresults.BaseRes
import teststucture.tests.SingleQueryTest

class SingleTestDescription(val test: SingleQueryTest) : HBox() {

    val sqlQuery: TextArea = TextArea()
    val expected: TextArea = TextArea()
    val resultDBMS: TextArea = TextArea()
    val resultMySQL: TextArea = TextArea()
    val mySqlResOfQuery: TextArea = TextArea()
    val blocks = arrayOf(sqlQuery, expected, resultDBMS, mySqlResOfQuery, resultMySQL)
    val buttonsShow = arrayOf(Button("Show"), Button("Show"), Button("Show"))
    lateinit var btnFix: Button;

    val conclusion: Label = Label()
    fun getExpected(): String {
        return expected.text
    }

    private var showStage: Stage? = null
    val layout: String = "/res/expectedInfo.fxml"
    fun show(res: BaseRes, editable: Boolean) {

        showStage?.close()
        val loader = FXMLLoader(javaClass.getResource(layout))
        // Create a controller instance
        val controller = ShowControler(res,editable)
        // Set it in the FXMLLoader
        loader.setController(controller)
        val flowPane = loader.load<AnchorPane>()
        val scene = Scene(flowPane)
        showStage = Stage()
        showStage?.scene = scene
        showStage?.show()


    }

    init {
        HBox.setHgrow(this, Priority.ALWAYS)
        this.widthProperty().addListener { obs, oldVal, newVal ->
            for (i in blocks) {
                i.maxWidth = (newVal.toDouble() - 140) / (blocks.size-1)
                i.minWidth = (newVal.toDouble() - 140) / (blocks.size-1)
            }

        };

        val box = this

        sqlQuery.text = test.sqlQuery
        sqlQuery.maxHeight = 26.0 * 6
        sqlQuery.minHeight = 26.0 * 6
        sqlQuery.wrapTextProperty().set(true)
        sqlQuery.isEditable = false


        expected.text = test.expected.getExpected()
        expected.maxHeight = 26.0 * 5
        expected.maxHeight = 26.0 * 5
        expected.wrapTextProperty().set(true)
        expected.isEditable = false

        buttonsShow[0].setOnAction {
            show(test.expected, true)
        }

        resultDBMS.text = test.resultDBMS.getExpected()
        resultDBMS.maxHeight = 26.0 * 5
        resultDBMS.maxHeight = 26.0 * 5
        resultDBMS.wrapTextProperty().set(true)
        resultDBMS.isEditable = false

        buttonsShow[1].setOnAction {
            show(test.expected, false)
        }

        resultMySQL.text = test.resultMySQL.getExpected()
        resultMySQL.maxHeight = 26.0 * 5
        resultMySQL.maxHeight = 26.0 * 5
        resultMySQL.wrapTextProperty().set(true)
        resultMySQL.isEditable = false

        buttonsShow[2].setOnAction {
            show(test.expected, false)
        }

        VBox.setMargin(sqlQuery, Insets(10.0, 0.0, 0.0, 3.0))
        VBox.setMargin(resultDBMS, Insets(10.0, 0.0, 0.0, 3.0))
        VBox.setMargin(expected, Insets(10.0, 0.0, 0.0, 3.0))
        VBox.setMargin(resultMySQL, Insets(10.0, 0.0, 0.0, 3.0))

        val inLabel = Label("Query:")
        VBox.setMargin(inLabel, Insets(5.0, 0.0, -8.0, 10.0))
        val outLabel = Label("Expexted:")
        VBox.setMargin(outLabel, Insets(5.0, 0.0, -8.0, 10.0))
        val resDBMSLabel = Label("DBMS get:")
        VBox.setMargin(resDBMSLabel, Insets(5.0, 0.0, -8.0, 10.0))
        val resMySQLLabel = Label("MySQL get:")
        VBox.setMargin(resMySQLLabel, Insets(5.0, 0.0, -8.0, 10.0))

        conclusion.text = test.conclusion.toString()

        conclusion.font = Font.font("System", 14.0)
        VBox.setMargin(conclusion, Insets(50.0, 0.0, 0.0, 7.0))

        btnFix = Button("Fix test")
        btnFix.font = Font.font("System", 13.0)
        VBox.setMargin(btnFix, Insets(50.0, 0.0, 0.0, 10.0))

        btnFix.setOnAction { event ->
            expected.text = resultDBMS.text
        }

        val rightBox = VBox(conclusion, btnFix)
        rightBox.minWidth = 120.0
        box.children.addAll(VBox(inLabel, sqlQuery),
                VBox(outLabel, expected, buttonsShow[0]),
                VBox(resDBMSLabel, resultDBMS, buttonsShow[1]),
                VBox(resMySQLLabel, resultMySQL, buttonsShow[2]),
                rightBox
        )
    }

}