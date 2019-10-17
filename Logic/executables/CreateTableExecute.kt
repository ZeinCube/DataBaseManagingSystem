package executables

import antlr.HelloBaseListener
import antlr.HelloParser
import meta.ColumnDef
import meta.TableDefinition
import org.antlr.v4.runtime.tree.ParseTreeWalker


class CreateTableExecutable(ctx: HelloParser.Table_definitionContext) : Executable<String>, TableDefinition() {



    override fun execute(i:Any?): String {


        return "Table ${name} created"
    }

    init {
        name = ctx.name().text
        val listener = object : HelloBaseListener() {
            override fun enterColumn_def(ctx: HelloParser.Column_defContext?) {
                val listener = object : HelloBaseListener() {
                    var res: ColumnDef = ColumnDef();
                    override fun enterName(ctx: HelloParser.NameContext?) {
                        res.name = ctx!!.text
                    }

                    override fun enterColumn_constraint(ctx: HelloParser.Column_constraintContext?) {
                        res.sp = {
                            when (ctx!!.text.toLowerCase()) {
                                ("primary key") -> {
                                    ColumnDef.Specificators.primary_key
                                }
                                ("unique") -> {
                                    ColumnDef.Specificators.unique
                                }
                                else -> throw Throwable("Not implemented specifications")
                            }
                        }()
                    }

                    override fun enterMyfloat(ctx: HelloParser.MyfloatContext?) {
                        res.t = ColumnDef.MyType.float
                    }

                    override fun enterMyint(ctx: HelloParser.MyintContext?) {
                        res.t = ColumnDef.MyType.int
                    }

                    override fun exitMychar(ctx: HelloParser.MycharContext?) {
                        res.t = ColumnDef.MyType.char
                        try {
                            res.t.length = ctx!!.NUMBER().text.toInt()
                        } catch (a: Throwable) {
                            res.t.length = 1;
                        }
                    }
                }
                val walker = ParseTreeWalker()
                walker.walk(listener, ctx)
                columns += listener.res;
            }

        }
        val walker = ParseTreeWalker()
        walker.walk(listener, ctx)
    }

}

