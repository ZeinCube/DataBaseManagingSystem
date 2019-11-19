package myjavafxblocks

import javafx.beans.property.SimpleListProperty
import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.control.Label
import javafx.scene.control.TableCell
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.layout.AnchorPane
import teststucture.queryresults.Table
import java.lang.Exception

class MyTableView(var table:Table): TableView<Table.Record>(FXCollections.observableArrayList(table.records.toList())) {

    init {
        var k = 0
        for (s in table.columns)
        {
            val column = TableColumn<Table.Record,Any>(s)
            this.columns.add(column)
            column.minWidth = 100.0
            column.id = k.toString()
            column.setCellFactory {
                object: TableCell<Table.Record, Any>()
                {
                    val label=Label()
                    override fun updateItem(item: Any?, empty: Boolean) {
                        super.updateItem(item, empty)
                        try{
                            label.text=table[index][column.id.toInt()]
                        }catch (ex:Exception)
                        {}
                        if (empty) {
                            graphic = null
                        } else {
                            graphic = label
                        }
                    }
                }
            }
            AnchorPane.setRightAnchor(this,0.0)
            AnchorPane.setBottomAnchor(this,0.0)
            AnchorPane.setLeftAnchor(this,0.0)
            AnchorPane.setTopAnchor(this,0.0)
            k++
        }
    }
}