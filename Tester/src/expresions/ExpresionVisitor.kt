package expresions

import org.antlr.v4.runtime.tree.TerminalNode
import parser.TestGrammarBaseVisitor
import parser.TestGrammarParser


class ExpresionVisitor(val variables: HashMap<String, Variable>) : TestGrammarBaseVisitor<Variable>() {
    override fun visitExpr(ctx: TestGrammarParser.ExprContext?): Variable {
        return when (ctx!!.childCount) {
            (1) -> this.visit(ctx.getChild(0))
            (2) -> this.visit(ctx.getChild(1)).unOp(ctx.unary_operator().text)
            (3) -> this.visit(ctx.getChild(0)).operation(this.visit(ctx.getChild(2)), ctx.getChild(1).text)
            (4) -> this.visit(ctx.getChild(1)).castAs(ctx.type_name().text)
            else -> throw Throwable("Parser wrong")
        }
    }

    override fun visitB_expr(ctx: TestGrammarParser.B_exprContext?): Variable {
        return this.visit(ctx!!.getChild(1))
    }

    override fun visitLiteral_value(ctx: TestGrammarParser.Literal_valueContext?): Variable {
        return this.visit(ctx!!.children[0])
    }

    override fun visitId(ctx: TestGrammarParser.IdContext?): Variable {
        if (variables[ctx!!.text] != null)
            return variables[ctx.text]!!
        else {
            throw Throwable("Variable not found")
        }
    }

    override fun visitMyFalse(ctx: TestGrammarParser.MyFalseContext?): Variable {
        return BoolVar(false)
    }

    override fun visitMyTrue(ctx: TestGrammarParser.MyTrueContext?): Variable {
        return BoolVar(true)
    }

    override fun visitMyString(ctx: TestGrammarParser.MyStringContext?): Variable {
        return StringVar(ctx!!.text)
    }

    override fun visitMyDouble(ctx: TestGrammarParser.MyDoubleContext?): Variable {
        return DoubleVar(ctx!!.text.toDouble())
    }

    override fun visitMyInt(ctx: TestGrammarParser.MyIntContext?): Variable {
        return IntVar(ctx!!.text.toInt())
    }

}