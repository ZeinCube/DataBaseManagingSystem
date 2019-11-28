package teststucture.hierarchy

import clientsevrver.DBServer
import parser.ParseToTree
import parser.parseQueryResult
import parser.parseTestScript
import teststucture.tests.BaseTest
import visitors.CodeVisitor
import visitors.ResVisitor
import java.io.File
import java.nio.file.Paths

open class TestScript(name: String, dir: String, var gr: String,var parent:GroupeOfTests) : TestsHierarchy(name) {
    override fun updateConclusion() {
    }
    var tests: Array<BaseTest> = arrayOf()
    lateinit var code: String
    lateinit var results: String

    var thread: Thread? = null
    override fun checkTests(necessarily: Boolean) {
        conclusion = BaseTest.TestResult.NT
        if (thread?.isAlive != true) {
            thread = Thread {
                tests = CodeVisitor(ResVisitor().visit(parseQueryResult(results)), DBServer.getInstance()).visit(parseTestScript(code))!!
                if (selected or necessarily) {
                    for (i in tests)
                        i.execute()
                }
                DBServer.returnInstance()
                for (i in tests)
                {
                    conclusion = conclusion and i.conclusion
                }
                if (conclusion==BaseTest.TestResult.NT)
                    conclusion=BaseTest.TestResult.OK
                parent.updateConclusion()
            }
            thread?.start()
        }
    }

    init {
        val inDir = File("$dir\\$name.in")
        val outDir = File("$dir\\$name.out")
        if (inDir.exists())
            code = inDir.readText()
        else {
            inDir.createNewFile()
            code = "@test \"${name}\"\n{\n}"
            inDir.writeText(code)
        }
        if (outDir.exists())
            results = outDir.readText()
        else {
            outDir.createNewFile()
            results = ""
        }
        type = HierarchyType.script
        try {
            tests = CodeVisitor(ResVisitor().visit(parseQueryResult(results))).visit(parseTestScript(code))!!
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
    }

    fun update(_name: String?, newCode: String?, updRes: Boolean = false) {
        if (thread?.isAlive != true) {
            var _path = Paths.get("").toAbsolutePath().toString()
            var path = "$_path\\Tester\\tests\\$gr"
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
                    val inDir = File("$path\\$name.in")
                    val outDir = File("$path\\$name.out")
                    inDir.delete()
                    outDir.delete()
                    name = _name.trim()
                    update(null, code, true)
                }
            if (newCode != null) {
                var inFile = File("$path\\$name.in")

                inFile.delete()
                inFile.createNewFile()
                code = newCode
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

