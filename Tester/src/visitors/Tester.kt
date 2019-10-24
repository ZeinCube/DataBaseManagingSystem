package visitors

import expresions.ExpresionVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import parser.TestGrammarLexer
import parser.TestGrammarParser

class Tester {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val str = "@test \"sdvcs\"\n" +
                    "{\n" +
                    "    @test: \"scsc\"+\"(\"+\")\"\n" +
                    "    @for( @i:=0;@i<5;@i:=@i+1)\n" +
                    "    {\n" +
                    "        @cols := \"i1 int unique\"\n" +
                    "        @for(@j:=0;@j<@i+1;@j:=@j+1)\n" +
                    "        {\n" +
                    "           @cols := @cols + \",i\"+ @cast @j+1 as string +\" int unique\"\n" +
                    "        }\n" +
                    "        @test: \"create table t\"+ @cast @i as string +\"(\"+ @cols+\")\"\n" +
                    "    }\n" +
                    "}"
            val lexer = TestGrammarLexer(CharStreams.fromString(str))


            val commonTokenStream = CommonTokenStream(lexer)
            commonTokenStream.fill()
            val parser = TestGrammarParser(commonTokenStream)

            var tree: ParseTree? = null
            try {
                // вызываем парсинг по правилу
                tree = parser.parseIn()
            } catch (e: Exception) {
                // обрабатываем ошибки
                println("Error: ${e.message}")
            }

            var res = ""
            val visitor = StartCodeVisitor()
            visitor.visit(tree);

            println(res)

        }
    }
}