package teststucture

import java.io.File
import java.lang.Integer.max
import java.nio.file.Paths

interface MyFunction {
    fun invoke()
}
enum class TestType {
    group,
    test,
    root;
}

open class Test: BaseTest {


    override fun checkTest() {
        conclusion = TestResult.NT
        if (selected)
        for (i in tests)
        {
            i.checkTest()
            conclusion = conclusion and i.conclusion
        }
    }

    lateinit var tests: Array<TestBlock>
    lateinit var gr: String

    constructor(name: String, dir: String, _gr:String) : super(name) {
        gr = _gr
        val inDir = File("$dir\\$name.in")
        val outDir = File("$dir\\$name.out")
        if (!inDir.exists()) {
            inDir.createNewFile()
            inDir.appendText("\n")
        }
        if (!outDir.exists()) {
            outDir.createNewFile()
            outDir.appendText("\n")
        }
        tests = arrayOf()
        val p1 = inDir.readLines().toTypedArray()
        val p2 = outDir.readLines().toTypedArray()
        val maxi = max(p1.size,p2.size)
        for (i in 0..(maxi-1)) {
            if(p2.size<=i)
            {
                tests+= TestBlock(p1[i], "")
                continue
            }
            if(p1.size<=i)
            {
                tests+= TestBlock("", p2[i])
                continue
            }
            tests+= TestBlock(p1[i], p2[i])
        }
        type = TestType.test
    }

    fun update(_name: String, __in: Array<String>, __out: Array<String>) {
        var _path = Paths.get("").toAbsolutePath().toString()
        var path = "$_path\\tests\\$gr"
        var meta = File("$path\\meta.txt")
        var testsList = meta.readLines()
        meta.delete()
        meta.createNewFile()
        var flag = true
        for (s in testsList)
            if (s != name)
                if (flag) {
                    flag = false
                    meta.appendText(s)
                } else
                    meta.appendText("\n$s")
            else
                if (flag) {
                    flag = false
                    meta.appendText(_name)
                } else
                    meta.appendText("\n" + _name)

        name = _name
        var inFile = File("$path\\$name.in")
        var outFile = File("$path\\$name.out")

        inFile.delete()
        outFile.delete()
        inFile.createNewFile()
        outFile.createNewFile()
        for (s in __in) {
            inFile.appendText(s + "\n")

        }
        for (s in __out)
        {
            outFile.appendText(s + "\n")
            }
        for( i in (0..__in.size-1))
        {
            if (tests.size>i)
            tests[i].update(__in[i],__out[i])
            else
                tests+= TestBlock(__in[i],__out[i])
        }
        updaters.forEach { it.invoke() }
    }


    var updaters: Array<MyFunction> = arrayOf()

}

