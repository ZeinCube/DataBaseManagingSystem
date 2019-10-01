package controller

import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TreeTableView
import javafx.scene.layout.Pane
import javafx.scene.control.TreeItem
import javafx.scene.control.TreeTableColumn
import javafx.scene.control.cell.TreeItemPropertyValueFactory





/**
 * Created by naik on 06.02.16.
 */
class MainController {

    @FXML
    lateinit var testButton: Button
    lateinit var MainPlane: Pane
    fun initialize() {
        print("Controller working")
        testButton.setOnAction {
            print("Button clicked!")
        }
        val treeTableView = TreeTableView<TestResult>()

        // Create column EmpNo (Data type of String).
        val test //
                = TreeTableColumn<TestResult, String>("Tests")
        test.minWidth = 100.0
        // Create column FullName (Data type of String).
        val result//
                = TreeTableColumn<TestResult, String>("Result")
        treeTableView.columns.addAll(test,result)

        test.setCellValueFactory(TreeItemPropertyValueFactory<TestResult, String>("name"))
        result.setCellValueFactory(TreeItemPropertyValueFactory<TestResult, String>("result"))

        val gr1 = TestResult("G0","OK")
        val t1 = TestResult("Test0","OK")
        val ti0 = TreeItem<TestResult>(gr1)
        val ti1 = TreeItem<TestResult>(t1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        ti0.children.addAll(ti1)
        val root = TreeItem<TestResult>(TestResult("","OK"));
        root.children.addAll(ti0)
        root.children.addAll(ti0)
        root.children.addAll(ti0)
        root.children.addAll(ti0)
        treeTableView.root = root
        MainPlane.children.add(treeTableView)
    }

}
