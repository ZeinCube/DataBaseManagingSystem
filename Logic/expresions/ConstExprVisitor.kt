package expresions

import antlr.HelloBaseVisitor
import antlr.HelloParser

class ConstExprVisitor: HelloBaseVisitor<Any?>() {
    override fun visitConst_arifm_expr(ctx: HelloParser.Const_arifm_exprContext?): Any? {
        return ConstArifmExprVisitor().visit(ctx)
    }

    override fun visitConst_logic_expr(ctx: HelloParser.Const_logic_exprContext?): Any? {
        return ConstLogicExprVisitor().visit(ctx)
    }

    override fun visitConst_compare_expr(ctx: HelloParser.Const_compare_exprContext?): Any? {
        return ConstCompExprVisitor().visit(ctx)
    }

}