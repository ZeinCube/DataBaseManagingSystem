package expresions

import antlr.HelloBaseVisitor
import antlr.HelloParser

class ConstLogicExprVisitor: HelloBaseVisitor<Boolean?>() {
    private class opSwitch:HelloBaseVisitor<operation>()
    {
        private class constAnd:operation
        {
            override fun op(i1: Boolean?, i2: Boolean?):Boolean? {
                if ((i1 != null) and (i2 != null)) {
                    return i1!! and i2!!
                }else
                {
                    return null
                }
            }
        }

        private class constOr:operation
        {
            override fun op(i1: Boolean?, i2: Boolean?):Boolean? {
                if ((i1 != null) and (i2 != null)) {
                    return i1!! or i2!!
                }else
                {
                    return null
                }
            }
        }
        override fun visitAnd(ctx: HelloParser.AndContext?): operation {
            return constAnd()
        }
        override fun visitOr(ctx: HelloParser.OrContext?): operation {
            return constOr()
        }

    }
    private interface operation{
        fun op(i1:Boolean?,i2:Boolean?):Boolean?
    }

    override fun visitNot_const_logic_expr(ctx: HelloParser.Not_const_logic_exprContext?): Boolean? {
        val res = this.visit(ctx!!.children[1])
        if (res!=null)
            return !res
        else
            return null
    }

    override fun visitB_const_logic_expr(ctx: HelloParser.B_const_logic_exprContext?): Boolean? {
        return  this.visit(ctx!!.children[1])
    }

    override fun visitConst_logic_expr(ctx: HelloParser.Const_logic_exprContext?): Boolean? {
        if (ctx!!.childCount==1)
        {
            return this.visit(ctx.children[0])
        }else
        {
            return opSwitch().visit(ctx.children[1]).op(this.visit(ctx.children[0]),this.visit(ctx.children[2]))
        }

    }
    override fun visitConst_arifm_expr(ctx: HelloParser.Const_arifm_exprContext?): Boolean? {
        val res = ConstArifmExprVisitor().visit(ctx)
        if (res!=null)
            return res != "0"
        else
            return null
    }

    override fun visitConst_compare_expr(ctx: HelloParser.Const_compare_exprContext?): Boolean? {
        return ConstCompExprVisitor().visit(ctx)
    }

    override fun visitLogic_literal(ctx: HelloParser.Logic_literalContext?): Boolean? {
        return this.visit(ctx!!.children[0])
    }

    override fun visitConst_expr(ctx: HelloParser.Const_exprContext?): Boolean? {
        return ConstExprVisitor().visit(ctx) as Boolean?
    }

    override fun visitMychar(ctx: HelloParser.MycharContext?): Boolean? {
        return true;
    }

    override fun visitMyfalse(ctx: HelloParser.MyfalseContext?): Boolean? {
        return false;
    }
}