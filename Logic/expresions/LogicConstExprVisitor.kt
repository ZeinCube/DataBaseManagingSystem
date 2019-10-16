package expresions

import antlr.HelloBaseVisitor
import antlr.HelloParser

class LogicConstExprVisitor: HelloBaseVisitor<LogicConstExpr>() {
    private class opSwitch:HelloBaseVisitor<operation>()
    {
        private class constAnd:operation
        {
            override fun op(i1: Boolean, i2: Boolean):Boolean {
                return i1 and i2;
            }
        }
        private class constOr:operation
        {
            override fun op(i1: Boolean, i2: Boolean):Boolean {
                return i1 or i2;
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
        fun op(i1:Boolean,i2:Boolean):Boolean
    }

    override fun visitNot_const_logic_expr(ctx: HelloParser.Not_const_logic_exprContext?): LogicConstExpr {
        return  this.visit(ctx!!.children[1]).not()
    }

    override fun visitB_const_logic_expr(ctx: HelloParser.B_const_logic_exprContext?): LogicConstExpr {
        return  this.visit(ctx!!.children[1])
    }

    override fun visitConst_logic_expr(ctx: HelloParser.Const_logic_exprContext?): LogicConstExpr {
        if (ctx!!.childCount==1)
        {
            return this.visit(ctx!!.children[0])
        }else
        {
            return LogicConstExpr(opSwitch().visit(ctx!!.children[1]).op(this.visit(ctx!!.children[0]).execute(),this.visit(ctx!!.children[2]).execute()))
        }

    }

    override fun visitConst_arifm_expr(ctx: HelloParser.Const_arifm_exprContext?): LogicConstExpr {
        return super.visitConst_arifm_expr(ctx)
    }

    override fun visitConst_compare_expr(ctx: HelloParser.Const_compare_exprContext?): LogicConstExpr {
        return super.visitConst_compare_expr(ctx)
    }

    override fun visitLogic_literal(ctx: HelloParser.Logic_literalContext?): LogicConstExpr {
        return this.visit(ctx!!.children[0])
    }

    override fun visitConst_expr(ctx: HelloParser.Const_exprContext?): LogicConstExpr {
        return LogicConstExpr(ConstExprVisitor().visit(ctx).execute() as Boolean)
    }

    override fun visitMychar(ctx: HelloParser.MycharContext?): LogicConstExpr {
        return LogicConstExpr(true);
    }

    override fun visitMyfalse(ctx: HelloParser.MyfalseContext?): LogicConstExpr {
        return LogicConstExpr(false);
    }
}