package teststucture.hierarchy

import DataBase
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


    override fun checkTests(necessarily:Boolean) {
        conclusion = BaseTest.TestResult.NT
        if (selected or necessarily) {
            val database = DataBase()
            tests = CodeVisitor(ResVisitor().visit(parseQueryResult(results))).visit(parseTestScript(code))!!
            for (i in tests)
                i.execute(database)
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
            code="@test \"${name}\"\n{\n}"
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
        }catch (ex:Exception)
        {
            ex.printStackTrace()
        }
        //todo


    }

    fun update(_name: String?, newCode: String?, newResults: List<String>?) {
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
        if (newResults!= null)
        {
            var outFile = File("$path\\$name.out")
            outFile.delete()
            outFile.createNewFile()
            var i = ""
            newResults.forEach { i=i+it+"\n" }
            outFile.writeText(i)
        }
        updaters.forEach { it.invoke() }
    }


    var updaters: Array<MyFunction> = arrayOf()

}

