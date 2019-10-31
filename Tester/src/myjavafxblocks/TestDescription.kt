package myjavafxblocks

import controller.TestsController
import javafx.beans.property.DoubleProperty
import javafx.beans.property.StringProperty
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.scene.text.Font
import teststucture.tests.BaseTest
import teststucture.tests.SimpleTest

class TestDescription(val test:BaseTest): HBox() {
    
    val sqlQuery: TextArea = TextArea()
    val expected: TextArea= TextArea()
    val resOfQuery: TextArea = TextArea()

    val conclusion: Label = Label()
    lateinit var btnFix:Button;
    init
    {
        this.widthProperty().addListener { obs, oldVal, newVal ->
            sqlQuery.maxWidth = 1000/3-40.0
            sqlQuery.minWidth = 1000/3-40.0
            expected.maxWidth = 1000/3-40.0
            expected.minWidth = 1000/3-40.0
            resOfQuery.maxWidth = 1000/3-40.0
            resOfQuery.minWidth = 1000/3-40.0
        };

        val box = this

        sqlQuery.text = test.getSQLQuery()
        sqlQuery.maxWidth = this.width-40.0
        sqlQuery.minWidth = this.width-40.0

        sqlQuery.maxHeight = 26.0*5
        sqlQuery.minHeight = 26.0*5
        sqlQuery.wrapTextProperty().set(true)
        sqlQuery.isEditable = false

        expected.text = test.getExpected()
        expected.maxWidth = this.width-40.0
        expected.minWidth = this.width-40.0

        expected.maxHeight = 26.0*5
        expected.maxHeight = 26.0*5
        expected.wrapTextProperty().set(true)

        expected.isEditable = false

        resOfQuery.text = test.getSQLQueryResult()
        resOfQuery.maxWidth = this.width-40.0
        resOfQuery.minWidth = this.width-40.0

        resOfQuery.maxHeight = 26.0*5
        resOfQuery.maxHeight = 26.0*5
        resOfQuery.wrapTextProperty().set(true)

        resOfQuery.textProperty().addListener {
            observable, oldValue, newValue ->
            if (newValue.contains('\n'))
                (observable as StringProperty).value = oldValue else
                (observable as StringProperty).value = newValue
        }

        VBox.setMargin(sqlQuery, Insets(10.0,0.0,0.0,3.0))
        VBox.setMargin(resOfQuery, Insets(10.0,0.0,0.0,3.0))
        VBox.setMargin(expected, Insets(10.0,0.0,0.0,3.0))

        val inLabel = Label("In:")
        VBox.setMargin(inLabel, Insets(5.0,0.0,-8.0,10.0))
        val outLabel = Label("Expexted:")
        VBox.setMargin(outLabel, Insets(5.0,0.0,-8.0,10.0))
        val resLabel = Label("Get:")
        VBox.setMargin(resLabel, Insets(5.0,0.0,-8.0,10.0))

        conclusion.text=test.conclusion.toString()

        conclusion.font= Font.font("System",14.0)
        VBox.setMargin(conclusion, Insets(50.0,0.0,0.0,7.0))

        btnFix = Button("Fix test")
        btnFix.font = Font.font("System",13.0)
        VBox.setMargin(btnFix, Insets(50.0,0.0,0.0,10.0))

        btnFix.setOnAction{
            event ->
            expected.text = resOfQuery.text
        }

        val rightBox = VBox(conclusion, btnFix)
        rightBox.minWidth = 120.0
        box.children.addAll(VBox(inLabel,sqlQuery),
                VBox(resLabel,expected),
                VBox(outLabel,resOfQuery),
                rightBox
        )
    }

}