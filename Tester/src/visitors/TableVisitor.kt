package visitors

import parser.sqlqueryresultparser.QueryResultBaseVisitor
import parser.sqlqueryresultparser.QueryResultParser
import parser.testscriptparser.TestScriptParser
import teststucture.queryresults.Table
import visitors.expresions.*

class TableVisitor: QueryResultBaseVisitor<Table?>() {
    var out :Table = Table(false)

    override fun visitRq_table(ctx: QueryResultParser.Rq_tableContext?): Table? {
        ctx?.children?.forEach{this.visit(it)}
        out.ordered = ctx?.K_ORDERED() != null
        return out;
    }

    override fun visitColumn_name_list(ctx: QueryResultParser.Column_name_listContext?): Table? {
        ctx?.id()?.forEach{out.plus(it.text+"".toString())}
        return null
    }

    override fun visitLiteral_value(ctx: QueryResultParser.Literal_valueContext?): Table? {
        this.visit(ctx!!.children[0])
        return null
    }
    lateinit var rec:Table.Record
    override fun visitRecord(ctx: QueryResultParser.RecordContext?): Table? {
        rec=Table.Record()
        ctx?.children?.map{this.visit(it)}
        out.plus(rec)
        return null
    }

    override fun visitMyString(ctx: QueryResultParser.MyStringContext?): Table? {
        rec.plus("\"${ctx!!.`val`}\"")
        return null
    }

    override fun visitMyDouble(ctx: QueryResultParser.MyDoubleContext?): Table? {
        rec.plus(ctx!!.`val`.toString())
        return null
    }

    override fun visitMyInt(ctx: QueryResultParser.MyIntContext?): Table? {
        rec.plus(ctx!!.`val`.toString())
        return null
    }

    override fun visitMyNull(ctx: QueryResultParser.MyNullContext?): Table? {
        rec.plus(null.toString())
        return null
    }

}