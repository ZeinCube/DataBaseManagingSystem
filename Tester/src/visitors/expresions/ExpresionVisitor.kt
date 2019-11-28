package visitors.expresions

import parser.testscriptparser.TestScriptBaseVisitor
import parser.testscriptparser.TestScriptParser


class ExpresionVisitor(val variables: HashMap<String, Variable>) : TestScriptBaseVisitor<Variable>() {
    override fun visitExpr(ctx: TestScriptParser.ExprContext?): Variable {
        return when (ctx!!.childCount) {
            (1) -> this.visit(ctx.getChild(0))
            (2) -> this.visit(ctx.expr(0)).unOp(ctx.unary_operator().text)
            (3) -> this.visit(ctx.left_op).operation(this.visit(ctx.right_op), ctx.op.text)
            else -> throw Throwable("Parser wrong")
        }
    }

    override fun visitCast_operation(ctx: TestScriptParser.Cast_operationContext?): Variable {
        return this.visit(ctx!!.expr()).castAs(ctx.type_name().text)
    }



    override fun visitB_expr(ctx: TestScriptParser.B_exprContext?): Variable {
        return this.visit(ctx!!.getChild(1))
    }

    override fun visitLiteral_value(ctx: TestScriptParser.Literal_valueContext?): Variable {
        return this.visit(ctx!!.children[0])
    }

    override fun visitId(ctx: TestScriptParser.IdContext?): Variable {
        if (variables[ctx!!.text] != null)
            return variables[ctx.text]!!
        else {
            throw Throwable("Variable not found")
        }
    }

    override fun visitMyBool(ctx: TestScriptParser.MyBoolContext?): Variable {
        return BoolVar(ctx!!.`val`)
    }

    override fun visitMyString(ctx: TestScriptParser.MyStringContext?): Variable {
        return StringVar(ctx!!.`val`)
    }

    override fun visitMyDouble(ctx: TestScriptParser.MyDoubleContext?): Variable {
        return DoubleVar(ctx!!.`val`)
    }

    override fun visitMyInt(ctx: TestScriptParser.MyIntContext?): Variable {
        return IntVar(ctx!!.`val`)
    }

}