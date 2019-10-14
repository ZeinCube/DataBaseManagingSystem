package executables

import antlr.HelloBaseListener
import antlr.HelloBaseVisitor
import antlr.HelloParser
import visitors.Executable
import org.antlr.v4.runtime.tree.ParseTreeWalker



class CreateTableExecutable: Executable
{
    constructor(ctx: HelloParser.Table_definitionContext)
    {
        name = ctx.table_name().text
        val listener = object : HelloBaseListener() {
            override fun enterColumn_def(ctx: HelloParser.Column_defContext?) {
                columns+= ColumnDef(ctx!!.IDENTIFIER().text,ColumnDef.MyType.parse(ctx.type()),ColumnDef.Specificators.parse(ctx.column_constraint()))
            }

        }
        val walker = ParseTreeWalker()
        walker.walk(listener, ctx)
    }
    class ColumnDef(
            var name:String = "",
            var t:MyType,
            var sp: Specificators? = null)
    {

        enum class MyType {
            int,
            char,
            float;
            companion object {
                fun parse(ctx: HelloParser.TypeContext):MyType {
                    val little_v = object : HelloBaseVisitor<MyType>()
                    {
                        override fun visitType(ctx: HelloParser.TypeContext?): MyType {
                            when (ctx!!.text)
                            {
                                ("int")->{return int}
                                ("char")->{return char}
                                ("float")->{return float}
                            }
                            throw Throwable();
                        }
                    }

                    return little_v.visit(ctx);
                }
            }
        }
        enum class Specificators
        {
            unique,
            primary_key;
            companion object {
                fun parse(ctx: HelloParser.Column_constraintContext):Specificators? {
                    return null;
                }
            }
        }
    }

    var name:String  = "";
    var columns:Array<ColumnDef> = arrayOf()


    override fun execute(): String {
        //todo Create Table in Engine
        return "Table $ created"
    }

}