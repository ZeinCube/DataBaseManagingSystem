package visitors

import visitors.expresions.*
import parser.*
import teststucture.tests.BaseTest
import teststucture.tests.ErrorTest
import teststucture.tests.SimpleTest
import teststucture.tests.SkipTest

class ResVisitor: TestGrammarBaseVisitor<Array<BaseTest>>()
{
    override fun visitParseOut(ctx: TestGrammarParser.ParseOutContext?): Array<BaseTest> {
        var out = arrayOf<BaseTest>()
        if (ctx!!.childCount>0)
        for (i in ctx!!.children)
            out+= this.visit(i)[0]
        return out;
    }

    override fun visitResult(ctx: TestGrammarParser.ResultContext?): Array<BaseTest> {
        return this.visit(ctx!!.children[0])
    }

    override fun visitRt_error(ctx: TestGrammarParser.Rt_errorContext?): Array<BaseTest> {
        return arrayOf(ErrorTest(ExpresionVisitor(HashMap()).visit(ctx!!.expr(0)).castAs("string").getValue() as String,
                ExpresionVisitor(HashMap()).visit(ctx!!.expr(1)).castAs("string").getValue() as String))
    }

    override fun visitRt_res(ctx: TestGrammarParser.Rt_resContext?): Array<BaseTest> {
        return arrayOf(SimpleTest(ExpresionVisitor(HashMap()).visit(ctx!!.expr()).castAs("string").getValue() as String))
    }

    override fun visitRt_skip(ctx: TestGrammarParser.Rt_skipContext?): Array<BaseTest> {
        return arrayOf(SkipTest())
    }

    override fun visitRt_simple(ctx: TestGrammarParser.Rt_simpleContext?): Array<BaseTest> {
        return arrayOf(SimpleTest(ctx!!.STRING_LITERAL().text.substring(1,ctx!!.STRING_LITERAL().text.length-1).replace("\\\"","\"")))
    }

}