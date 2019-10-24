package visitors

import expresions.ExpresionVisitor
import expresions.StringVar
import expresions.Variable
import org.antlr.v4.runtime.tree.ParseTree
import parser.TestGrammarBaseVisitor
import parser.TestGrammarParser
import java.util.*
import kotlin.collections.HashMap

class StartCodeVisitor : TestGrammarBaseVisitor<Any?>() {
    lateinit var name: String
    val variables: HashMap<String, Variable> = hashMapOf();
    val varNameList: Stack<String> = Stack()
    val varLevelNum: Stack<Int> = Stack()
    private fun sentToSQL(s: String, isNeedCheck: Boolean) {
        //todo
        println(s)
    }

    override fun visitParseIn(ctx: TestGrammarParser.ParseInContext?): Any? {
        for (i in ctx!!.children) {
            this.visit(i)
        }
        return null
    }

    override fun visitTestName(ctx: TestGrammarParser.TestNameContext?): Any? {
        name = ctx!!.text.substring(1, ctx!!.text.length - 2)
        return null
    }

    override fun visitTest_block(ctx: TestGrammarParser.Test_blockContext?): Any? {
        for (i in ctx!!.children) {
            this.visit(i)
        }
        return null
    }

    override fun visitOpen_block(ctx: TestGrammarParser.Open_blockContext?): Any? {
        varLevelNum.push(0)
        return null
    }

    override fun visitClose_block(ctx: TestGrammarParser.Close_blockContext?): Any? {

        var ii = varLevelNum.pop()
        for (i in 1..ii) {
            val s = varNameList.pop()
            variables.remove(s)
        }
        return null
    }

    override fun visitApropriation(ctx: TestGrammarParser.ApropriationContext?): Any? {
        if (variables.containsKey(ctx!!.id().text)) {
            variables[ctx!!.id().text] = ExpresionVisitor(variables).visit(ctx!!.expr())
        } else {
            var i = varLevelNum.pop()
            i++
            varLevelNum.push(i)
            varNameList.push(ctx!!.id().text)
            variables[ctx!!.id().text] = ExpresionVisitor(variables).visit(ctx!!.expr())
        }
        return null
    }

    override fun visitTest(ctx: TestGrammarParser.TestContext?): Any? {
        sentToSQL((ExpresionVisitor(variables).visit(ctx!!.expr())
                .castAs("string") as StringVar).value
                , ctx.childCount == 3)

        return null
    }

    override fun visitMyFor(ctx: TestGrammarParser.MyForContext?): Any? {
        var i = 0
        if (ctx!!.childCount == 9) {
            this.visit(ctx.apropriation(0))
            i = 1
        }
        while ((ExpresionVisitor(variables).visit(ctx.expr()).castAs("bool").getValue() as Boolean)) {
            this.visit(ctx.test_block())
            this.visit(ctx.apropriation(i))
        }
        if (ctx!!.childCount == 9) {
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