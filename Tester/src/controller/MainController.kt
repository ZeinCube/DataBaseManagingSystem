package controller

import javafx.fxml.FXML
import javafx.scene.control.*
import java.io.File
import java.nio.file.Paths
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeTableColumn
import javafx.event.ActionEvent
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.stage.Stage
import javafx.util.Callback
import javafx.beans.property.StringProperty
import javafx.scene.layout.AnchorPane
import teststucture.hierarchy.*
import teststucture.tests.BaseTest



class MainController {

    @FXML
    lateinit var testButton: Button
    lateinit var MainPane: BorderPane
    lateinit var newGroupeName: TextArea


    var _path = Paths.get("").toAbsolutePath().toString()
    var path = "$_path\\tests\\"
    val mainDir = File("$path\\meta.txt")
    val treeTableView = TreeTableView<TestsHierarchy>()

    private val rootTest = object : TestsHierarchy("TESTS")
    {
        override fun checkTests(necessarily:Boolean) {
            conclusion = BaseTest.TestResult.NT
            if (selected)
                for (i in testGropes)
                {
                    if (i.selected)
                        i.checkTests(necessarily)
                    conclusion = conclusion and i.conclusion
                }
        }

        var testGropes: Array<GroupeOfTests> = arrayOf()
        init {
            conclusion = BaseTest.TestResult.NT
            type = HierarchyType.root
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
                            node.children.addAll(TreeItem<TestsHierarchy>(Gr.testScripts.last()))
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
                    val name = newGroupeName.text.trim()
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
                    var t = TreeItem<TestsHierarchy>(testGropes.last())
                    t.children.add(TreeItem<TestsHierarchy>(testGropes.last().testScripts.last()))
                    treeTableView.root.children.addAll(t)
                }
        }

        private var testStage: Stage?=null
        
        val layout: String = "/res/testInfo.fxml"
        
        fun checkTest(data: TestScript) {

            testStage?.close()
            
            val loader = FXMLLoader(javaClass.getResource(layout))

            // Create a controller instance
            val controller = TestsController(data)
            // Set it in the FXMLLoader
            loader.setController(controller)
            val flowPane = loader.load<AnchorPane>()
            val scene = Scene(flowPane)
            testStage = Stage()
            testStage?.scene = scene
            testStage?.show()
            data.updaters += object : MyFunction {
                override fun invoke() {
                    updateTable()
                }
            }
            testStage?.setOnCloseRequest {
                data.updaters = arrayOf()
            }

        }


    }



    



    private fun updateTable() {
        for (column in treeTableView.getColumns())
        {
            column.isVisible = false
            column.isVisible = true
        }
    }



    fun initTable() {
        val testnamec = TreeTableColumn<TestsHierarchy, String>("Tests")
        testnamec.minWidth = 150.0
        val resultc = TreeTableColumn<TestsHierarchy, String>("Result")
        resultc.minWidth = 100.0
        val choosec = TreeTableColumn<TestsHierarchy, Boolean>("Selected")
        val colBtn = TreeTableColumn<TestsHierarchy, HierarchyType>("Button Column")

        val textCellFactory = Callback<TreeTableColumn<TestsHierarchy, String>, TreeTableCell<TestsHierarchy, String>> {
            object : TreeTableCell<TestsHierarchy, String>() {
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

        val chooseCellFactory = Callback<TreeTableColumn<TestsHierarchy, Boolean>, TreeTableCell<TestsHierarchy, Boolean>> {
            object : TreeTableCell<TestsHierarchy, Boolean>() {
                private val chooseBtn = CheckBox()
                init {
                    chooseBtn.setOnAction {
                        val data = treeTableView.getTreeItem(index)
                        data.value.selected = chooseBtn.isSelected
                        if((data.parent != null) and !chooseBtn.isSelected)
                        {
                            data.parent.value.selected = false
                            val data2 = data
                            if(!chooseBtn.isSelected)
                            {
                                if (data2.parent != null) {
                                    data2.parent.value.selected = false
                                    if (data2.parent.parent != null)
                                        data2.parent.parent.value.selected = false
                                }
                                for (i in data.children)
                                {
                                    i.value.selected = false
                                    for (ii in i.children)
                                    {
                                        ii.value.selected = false
                                    }
                                }
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



        val cellFactory = Callback<TreeTableColumn<TestsHierarchy, HierarchyType>, TreeTableCell<TestsHierarchy, HierarchyType>> {
            object : TreeTableCell<TestsHierarchy, HierarchyType>() {
                private val btn = Button("Action")

                init {

                    btn.setOnAction { event: ActionEvent ->
                        val data = treeTableView.getTreeItem(index)
                        if (data.value.type == HierarchyType.root) {
                            rootTest.addNewGroup(newGroupeName.text)
                        } else {
                            if (data.value.type == HierarchyType.script) {
                                rootTest.checkTest((data.value as TestScript))
                            } else {
                                rootTest.addNewTest(data.value.name)
                            }
                        }

                    }
                }

                override fun updateItem(item: HierarchyType?, empty: Boolean) {
                    super.updateItem(item, empty)
                    val data = treeTableView.getTreeItem(index)
                    if (data != null)
                        if (data.value.type == HierarchyType.root) {
                            btn.text = "Add new Group"
                        } else {
                            if (data.value.type == HierarchyType.script) {
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

        val root = TreeItem<TestsHierarchy>(rootTest);
        for (gr in rootTest.testGropes) {
            val subRoot = TreeItem<TestsHierarchy>(gr)
            for (test in gr.testScripts) {
                subRoot.children.add(TreeItem(test))
            }
            root.children.add(subRoot)
        }

        treeTableView.root = root
    }

    fun initialize() {

        initTable()
        loadTable()
        testButton.setOnAction {
            event ->
            rootTest.checkTests(false)
        }
        newGroupeName.textProperty().addListener { observable, oldValue, newValue ->
            if (newValue.contains('\n'))
                (observable as StringProperty).value = oldValue else
                (observable as StringProperty).value = newValue
        }



        MainPane.center = (treeTableView)
    }

}


