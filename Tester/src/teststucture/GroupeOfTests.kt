package teststucture

import java.io.File

class GroupeOfTests : BaseTest {
    override fun checkTest() {
        conclusion = TestResult.NT
        if (selected)
            for (i in Tests)
            {
                i.checkTest()
                conclusion = conclusion and i.conclusion
            }
    }

    var Tests: Array<Test> = arrayOf()
    lateinit var dirr: String

    constructor(dir: String, n: String):super(n) {
        println("$dir$n\\meta.txt")
        println("$dir")
        dirr = "$dir$n"
        val meta = File("$dir$n\\meta.txt")
        print(meta.exists())
        meta.forEachLine {
            if (it.length > 0) {
                Tests += Test(it, "$dir$n", name)
            }
        }
        type = TestType.group
    }


    fun exist(s: String): Boolean {
        var flag = true;
        for (t in Tests) {
            if (t.name == s) {
                flag = false
            }
        }
        return !flag
    }

    fun addTest(s: String) {
        val meta = File("$dirr\\meta.txt")
        meta.appendText("\n$s")
        Tests += Test(s, "$dirr\\",name)
    }


}