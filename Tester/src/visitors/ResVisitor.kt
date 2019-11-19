package visitors

import parser.sqlqueryresultparser.QueryResultBaseVisitor
import parser.sqlqueryresultparser.QueryResultParser
import teststucture.queryresults.*


class ResVisitor : QueryResultBaseVisitor<Array<BaseRes>>() {
    private fun stringTransform(s: String): String {
        return s.substring(1, s.length - 1).replace("\\\"", "\"")
    }

    override fun visitParse(ctx: QueryResultParser.ParseContext?): Array<BaseRes> {
        var out = arrayOf<BaseRes>()
        if (ctx!!.childCount > 0)
            for (i in ctx.children) {
                val res = this.visit(i)
                if (res != null)
                    out += res[0]
            }
        return out;
    }

    override fun visitQuery_result(ctx: QueryResultParser.Query_resultContext?): Array<BaseRes> {
        return this.visit(ctx!!.children[0])
    }
    override fun visitRq_error(ctx: QueryResultParser.Rq_errorContext?): Array<BaseRes> {
        return arrayOf(ErrorRes(ctx!!.ex.`val`, ctx.what.`val`))
    }

    override fun visitRq_executed(ctx: QueryResultParser.Rq_executedContext?): Array<BaseRes> {
        return arrayOf(ExecutedRes())
    }

    override fun visitRq_string(ctx: QueryResultParser.Rq_stringContext?): Array<BaseRes> {
        return arrayOf(StringRes(ctx!!.myString().`val`))
    }

    override fun visitRq_table(ctx: QueryResultParser.Rq_tableContext?): Array<BaseRes> {
        return arrayOf(TableRes(TableVisitor().visit(ctx)!!))
    }

    override fun visitRq_void(ctx: QueryResultParser.Rq_voidContext?): Array<BaseRes> {
        return arrayOf(VoidRes())
    }

}