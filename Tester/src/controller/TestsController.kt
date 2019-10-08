package controller

import javafx.fxml.FXML
import javafx.geometry.Insets
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.layout.*
import javafx.scene.layout.BorderPane
import javafx.beans.property.StringProperty
import javafx.geometry.Pos
import javafx.scene.control.Button
import javafx.scene.text.Font
import javax.swing.event.ChangeListener


class TestsController {
    @FXML
    lateinit var mainBox: VBox


    var inAreas : Array<TextArea> = arrayOf();
    var outAreas : Array<TextArea> = arrayOf();
    var resultAreas : Array<TextArea> = arrayOf();
    var outputAreas : Array<Label> = arrayOf();
    companion object {
        @JvmStatic
        var test : Test? = null
    }
        fun addNewTest(){
            val box = HBox()
            if (inAreas.size>=test?._in?.size!!)
                test?._in = test?._in!! + ""

            inAreas += TextArea(test?._in!![(inAreas.size)])
            inAreas.last().maxWidth = 300.0-40.0
            inAreas.last().minWidth = 300.0-40.0

            inAreas.last().maxHeight = 26.0*5
            inAreas.last().minHeight = 26.0*5
            inAreas.last().wrapTextProperty().set(true)

            inAreas.last().textProperty().addListener {
                observable, oldValue, newValue ->
                if (newValue.contains('\n'))
                    (observable as StringProperty).value = oldValue else
                    (observable as StringProperty).value = newValue
            }
            outAreas += TextArea()
            outAreas.last().maxWidth = 300.0-40.0
            outAreas.last().minWidth = 300.0-40.0

            outAreas.last().maxHeight = 26.0*5
            outAreas.last().maxHeight = 26.0*5
            outAreas.last().wrapTextProperty().set(true)

            outAreas.last().textProperty().addListener {
                observable, oldValue, newValue ->
                if (newValue.contains('\n'))
                    (observable as StringProperty).value = oldValue else
                    (observable as StringProperty).value = newValue
            }
            if(test?._out?.size!!>(inAreas.size-1))
            {
                outAreas.last().text = test?._out!![(inAreas.size-1)]
            }
            resultAreas += TextArea("")
            resultAreas.last().maxWidth = 300.0-40.0
            resultAreas.last().minWidth = 300.0-40.0

            resultAreas.last().maxHeight = 26.0*5
            resultAreas.last().maxHeight = 26.0*5
            resultAreas.last().wrapTextProperty().set(true)

            resultAreas.last().isEditable = false

            if(test?._results?.size!!>(inAreas.size-1))
            {
                resultAreas.last().text = test?._results!![(inAreas.size-1)]
            }

            VBox.setMargin(inAreas.last(), Insets(10.0,0.0,0.0,3.0))
            VBox.setMargin(outAreas.last(), Insets(10.0,0.0,0.0,3.0))
            VBox.setMargin(resultAreas.last(), Insets(10.0,0.0,0.0,3.0))

            val inLabel = Label("In:")
            VBox.setMargin(inLabel, Insets(5.0,0.0,-8.0,10.0))
            val outLabel = Label("Expexted:")
            VBox.setMargin(outLabel, Insets(5.0,0.0,-8.0,10.0))
            val resLabel = Label("Get:")
            VBox.setMargin(resLabel, Insets(5.0,0.0,-8.0,10.0))

            outputAreas += Label("Not tested")
            if (test?._des?.size!!>(inAreas.size-1))
            {
                outputAreas.last().text = test?._des!![(inAreas.size-1)]
            }
            outputAreas.last().font= Font.font("System",14.0)
            VBox.setMargin(outputAreas.last(),Insets(50.0,0.0,0.0,7.0))
            val btnFix = Button("Fix test")
            btnFix.font = Font.font("System",13.0)
            VBox.setMargin(btnFix,Insets(50.0,0.0,0.0,10.0))
            btnFix.id = (inAreas.size-1).toString()
            btnFix.setOnAction{
                event ->
                val i =(event.target as Button).id.toInt()
                if (outAreas[i].text.length>0)
                    outAreas[i].text = resultAreas[i].text
            }
            val rightBox = VBox(outputAreas.last(), btnFix)
            rightBox.minWidth = 120.0
            box.children.addAll(VBox(inLabel,inAreas.last()),
                    VBox(resLabel,resultAreas.last()),
                    VBox(outLabel,outAreas.last()),
                    rightBox
            )
            box.maxWidth = 900.0
            mainBox.children.addAll(box)
            mainBox.minHeight = (26.0*5+24)*inAreas.size+50+50
        }

        lateinit var nameBox : TextArea
        fun save(){
            val _in = Array<String>(inAreas.size,{inAreas[it].text})
            val _out = Array<String>(inAreas.size,{outAreas[it].text})
            test?.update(nameBox.text,_in,_out)
        }

        fun retest(){
            save()
            test?.checkTest()
            (1..test?._results?.size!!).forEach{
                resultAreas[it].text = test?._results!![it]
                outputAreas[it].text = test?._des!![it]
            }
        }
        fun initialize() {
            nameBox = TextArea(test?.name)
            nameBox.maxHeight = 26.0
            nameBox.minHeight = 26.0
            nameBox.maxWidth = 150.0
            nameBox.textProperty().addListener {
                observable, oldValue, newValue ->
                (observable as StringProperty).value
                (observable as StringProperty).value = newValue.filter {
                    ("йцукенгшзфывапролдячсмитьхъюжэqwertyuiopasdfghjklzxcvbnm"+" "+"йцукенгшзфывапролдячсмитьхъюжэqwertyuiopasdfghjklzxcvbnm".toUpperCase()).contains(it) }
            }
            HBox.setMargin(nameBox, Insets(2.0, 0.0, 0.0, 13.0))

            val saveBtn = Button("Save Test")
            val retestBtn = Button("Save and Retest")
            saveBtn.setOnAction { save() }
            retestBtn.setOnAction { retest() }
            val btnBox = HBox(saveBtn,retestBtn)
            HBox.setMargin(retestBtn, Insets(0.0, 0.0, 0.0, 20.0))
            btnBox.alignment = Pos.BASELINE_RIGHT
            val lb = Label("Test name:")
            lb.font = Font.font("System",14.0)
            HBox.setMargin(lb, Insets(4.0, 0.0, 0.0, 13.0))
            HBox.setMargin(nameBox, Insets(4.0, 0.0, 0.0, 13.0))
            val p = Pane()

            val pane = HBox(lb,nameBox,btnBox)
            HBox.setMargin(btnBox, Insets(4.0, 0.0, 0.0, 200.0))
            mainBox.children.addAll(pane)
            mainBox.minWidth = 900.0
            mainBox.maxWidth = 900.0
            if (!test?._in.isNullOrEmpty())
            for (i in test?._in!!)
            {
                addNewTest()
            }

            val addTestBtn = Button("Add Test")
            addTestBtn.setOnAction {
                addNewTest()
            }
            mainBox.children.addAll(addTestBtn)
            addTestBtn.font = Font.font("System",15.0)
            VBox.setMargin(addTestBtn,Insets(10.0, 0.0, 3.0, 13.0))
        }

}