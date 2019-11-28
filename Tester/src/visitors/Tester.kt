package visitors

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree

class test<T>(t:T) {
    var value:T = t
}

class Tester {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var t = test(5)

            val str = "@test \"sdvcs\"\n" +
                    "{\n" +
                    "    @test: \"scsc\"+\"(\"+\")\"\n" +
                    "    @for( @i:=0;@i<5;@i:=@i+1)\n" +
                    "    {\n" +
                    "        @cols := \"i1 int unique\"\n" +
                    "        @for(@j:=0;@j<@i;@j:=@j+1)\n" +
                    "        {\n" +
                    "           @cols := @cols + \",i\"+ @cast @j+2 as string +\" int unique\"\n" +
                    "        }\n" +
                    "        @test: \"create table t\"+ @cast @i as string +\"(\"+ @cols+\")\"\n @check" +
                    "    }\n" +
                    "}"

        //    visitor.visit(tree);

        //    println(res)

        }
    }
}