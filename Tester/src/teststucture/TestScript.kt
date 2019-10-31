package teststucture

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import parser.TestGrammarLexer
import parser.TestGrammarParser
import teststucture.tests.BaseTest
import teststucture.tests.TestResult
import visitors.CodeVisitor
import visitors.ResVisitor
import java.io.File
import java.nio.file.Paths


interface MyFunction {
    fun invoke()
}
enum class HierarchyType
{
    root,
    group,
    script
}

abstract class TestsHierarchy(var name: String)
{
    constructor() : this("")
    var conclusion: TestResult = TestResult.NT
    lateinit var type: HierarchyType
    var selected: Boolean = true
    abstract fun checkTests()
}

open class TestScript : TestsHierarchy {


    override fun checkTests() {
        conclusion = TestResult.NT
        if (selected) {
            try {
                val lexerIn = TestGrammarLexer(CharStreams.fromString(code))
                val lexerOut = TestGrammarLexer(CharStreams.fromString(results))
                val commonTokenStreamIn = CommonTokenStream(lexerIn)
                val commonTokenStreamOut = CommonTokenStream(lexerOut)
                commonTokenStreamIn.fill()
                commonTokenStreamOut.fill()
                val parserIn = TestGrammarParser(commonTokenStreamIn)
                val parserOut = TestGrammarParser(commonTokenStreamOut)

                var treeIn: ParseTree? = null
                var treeOut: ParseTree? = null
                try {
                    // вызываем парсинг по правилу
                    treeIn = parserIn.parseIn()
                    treeOut = parserOut.parseOut()

                } catch (e: Exception) {
                    // обрабатываем ошибки
                    println("Error: ${e.message}")
                    throw e
                }
                tests = CodeVisitor(ResVisitor().visit(treeOut) as Array<BaseTest>).visit(treeIn) as Array<BaseTest>

                updaters.forEach { it.invoke() }
            } catch (e: Exception) {
                throw e
            }
        }
    }

    var tests: Array<BaseTest> = arrayOf()
    lateinit var gr: String
    lateinit var code: String
    lateinit var results: String

    constructor(name: String, dir: String, _gr: String) : super(name) {
        gr = _gr
        val inDir = File("$dir\\$name.in")
        val outDir = File("$dir\\$name.out")
        if (inDir.exists())
            code = inDir.readText()
        else {
            inDir.createNewFile()
            code="@test \"${name}\"\n"
        }
        if (outDir.exists())
            results = outDir.readText()
        else {
            outDir.createNewFile()
            results = ""
        }
        type = HierarchyType.script
    }

    fun update(_name: String, newCode: String,newResults:Array<String>) {
        var _path = Paths.get("").toAbsolutePath().toString()
        var path = "$_path\\tests\\$gr"
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
        if (newCode != code) {
            var inFile = File("$path\\$name.in")
            var outFile = File("$path\\$name.out")

            inFile.delete()
            outFile.delete()
            inFile.createNewFile()
            outFile.createNewFile()

            inFile.writeText(code)
            for (i in newResults)
                outFile.writeText(i+"\n")

        }
        updaters.forEach { it.invoke() }
    }


    var updaters: Array<MyFunction> = arrayOf()

}

