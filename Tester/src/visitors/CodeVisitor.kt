package visitors

import clientsevrver.DBClient
import clientsevrver.DBServer
import parser.testscriptparser.TestScriptBaseVisitor
import parser.testscriptparser.TestScriptParser
import teststucture.queryresults.BaseRes
import teststucture.queryresults.VoidRes
import visitors.expresions.ExpresionVisitor
import visitors.expresions.StringVar
import visitors.expresions.Variable
import teststucture.tests.BaseTest
import teststucture.tests.SQLQuery
import teststucture.tests.SingleQueryTest
import java.util.*
import kotlin.collections.HashMap

class CodeVisitor(exp:Array<BaseRes>,var server:DBServer? = null) : TestScriptBaseVisitor<Array<BaseTest>?>() {
    lateinit var name: String
    var tests: Array<BaseTest> = arrayOf()

    val variables: HashMap<String, Variable> = hashMapOf();
    val varNameList: Stack<String> = Stack()
    val varLevelNum: Stack<Int> = Stack()
    var curTest:Int = 0
    var results:Array<BaseRes> =  exp;
    var cur_client:DBClient? = if (server!=null) DBClient("main",server!!) else null

    private fun sentToSQL(s: String, isNeedCheck: Boolean) {
        if (isNeedCheck)
        {
            if(results.size>curTest)
            {
                tests+=SingleQueryTest(s,results[curTest],cur_client)
            }else
            {
                tests+=SingleQueryTest(s, VoidRes(),cur_client)
            }
        curTest++
        }else
           tests.last().addSQLQuery(SQLQuery(s))

    }

    override fun visitClient(ctx: TestScriptParser.ClientContext?): Array<BaseTest>? {
        val last_client = cur_client
        cur_client = server?.get(ctx!!.clientname().myString().`val`)//todo
        this.visit(ctx!!.code_block())
        cur_client = last_client
        return null
    }

    override fun visitParse(ctx: TestScriptParser.ParseContext?): Array<BaseTest>? {
        for (i in ctx!!.children) {
            this.visit(i)
        }
        return tests
    }

    override fun visitTestName(ctx: TestScriptParser.TestNameContext?): Array<BaseTest>? {
        name = ctx!!.text.substring(1, ctx.text.length - 1)
        return null
    }

    override fun visitCode_block(ctx: TestScriptParser.Code_blockContext?): Array<BaseTest>? {
        for (i in ctx!!.children) {
            this.visit(i)
        }
        return null
    }

    override fun visitOpen_block(ctx: TestScriptParser.Open_blockContext?): Array<BaseTest>? {
        varLevelNum.push(0)
        return null
    }

    override fun visitClose_block(ctx: TestScriptParser.Close_blockContext?): Array<BaseTest>? {

        val ii = varLevelNum.pop()
        for (i in 1..ii) {
            val s = varNameList.pop()
            variables.remove(s)
        }
        return null
    }

    override fun visitAssignment(ctx: TestScriptParser.AssignmentContext?): Array<BaseTest>? {
        if (variables.containsKey(ctx!!.id().text)) {
            variables[ctx.id().text] = ExpresionVisitor(variables).visit(ctx.expr())
        } else {
            var i = varLevelNum.pop()
            i++
            varLevelNum.push(i)
            varNameList.push(ctx.id().text)
            variables[ctx.id().text] = ExpresionVisitor(variables).visit(ctx.expr())
        }
        return null
    }

    override fun visitTest(ctx: TestScriptParser.TestContext?): Array<BaseTest>? {
        sentToSQL((ExpresionVisitor(variables).visit(ctx!!.expr())
                .castAs("string") as StringVar).value
                , true)
        return null
    }

    override fun visitSql(ctx: TestScriptParser.SqlContext?): Array<BaseTest>? {
        sentToSQL((ExpresionVisitor(variables).visit(ctx!!.expr())
                .castAs("string") as StringVar).value
                , false)
        return null
    }

    override fun visitMyFor(ctx: TestScriptParser.MyForContext?): Array<BaseTest>? {
        var i = 0
        if (ctx!!.childCount == 9) {
            this.visit(ctx.assignment(0))
            i = 1
        }
        while ((ExpresionVisitor(variables).visit(ctx.expr()).castAs("bool").getValue() as Boolean)) {
            this.visit(ctx.code_block())
            this.visit(ctx.assignment(i))
        }
        if (ctx.childCount == 9) {
            val ii = varLevelNum.pop()
            varLevelNum.push(ii - 1)
            val s = varNameList.pop()
            variables.remove(s)
        }
        return null
    }
}

/*

@test "sdvcs"
{
    @l:=5
    @i := 5+@l
    @test: "scsc"+@svsmvcl
    @for(;@i<5;@i:=@i+1)
    {
        @cols := "i1 int unique"
        @for(@j:=0;@j<@i+1;@j:=@j+1)
        {
           @cols := @cols + ",i"+ @cast @j+1 as string +" int unique"
        }
        @test: "create table t"+ @cast @i as string +"("+ @cols+")"
    }
}


 */