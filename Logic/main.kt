import antlr.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import visitors.SQLVisitor


fun execute(str:String):String
{
    val lexer = HelloLexer(CharStreams.fromString(str))

// создаем объект парсера
    val commonTokenStream = CommonTokenStream(lexer)
    commonTokenStream.fill()
    val parser = HelloParser(commonTokenStream)

    var tree: ParseTree? = null
    try {
        // вызываем парсинг по правилу
        tree = parser.parse()
    } catch (e: Exception) {
        // обрабатываем ошибки
        println("Error: ${e.message}")
    }

    var res = ""
    val mainwalker = object : HelloBaseListener()
    {
        override fun enterSql_query(ctx: HelloParser.Sql_queryContext?) {
            val visitor = SQLVisitor()
            val ex = visitor.visit(ctx);
            res+= ex.execute(1)+ "\n";
        }
    }
    val walker = ParseTreeWalker()
    walker.walk(mainwalker, tree)

    return res;
}
