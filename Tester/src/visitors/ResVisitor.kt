package visitors

import parser.*
import teststucture.tests.BaseTest
import teststucture.tests.ErrorTest
import teststucture.tests.StringTest
import teststucture.tests.SkipTest

class ResVisitor: TestGrammarBaseVisitor<Array<BaseTest>>()
{
    private fun stringTransform(s:String):String
    {
        return s.substring(1, s.length-1).replace("\\\"","\"")
    }
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
        return arrayOf(ErrorTest(stringTransform(ctx!!.error!!.text),stringTransform(ctx!!.what!!.text)))
    }

    override fun visitRt_skip(ctx: TestGrammarParser.Rt_skipContext?): Array<BaseTest> {
        return arrayOf(SkipTest())
    }

    override fun visitRt_string(ctx: TestGrammarParser.Rt_stringContext?): Array<BaseTest> {
        return arrayOf(StringTest(stringTransform(ctx!!.res.text)))
    }

}