package teststucture

import teststucture.tests.BaseTest
import teststucture.tests.TestResult
import java.io.File

class GroupeOfTests(dir: String, name: String) : TestsHierarchy(name) {

    var testScripts: Array<TestScript> = arrayOf()
    lateinit var dirr: String

    override fun checkTests() {
        conclusion = TestResult.NT
        if (selected) {
        }
        for (i in testScripts) {

            i.checkTests()
            conclusion = conclusion and i.conclusion
        }
    }



    init {
        println("$dir$name\\meta.txt")
        println("$dir")
        dirr = "$dir$name"
        val meta = File("$dir$name\\meta.txt")
        print(meta.exists())
        meta.forEachLine {
            if (it.length > 0) {
                testScripts += TestScript(it, "$dir$name", name)
            }
        }
        type = HierarchyType.group
    }


    fun exist(s: String): Boolean {
        var flag = true;
        for (t in testScripts) {
            if (t.name == s) {
                flag = false
            }
        }
        return !flag
    }

    fun addTest(s: String) {
        val meta = File("$dirr\\meta.txt")
        meta.appendText("\n$s")
        testScripts += TestScript(s, "$dirr\\", name)
    }


}