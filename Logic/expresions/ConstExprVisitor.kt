package expresions

import antlr.HelloBaseVisitor
import antlr.HelloParser

class ConstExprVisitor: HelloBaseVisitor<ConstExpresion<Any>>() {
    override fun visitConst_arifm_expr(ctx: HelloParser.Const_arifm_exprContext?): ConstExpresion<Any> {
        return super.visitConst_arifm_expr(ctx)
    }

    override fun visitConst_logic_expr(ctx: HelloParser.Const_logic_exprContext?): ConstExpresion<Any> {
        return ConstExpresion(LogicConstExprVisitor().visit(ctx!!.children[0]))
    }

    override fun visitConst_compare_expr(ctx: HelloParser.Const_compare_exprContext?): ConstExpresion<Any> {
        return super.visitConst_compare_expr(ctx)
    }

}