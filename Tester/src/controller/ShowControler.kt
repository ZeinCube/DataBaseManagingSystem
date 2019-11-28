package controller

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.*
import javafx.scene.layout.AnchorPane
import javafx.scene.layout.Region
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
    lateinit var ErrorTextEx:TextArea
    lateinit var ErrorTextWhat:TextArea
    lateinit var StringText:TextArea
    lateinit var TableText:TextArea
    lateinit var TableAsTable:TableView<Table.Record>
    lateinit var SaveBtn:Button
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
            SaveBtn.isVisible=true
        }else
        {
            ErrorTextEx.isEditable = false
            ErrorTextWhat.isEditable = false
            StringText.isEditable = false
            TableText.isEditable = false
            TableView.isDisable=true
            ErrorView.isDisable=true
            ExecutedView.isDisable=true
            VoidView.isDisable=true
            StringView.isDisable=true
            TableAsTableView.isDisable=true
            TableAsStrView.isDisable=true
            SaveBtn.isVisible=false
        }
        when(result.getExpected())
        {
            is ErrorRes ->{
                ErrorTextEx.text = (result.getExpected() as ErrorRes).exception
                ErrorTextWhat.text = (result.getExpected() as ErrorRes).what
                ErrorView.isDisable=false
                MainBox.selectionModel.select(ErrorView)
            }
            is VoidRes ->{
                VoidView.isDisable=false
                MainBox.selectionModel.select(VoidView)
            }
            is ExecutedRes ->{
                ExecutedView.isDisable=false
                MainBox.selectionModel.select(ExecutedView)
            }
            is StringRes ->{
                StringText.text = (result.getExpected() as StringRes).expect
                StringView.isDisable=false
                MainBox.selectionModel.select(StringView)
            }
            is TableRes ->{
                TableText.text = (result.getExpected() as TableRes).table.toString()
                val p = (TableAsTable.parent as? AnchorPane)
                p?.children?.remove(TableAsTable)
                TableAsTable = MyTableView((result.getExpected() as TableRes).table)
                p?.children?.add(TableAsTable)
                TableView.isDisable=false
                TableAsTableView.isDisable=false
                TableAsStrView.isDisable=false
                MainBox.selectionModel.select(TableView)
                (TableAsTableView.tabPane)?.selectionModel?.select(TableAsTableView)
            }
        }
    }
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        update()
        SaveBtn.setOnAction { save() }
    }

}