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
import teststucture.*


/**
 * Created by naik on 06.02.16.
 */
class MainController {

    @FXML
    lateinit var testButton: Button
    lateinit var MainPane: BorderPane
    lateinit var newGroupeName: TextArea
    lateinit var TestScene: Scene


    var _path = Paths.get("").toAbsolutePath().toString()
    var path = "$_path\\tests\\"
    val mainDir = File("$path\\meta.txt")
    val treeTableView = TreeTableView<BaseTest>()

    private val rootTest = object : BaseTest("TESTS")
    {
        override fun checkTest() {
            //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        var testGropes: Array<GroupeOfTests> = arrayOf()
        init {
            conclusion = TestResult.NT
            type = TestType.group
            mainDir.forEachLine {
                testGropes = testGropes + arrayOf(GroupeOfTests("$path", it))
            }
        }

        fun addNewTest(Group: String) {
            lateinit var Gr: GroupeOfTests
            for (gr in testGropes) {
                if (gr.name == Group) {
                    Gr = gr
                    break
                }
            }
            for (i in 1..1000) {
                if (!Gr.exist("def$i")) {
                    Gr.addTest("def$i")
                    for (node in treeTableView.root.children) {
                        if (node.value.name == Group) {
                            node.children.addAll(TreeItem<BaseTest>(Gr.Tests.last()))
                        }
                    }
                    break
                }
            }

        }

        fun addNewGroup(s: String) {
            var flag = true
            for (gr in testGropes) {
                if (gr.name == s) {
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
                    var t = TreeItem<BaseTest>(testGropes.last())
                    t.children.add(TreeItem<BaseTest>(testGropes.last().Tests.last()))
                    treeTableView.root.children.addAll(t)
                }
        }

        private var newStage: Stage? = null

        fun checkTest(data: Test) {
            if (newStage == null)
                newStage = Stage()

            newStage?.close()
            TestsController.test = data
            val scene = Scene(FXMLLoader.load<Parent?>(Main.javaClass.getResource(layout)))
            newStage?.scene = scene
            newStage?.show()
            data.updaters += object : MyFunction {
                override fun invoke() {
                    updateTable()
                }
            }
            newStage!!.setOnCloseRequest {
                data.updaters = arrayOf()
            }

        }


    }



    val layout: String = "/res/testInfo.fxml"



    private fun updateTable() {
        for (column in treeTableView.getColumns())
        {
            column.isVisible = false
            column.isVisible = true
        }
    }



    fun initTable() {
        val testnamec = TreeTableColumn<BaseTest, String>("Tests")
        testnamec.minWidth = 150.0
        val resultc = TreeTableColumn<BaseTest, String>("Result")
        resultc.minWidth = 100.0
        val choosec = TreeTableColumn<BaseTest, Boolean>("Selected")
        val colBtn = TreeTableColumn<BaseTest, TestType>("Button Column")

        val textCellFactory = Callback<TreeTableColumn<BaseTest, String>, TreeTableCell<BaseTest, String>> {
            object : TreeTableCell<BaseTest, String>() {
                private val text = Label("Action")

                override fun updateItem(item: String?, empty: Boolean) {

                    super.updateItem(item, empty)

                    val data = treeTableView.getTreeItem(index)
                    if (data != null) {
                        if (tableColumn.text == "Tests") {
                            text.text = data.value.name
                        }
                        if (tableColumn.text == "Result") {
                            text.text = data.value.conclusion.toString()
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

        val chooseCellFactory = Callback<TreeTableColumn<BaseTest, Boolean>, TreeTableCell<BaseTest, Boolean>> {
            object : TreeTableCell<BaseTest, Boolean>() {
                private val chooseBtn = CheckBox()
                init {
                    chooseBtn.setOnAction {
                        val data = treeTableView.getTreeItem(index)
                        data.value.selected = chooseBtn.isSelected
                        if((data.parent != null) and !chooseBtn.isSelected)
                        {
                            data.parent.value.selected = false
                            val data2 = data
                            if((data2.parent != null) and !chooseBtn.isSelected)
                            {
                                data2.parent.value.selected = false
                            }
                        }
                        updateSelect()
                    }
                }

                override fun updateItem(item: Boolean?, empty: Boolean) {
                    super.updateItem(item, empty)
                    val data = treeTableView.getTreeItem(index)
                    if (data!= null)
                    chooseBtn.isSelected = data.value.selected
                    if (empty) {
                        graphic = null
                    } else {
                        graphic = chooseBtn
                    }
                }
            }
        }

        treeTableView.columns.addAll(testnamec, resultc, choosec, colBtn)
        testnamec.setCellFactory(textCellFactory)
        resultc.setCellFactory(textCellFactory)
        choosec.setCellFactory(chooseCellFactory)



        val cellFactory = Callback<TreeTableColumn<BaseTest, TestType>, TreeTableCell<BaseTest, TestType>> {
            object : TreeTableCell<BaseTest, TestType>() {
                private val btn = Button("Action")

                init {

                    btn.setOnAction { event: ActionEvent ->
                        val data = treeTableView.getTreeItem(index)
                        if (data.value.type == TestType.root) {
                            rootTest.addNewGroup(newGroupeName.text)
                        } else {
                            if (data.value.type == TestType.test) {
                                rootTest.checkTest((data.value as Test))
                            } else {
                                rootTest.addNewTest(data.value.name)
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

        colBtn.setCellFactory(cellFactory)
    }

    fun updateSelect()
    {
        val data = treeTableView.root
        var flag1 = true
            for (i in data.children)
            {
                i.value.selected = data.value.selected or i.value.selected
                var flag2 = true
                for (ii in i.children) {
                    ii.value.selected = ii.value.selected or i.value.selected
                    flag2 = flag2 and ii.value.selected
                }
                i.value.selected = flag2
                flag1 = flag1 and i.value.selected
            }
        data.value.selected = flag1
        updateTable()
    }

    fun loadTable() {

        val root = TreeItem<BaseTest>(rootTest);
        for (gr in rootTest.testGropes) {
            val subRoot = TreeItem<BaseTest>(gr)
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


