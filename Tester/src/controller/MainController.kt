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
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.util.Callback

/**
 * Created by naik on 06.02.16.
 */
class MainController {

    @FXML
    lateinit var testButton: Button
    lateinit var MainPlane: Pane
    lateinit var newGroupeName: TextArea
    lateinit var TestScene:Scene

    var testGropes: Array<GroupeOfTests> = arrayOf()
    var _path = Paths.get("").toAbsolutePath().toString()
    var path = "$_path\\tests\\"
    val mainDir = File("$path\\meta.txt")
    val treeTableView = TreeTableView<Test>()
    private fun addNewTest(Group:String)
    {
        lateinit var Gr:GroupeOfTests
        for(gr in testGropes)
        {
            if(gr.name.name == Group)
            {
                Gr = gr
                break
            }
        }
        for(i in 1..1000)
        {
            if (!Gr.exist("def$i"))
            {
                Gr.addTest("def$i")
                for(node in treeTableView.root.children)
                {
                    if (node.value.name==Group)
                    {
                        node.children.addAll(TreeItem(Gr.Tests.last()))
                    }
                }
                break
            }
        }

    }
    private fun addNewGroup(s:String) {
        var flag = true
        for (gr in testGropes) {
            if (gr.name.name == s) {
                flag = false
                break
            }
        }
        if (s.length>0)
        if (flag) {
            val name = newGroupeName.text
            val newDir = File("$path$name")
            if(testGropes.size>0)
            mainDir.appendText("\n$name")
            else

                mainDir.appendText("$name")
            newDir.mkdir()
            val newFile = File("$path$name\\meta.txt")
            newFile.createNewFile()
            newFile.appendText("def1")
            val inDir = File( "$path$name\\def1.in")
            val outDir = File( "$path$name\\def1.out")
            inDir.createNewFile()
            outDir.createNewFile()

            testGropes+= GroupeOfTests(path,s)
            treeTableView.root.children.addAll(TreeItem(testGropes.last().name))
        }
    }

    val layout:String = "/res/testInfo.fxml"
    var newStage: Stage?
    private fun checkTest(data:Test)
    {
        val scene = Scene(FXMLLoader.load<Parent?>(Main.javaClass.getResource(layout)))
        newStage.scene = scene
        newStage.show()
    }

    private fun addButtonToTable() {
        val colBtn = TreeTableColumn<Test, TestType>("Button Column")

        val cellFactory = Callback<TreeTableColumn<Test, TestType>, TreeTableCell<Test, TestType>> {
            object : TreeTableCell<Test, TestType>() {
                private val btn = Button("Action")

                init {
                    btn.setOnAction { event: ActionEvent ->
                        val data = treeTableView.getTreeItem(index)
                        if (data.value.type == TestType.root) {
                            addNewGroup(newGroupeName.text)
                        } else {
                            if (data.value.type == TestType.test) {
                                btn.text = "Check Test"
                            } else {
                                addNewTest(data.value.name)
                            }
                        }
                    }
                }

                override fun updateItem(item: TestType?, empty: Boolean) {
                    super.updateItem(item, empty)
                    val data = treeTableView.getTreeItem(index)
                    if (data != null)
                        if (data.value.type == TestType.root) {
                            btn.text = "Add new Group"
                        } else {
                            if (data.value.type == TestType.test) {
                                btn.text = "Check Test"
                            } else {
                                btn.text = "Add new Test"
                            }
                        }

                    if (empty) {
                        graphic = null
                    } else {
                        graphic = btn
                    }
                }
            }
        }

        colBtn.cellFactory = cellFactory
        treeTableView.columns.add(colBtn)
    }
    fun initTable(){
        val testnamec = TreeTableColumn<Test, String>("Tests")
        testnamec.minWidth = 100.0
        val resultc = TreeTableColumn<Test, String>("Result")

        treeTableView.columns.addAll(testnamec, resultc)
        testnamec.setCellValueFactory(TreeItemPropertyValueFactory<Test, String>("name"))
        resultc.setCellValueFactory(TreeItemPropertyValueFactory<Test, String>("result"))
        addButtonToTable()
    }

    fun updateTable() {
        testGropes = arrayOf()
        mainDir.forEachLine {
            testGropes = testGropes + arrayOf(GroupeOfTests("$path", it))
        }



        treeTableView.setOnMouseClicked() {

            if (it.getClickCount() == 2) {
                println(it)
            }
        }






        val root = TreeItem<Test>(Test(" ", "", null, null, TestType.root));
        for (gr in testGropes) {
            val subRoot = TreeItem<Test>(gr.name)
            for (test in gr.Tests) {
                subRoot.children.add(TreeItem(test))
            }
            root.children.add(subRoot)
        }

        treeTableView.root = root
    }

    fun initialize() {

        initTable()
        updateTable()



        MainPlane.children.add(treeTableView)
    }

}


