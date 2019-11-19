package teststucture.hierarchy

import parser.ParseToTree
import parser.parseQueryResult
import parser.parseTestScript
import teststucture.tests.BaseTest
import visitors.CodeVisitor
import visitors.ResVisitor
import java.io.File
import java.nio.file.Paths

open class TestScript : TestsHierarchy {

    var tests: Array<BaseTest> = arrayOf()
    lateinit var gr: String
    lateinit var code: String
    lateinit var results: String

    var thread: Thread? = null
    override fun checkTests(necessarily: Boolean) {
        conclusion = BaseTest.TestResult.NT

        if (thread != null)
            if (!thread!!.isAlive)
                startTests(necessarily)
        if (thread == null)
            startTests(necessarily)
    }

    private fun startTests(necessarily: Boolean) {
        if (necessarily or selected) {
            thread = Thread {
                if (selected or necessarily) {
                    tests = CodeVisitor(ResVisitor().visit(parseQueryResult(results))).visit(parseTestScript(code))!!
                    for (i in tests)
                        i.execute()
                }
                tests.first().client.server.endServer()
            }
            thread?.start()
        }
    }

    constructor(name: String, dir: String, _gr: String) : super(name) {
        gr = _gr
        val inDir = File("$dir\\$name.in")
        val outDir = File("$dir\\$name.out")
        if (inDir.exists())
            code = inDir.readText()
        else {
            inDir.createNewFile()
            code = "@test \"${name}\"\n{\n}"
        }
        if (outDir.exists())
            results = outDir.readText()
        else {
            outDir.createNewFile()
            results = ""
        }
        type = HierarchyType.script
        try {
            checkTests(true)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

    }

    fun update(_name: String?, newCode: String?, updRes: Boolean = false) {
        if (thread != null)
            if (!thread!!.isAlive) {
                var _path = Paths.get("").toAbsolutePath().toString()
                var path = "$_path\\tests\\$gr"
                if (_name != null)
                    if (_name != name) {
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
                                    meta.appendText(_name.trim())
                                } else
                                    meta.appendText("\n" + _name.trim())

                        name = _name.trim()
                    }
                if (newCode != null) {
                    var inFile = File("$path\\$name.in")

                    inFile.delete()
                    inFile.createNewFile()

                    inFile.writeText(code)

                }
                if (updRes) {
                    var outFile = File("$path\\$name.out")
                    outFile.delete()
                    outFile.createNewFile()
                    var i = ""
                    tests.forEach { i = i + it.getResult() + "\n" }
                    outFile.writeText(i)
                    results = i
                }
            }
    }


}

