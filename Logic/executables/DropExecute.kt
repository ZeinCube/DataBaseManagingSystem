package executables

import antlr.HelloBaseListener
import antlr.HelloParser
import org.antlr.v4.runtime.tree.ParseTreeWalker
import visitors.Executable

class DropExecute(ctx: HelloParser.DropContext?) : Executable {
    var names:Array<String> = arrayOf();
    init {
        val listener = object : HelloBaseListener()
        {
            override fun enterName(ctx: HelloParser.NameContext?) {
                names+=ctx!!.text
            }
        }
        val walker = ParseTreeWalker()
        walker.walk(listener, ctx)
    }

    override fun execute(): String {
        //todo Drop Table in Engine
        if (names.size==1)
            return "Table ${names[0]} was destroyed"
        else
        {
            var s = ""
            for (i in names)
                s+= names + ", "
            return "Table ${s.subSequence(0,s.length-2)} was destroyed"
        }
    }
}