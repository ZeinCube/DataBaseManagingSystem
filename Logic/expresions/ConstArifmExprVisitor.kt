package expresions

import antlr.HelloBaseVisitor
import antlr.HelloParser
import org.antlr.v4.runtime.tree.ParseTree

class ConstArifmExprVisitor: HelloBaseVisitor<Any?>() {
    private interface operation{
        fun op(i1:Any?,i2:Any?):Any?
    }
    private class opSwitch : HelloBaseVisitor<operation>() {
        private class opMul : operation {
            override fun op(i1:Any?, i2: Any?):Any? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as Double * i2 as Double
                }
                catch (ex:Throwable)
                {
                    throw Throwable("Умножение неумножаемых типов")
                }
            }
        }
        private class opDiv : operation {
            override fun op(i1:Any?, i2: Any?): Any? {
                if (i1==null || i2 == null)
                    return null
                if (i2 is Double)
                {
                    if (i2 as Double == 0.0)
                        throw Throwable("Деление на 0")
                }
                try {
                    return i1 as Double / i2 as Double;
                }catch (ex:Throwable)
                {
                    throw Throwable("Деление неделимых типов")
                }
            }
        }
        private class opAdd : operation {
            override fun op(i1:Any?, i2: Any?): Any? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as Double + i2 as Double
                }catch (ex:Throwable)
                {
                    throw Throwable("Сложение нескладываемых типов")
                }
            }
        }
        private class opSub : operation {
            override fun op(i1:Any?, i2: Any?): Any? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as Double - i2 as Double
                }catch (ex:Throwable)
                {
                    throw Throwable("Вычитание неподходящих типов")
                }
            }
        }
        private class opConcate : operation {
            override fun op(i1:Any?, i2: Any?): Any? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as String + i2 as String
                }catch (ex:Throwable)
                {
                    throw Throwable("Сложение строки с числом")
                }
            }
        }

        override fun visitComp_op1(ctx: HelloParser.Comp_op1Context?): operation {
            return this.visit(ctx!!.children[0])
        }
        override fun visitComp_op2(ctx: HelloParser.Comp_op2Context?): operation {
            return this.visit(ctx!!.children[0])
        }


        override fun visitMul(ctx: HelloParser.MulContext?): operation {
            return opMul()
        }

        override fun visitDiv(ctx: HelloParser.DivContext?): operation {
            return opDiv()
        }

        override fun visitSub(ctx: HelloParser.SubContext?): operation {
            return opSub()
        }

        override fun visitAdd(ctx: HelloParser.AddContext?): operation {
            return opAdd()
        }

        override fun visitConcate(ctx: HelloParser.ConcateContext?): operation {
            return opConcate()
        }
    }

    override fun visitConst_arifm_expr(ctx: HelloParser.Const_arifm_exprContext?): Any? {
        if (ctx!!.childCount==1)
        {
            return this.visit(ctx.children[0])
        }else
        {
            return opSwitch().visit(ctx.children[1]).op(
                    this.visit(ctx.children[0]),
                    this.visit(ctx.children[2])
            )
        }
    }

    override fun visitMynull(ctx: HelloParser.MynullContext?): Any? {
        return null
    }

    override fun visitB_const_arifm_expr(ctx: HelloParser.B_const_arifm_exprContext?): Any? {
        return this.visit(ctx!!.children[0])
    }

    override fun visitSub_const_arifm_expr(ctx: HelloParser.Sub_const_arifm_exprContext?): Any? {
        val res = this.visit(ctx!!.children[0])
        if (res == null)
            return null;
        try {
            return -(res as Double)
        }
        catch (ex:Throwable)
        {
            throw Throwable("- String")
        }
    }

    override fun visitMynumber(ctx: HelloParser.MynumberContext?): Any? {
        return ctx!!.text.toDouble()
    }

    override fun visitMystring(ctx: HelloParser.MystringContext?): Any? {
        return ctx!!.text;
    }
}