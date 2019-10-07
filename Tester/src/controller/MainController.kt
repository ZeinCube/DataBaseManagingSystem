package controller

import javafx.fxml.FXML
import javafx.scene.control.*
import java.io.File
import java.nio.file.Paths
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeTableColumn
import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.stage.Stage
import javafx.util.Callback
import javafx.beans.property.StringProperty


/**
 * Created by naik on 06.02.16.
 */
class MainController {

    @FXML
    lateinit var testButton: Button
    lateinit var MainPane: BorderPane
    lateinit var newGroupeName: TextArea
    lateinit var TestScene: Scene

    var testGropes: Array<GroupeOfTests> = arrayOf()
    var _path = Paths.get("").toAbsolutePath().toString()
    var path = "$_path\\tests\\"
    val mainDir = File("$path\\meta.txt")
    val treeTableView = TreeTableView<Test>()
    private fun addNewTest(Group: String) {
        lateinit var Gr: GroupeOfTests
        for (gr in testGropes) {
            if (gr.name.name == Group) {
                Gr = gr
                break
            }
        }
        for (i in 1..1000) {
            if (!Gr.exist("def$i")) {
                Gr.addTest("def$i")
                for (node in treeTableView.root.children) {
                    if (node.value.name == Group) {
                        node.children.addAll(TreeItem(Gr.Tests.last()))
                    }
                }
                break
            }
        }

    }

    private fun addNewGroup(s: String) {
        var flag = true
        for (gr in testGropes) {
            if (gr.name.name == s) {
                flag = false
                break
            }
        }
        if (s.length > 0)
            if (flag) {
                val name = newGroupeName.text
                val newDir = File("$path$name")
                if (testGropes.size > 0)
                    mainDir.appendText("\n$name")
                else

                    mainDir.appendText("$name")
                newDir.mkdir()
                val newFile = File("$path$name\\meta.txt")
                newFile.createNewFile()
                newFile.appendText("def1")
                val inDir = File("$path$name\\def1.in")
                val outDir = File("$path$name\\def1.out")
                inDir.createNewFile()
                outDir.createNewFile()
                inDir.appendText("\n")
                outDir.appendText("\n")

                testGropes += GroupeOfTests(path, s)
                var t = TreeItem(testGropes.last().name)
                t.children.addAll(TreeItem(testGropes.last().Tests.last()))
                treeTableView.root.children.addAll(t)
            }
    }

    val layout: String = "/res/testInfo.fxml"
    var newStage: Stage? = null
    private fun checkTest(data: Test) {
        if (newStage == null)
            newStage = Stage()

        newStage?.close()
        TestsController.test = data
        val scene = Scene(FXMLLoader.load<Parent?>(Main.javaClass.getResource(layout)))
        newStage?.scene = scene
        newStage?.show()


    }

    private fun updateTable() {
        for (column in treeTableView.getColumns())
        {
            column.isVisible = false
            column.isVisible = true
        }
    }

    private fun addButtonToTable() {
        val colBtn = TreeTableColumn<Test, TestType>("Button Column")

        val cellFactory = Callback<TreeTableColumn<Test, TestType>, TreeTableCell<Test, TestType>> {
            object : TreeTableCell<Test, TestType>() {
                private val btn = Button("Action")

                init {

                    btn.setOnAction { event: ActionEvent ->
                        val data = treeTableView.getTreeItem(index)

                            if (data != null) {
                                data.value.updater = { updateTable() }
                            }

                        if (data.value.type == TestType.root) {
                            addNewGroup(newGroupeName.text)
                        } else {
                            if (data.value.type == TestType.test) {
                                checkTest(data.value)
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


    fun initTable() {
        val testnamec = TreeTableColumn<Test, String>("Tests")
        testnamec.minWidth = 100.0
        val resultc = TreeTableColumn<Test, String>("Result")

        val cellFactory = Callback<TreeTableColumn<Test, String>, TreeTableCell<Test, String>> {
            object : TreeTableCell<Test, String>() {
                private val text = Label("Action")

                override fun updateItem(item: String?, empty: Boolean) {

                    super.updateItem(item, empty)

                    val data = treeTableView.getTreeItem(index)
                    if (data != null) {
                        if (tableColumn.text == "Tests") {
                            text.text = data.value.name
                        }
                        if (tableColumn.text == "Result") {
                            text.text = data.value.mainTestResult
                        }
/*
                        if (tableColumn.text == "Tests")
                        {
                            text.text = data.value.name
                        }*/
                    }


                    if (empty) {
                        graphic = null
                    } else {
                        graphic = text
                    }
                }
            }
        }

        treeTableView.columns.addAll(testnamec, resultc)
        testnamec.setCellFactory(cellFactory)
        resultc.setCellFactory(cellFactory)
        addButtonToTable()
    }

    fun loadTable() {
        testGropes = arrayOf()
        mainDir.forEachLine {
            testGropes = testGropes + arrayOf(GroupeOfTests("$path", it))
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
        loadTable()
        newGroupeName.textProperty().addListener { observable, oldValue, newValue ->
            if (newValue.contains('\n'))
                (observable as StringProperty).value = oldValue else
                (observable as StringProperty).value = newValue
        }


        MainPane.center = (treeTableView)
    }

}


