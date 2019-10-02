package controller

import javafx.fxml.FXML
import javafx.scene.control.*
import javafx.scene.layout.Pane
import javafx.scene.control.cell.TreeItemPropertyValueFactory
import java.io.File
import java.nio.file.Paths
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeTableColumn
import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table
import javafx.event.ActionEvent
import javafx.util.Callback

/**
 * Created by naik on 06.02.16.
 */
class MainController {

    @FXML
    lateinit var testButton: Button
    lateinit var MainPlane: Pane
    lateinit var newGroupeName: TextArea

    var testGropes: Array<GroupeOfTests> = arrayOf()
    var _path =Paths.get("").toAbsolutePath().toString()
    var path = "$_path\\tests\\"
    val mainDir = File( "$path\\meta.txt")
    val treeTableView = TreeTableView<Test>()

    private fun addButtonToTable() {
        val colBtn = TreeTableColumn<Test, Void>("Button Column")

        val cellFactory = Callback<TreeTableColumn<Test, Void>, TreeTableCell<Test, Void>> {
            object : TreeTableCell<Test, Void>() {

                private val btn = Button("Action")

                init {
                    btn.setOnAction { event: ActionEvent ->
                        val data = treeTableView.getTreeItem(index)
                        println("selectedData: $data")
                    }
                }

                override fun updateItem(item: Void?, empty: Boolean) {
                    super.updateItem(item, empty)
                    if (empty) {
                        graphic = null
                    } else {
                        graphic = btn
                    }
                }
            }
        }

        colBtn.setCellFactory(cellFactory)

        treeTableView.columns.add(colBtn)

    }

    fun updateTable()
    {
        testGropes = arrayOf()
        mainDir.forEachLine {
            testGropes = testGropes + arrayOf(GroupeOfTests("$path",it))
        }

        val testnamec = TreeTableColumn<Test, String>("Tests")
        testnamec.minWidth = 100.0
        val resultc = TreeTableColumn<Test, String>("Result")

        treeTableView.columns.addAll(testnamec,resultc)
        addButtonToTable()
        treeTableView.setOnMouseClicked(){

                if(it.getClickCount() == 2){
                    println(it)
                }
        }



        testnamec.setCellValueFactory(TreeItemPropertyValueFactory<Test, String>("name"))
        resultc.setCellValueFactory(TreeItemPropertyValueFactory<Test, String>("result"))




        val root = TreeItem<Test>(Test(" ", "OK"));
        for (gr in testGropes)
        {
            val subRoot = TreeItem<Test>(gr.name)
            for (test in gr.Tests)
            {
                subRoot.children.add(TreeItem(test))
            }
            root.children.add(subRoot)
        }

        treeTableView.root = root
    }
    fun initialize() {


        updateTable()
        testButton.setOnAction {
            val name = newGroupeName.text
            val newDir = File("$path$name")
            mainDir.appendText("\n$name")
            newDir.mkdir()
            val newFile = File("$path$name\\meta.txt")
            newFile.createNewFile()
            updateTable()
        }



        MainPlane.children.add(treeTableView)
    }

}


