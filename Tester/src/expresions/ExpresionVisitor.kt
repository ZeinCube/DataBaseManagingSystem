package expresions

import parser.TestGrammarBaseVisitor
import parser.TestGrammarParser


class ExpresionVisitor:TestGrammarBaseVisitor<Variable>()
{
    override fun visitExpr(ctx: TestGrammarParser.ExprContext?): Variable {
        return when(ctx!!.childCount)
        {
            (1)-> this.visit(ctx.getChild(0))
            (2)-> this.visit(ctx.getChild(1)).unOp(ctx.unary_operator().text)
            (3)-> this.visit(ctx.getChild(0)).operation(this.visit(ctx.getChild(0)),ctx.getChild(1).text)
            (4)-> this.visit(ctx.getChild(1)).castAs(ctx.type_name().text)
            else ->throw Throwable("Parser wrong")
        }
    }

    override fun visitB_expr(ctx: TestGrammarParser.B_exprContext?): Variable {
        return this.visit(ctx!!.getChild(1))
    }

}