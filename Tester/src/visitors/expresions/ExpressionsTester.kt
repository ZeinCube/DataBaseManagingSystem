package visitors.expresions

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import parser.testscriptparser.TestScriptLexer
import parser.testscriptparser.TestScriptParser
import teststucture.hierarchy.TestScript

private class ExpressionsTester {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            for (i in 1..1000) {
                val str = readLine()
                val lexer = TestScriptLexer(CharStreams.fromString(str))


                val commonTokenStream = CommonTokenStream(lexer)
                commonTokenStream.fill()
                val parser = TestScriptParser(commonTokenStream)

                var tree: ParseTree? = null
                try {
                    // вызываем парсинг по правилу
                    tree = parser.expr()
                } catch (e: Exception) {
                    // обрабатываем ошибки
                    println("Error: ${e.message}")
                }

                var res = ""
                val visitor = ExpresionVisitor(HashMap())
                val ex = visitor.visit(tree);
                res += ex.getValue().toString();

                println(res)

            }
        }
    }
}