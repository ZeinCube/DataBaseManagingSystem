package executables

import antlr.HelloBaseListener
import antlr.HelloParser
import meta.ColumnDef
import meta.TableDefinition
import org.antlr.v4.runtime.tree.ParseTreeWalker
import visitors.Executable

class ShowCreateExecute(ctx: HelloParser.Show_createContext?) : Executable {
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
        var tables = arrayOf<TableDefinition>()

        //todo Load Meta from engine in Engine

        
        var res = ""
        for (table in tables)
        {
            res+= "create table ${table.name}"
            res+="("
            for(c in table.columns)
            {
                res+= c.toString()+", "
            }
            res = res.substring(0,res.length-3)+")\n"
        }
        return res
    }
}