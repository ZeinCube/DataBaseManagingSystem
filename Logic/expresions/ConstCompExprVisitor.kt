package expresions

import antlr.HelloBaseVisitor
import antlr.HelloParser

class ConstCompExprVisitor: HelloBaseVisitor<Boolean?>() {
    private class opSwitch : HelloBaseVisitor<operation>() {

        private class opEq : operation {
            override fun op(i1:Any?, i2: Any?): Boolean? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 == i2;
                }catch (ex:Throwable)
                {
                    throw Throwable("Сравнение несрвнимых типов")
                }
            }
        }
        private class opNeq : operation {
            override fun op(i1:Any?, i2: Any?): Boolean? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 != i2;
                }catch (ex:Throwable)
                {
                    throw Throwable("Сравнение несрвнимых типов")
                }
            }
        }
        private class opMoreEq : operation {
            override fun op(i1:Any?, i2: Any?): Boolean? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as Double >= i2 as Double
                }catch (ex:Throwable)
                {
                    throw Throwable("Сравнение несрвнимых типов")
                }
            }
        }
        private class opMore : operation {
            override fun op(i1:Any?, i2: Any?): Boolean? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as Double > i2 as Double
                }catch (ex:Throwable)
                {
                    throw Throwable("Сравнение несрвнимых типов")
                }
            }
        }
        private class opLess : operation {
            override fun op(i1:Any?, i2: Any?): Boolean? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return (i1 as Double) < i2 as Double
                }catch (ex:Throwable)
                {
                    throw Throwable("Сравнение несрвнимых типов")
                }
            }
        }
        private class opLessEq : operation {
            override fun op(i1:Any?, i2: Any?): Boolean? {
                if (i1==null || i2 == null)
                    return null
                try {
                    return i1 as Double <= i2 as Double
                }catch (ex:Throwable)
                {
                    throw Throwable("Сравнение несрвнимых типов")
                }
            }
        }

        override fun visitComp_op1(ctx: HelloParser.Comp_op1Context?): operation {
            return this.visit(ctx!!.children[0])
        }
        override fun visitComp_op2(ctx: HelloParser.Comp_op2Context?): operation {
            return this.visit(ctx!!.children[0])
        }

        override fun visitEq(ctx: HelloParser.EqContext?): operation {
            return opEq()
        }

        override fun visitNeq(ctx: HelloParser.NeqContext?): operation {
            return opNeq();
        }

        override fun visitMoreeq(ctx: HelloParser.MoreeqContext?): operation {
            return opMoreEq()
        }

        override fun visitMore(ctx: HelloParser.MoreContext?): operation {
            return opMore()
        }

        override fun visitLess(ctx: HelloParser.LessContext?): operation {
            return opLess()
        }

        override fun visitLesseq(ctx: HelloParser.LesseqContext?): operation {
            return opLessEq()
        }
    }
    private interface operation{
        fun op(i1:Any?,i2:Any?):Boolean?
    }

    override fun visitConst_compare_expr(ctx: HelloParser.Const_compare_exprContext?): Boolean? {
        if (ctx!!.childCount==1)
        {
            return this.visit(ctx.children[0])
        }else
        {
            return opSwitch().visit(ctx.children[1]).op(
                    ConstArifmExprVisitor().visit(ctx.children[0]),ConstArifmExprVisitor().visit(ctx.children[2]))
        }
    }
}