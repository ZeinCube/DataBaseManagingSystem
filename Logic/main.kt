import antlr.*
import com.sun.javafx.property.adapter.PropertyDescriptor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import visitors.CentralVisitor


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

    val visitor = CentralVisitor()
    val ex = visitor.visit(tree);

    return ex.execute();
}
