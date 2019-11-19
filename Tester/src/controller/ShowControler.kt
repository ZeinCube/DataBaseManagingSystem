package controller

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.*
import myjavafxblocks.MyTableView
import teststucture.queryresults.*
import java.net.URL
import java.util.*

class ShowControler(var result:BaseRes,var editable:Boolean): Initializable {
    @FXML
    lateinit var MainBox:TabPane
    lateinit var TableView:Tab
    lateinit var ErrorView:Tab
    lateinit var ExecutedView:Tab
    lateinit var VoidView:Tab
    lateinit var StringView:Tab
    lateinit var TableAsTableView:Tab
    lateinit var TableAsStrView:Tab
    lateinit var SaveExp:Button
    lateinit var ErrorTextEx:TextArea
    lateinit var ErrorTextWhat:TextArea
    lateinit var StringText:TextArea
    lateinit var TableText:TextArea
    lateinit var TableAsTable:TableView<Table.Record>

    fun save()
    {
        if (MainBox.getSelectionModel().getSelectedItem().text==ErrorView.text)
            result.setExpected(ErrorRes(ErrorTextEx.text,ErrorTextWhat.text))
        if (MainBox.getSelectionModel().getSelectedItem().text==ExecutedView.text)
            result.setExpected(ExecutedRes())
        if (MainBox.getSelectionModel().getSelectedItem().text==StringView.text)
            result.setExpected(StringRes(StringText.text))
        if (MainBox.getSelectionModel().getSelectedItem().text==VoidView.text)
            result.setExpected(VoidRes())
        if (MainBox.getSelectionModel().getSelectedItem().text==TableView.text)
            result.setExpected(TableRes(Table(TableText.text)))
        update()
    }
    fun update()
    {
        if (editable)
        {
            TableView.isDisable=false
            ErrorView.isDisable=false
            ExecutedView.isDisable=false
            VoidView.isDisable=false
            StringView.isDisable=false
            TableAsTableView.isDisable=false
            TableAsStrView.isDisable=false
            SaveExp.isVisible=true
        }else
        {
            TableView.isDisable=true
            ErrorView.isDisable=true
            ExecutedView.isDisable=true
            VoidView.isDisable=true
            StringView.isDisable=true
            TableAsTableView.isDisable=true
            TableAsStrView.isDisable=true
            SaveExp.isVisible=false
        }
        when(result.getExpected())
        {
            is ErrorRes ->{
                ErrorTextEx.text = (result.getExpected() as ErrorRes).exception
                ErrorTextWhat.text = (result.getExpected() as ErrorRes).what
                ErrorView.isDisable=false
            }
            is VoidRes ->{
                VoidView.isDisable=false
            }
            is ExecutedRes ->{
                ExecutedView.isDisable=false
            }
            is StringRes ->{
                StringText.text = (result.getExpected() as StringRes).expect
                StringView.isDisable=false
            }
            is TableRes ->{
                TableText.text = (result.getExpected() as TableRes).table.toString()
                TableAsTable = MyTableView((result.getExpected() as TableRes).table)
                ErrorView.isDisable=false
            }
        }
    }
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        update()
    }

}