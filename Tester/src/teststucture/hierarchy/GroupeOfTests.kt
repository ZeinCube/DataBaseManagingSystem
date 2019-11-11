package teststucture.hierarchy

import teststucture.tests.BaseTest
import java.io.File

class GroupeOfTests(dir: String, name: String) : TestsHierarchy(name) {

    var testScripts: Array<TestScript> = arrayOf()
    lateinit var dirr: String

    override fun checkTests(necessarily:Boolean) {
        conclusion = BaseTest.TestResult.NT
        if (selected or necessarily) {
            for (i in testScripts) {
            i.checkTests(necessarily)
            conclusion = conclusion and i.conclusion
        }
        }

    }



    init {
        dirr = "$dir$name"
        val meta = File("$dir$name\\meta.txt")
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