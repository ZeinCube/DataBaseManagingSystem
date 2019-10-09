import antlr.HelloWalker;
import com.antr.HelloLexer;
import com.antr.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Console {

    public static void main(String[] args) {
        // создаем объект лексера. В качестве входа используем стандартный
// ввод.
        String str = "drop table zhopa";
        HelloLexer lexer = new HelloLexer(CharStreams.fromString(str));

// создаем объект парсера
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        commonTokenStream.fill();
        HelloParser parser = new HelloParser(commonTokenStream);

        ParseTree tree = null;
        try {
// вызываем парсинг по правилу
            tree = parser.parse();
        } catch (Exception e) {
// обрабатываем ошибки
            System.out.println("Error: " + e);
        }
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new HelloWalker(), tree);
    }
}