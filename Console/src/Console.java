import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Console {

    public static void main(String[] args) {
        // создаем объект лексера. В качестве входа используем стандартный
// ввод.
        String str = "\"dfmndkfnm\"";
        System.out.println(MainKt.execute(str));

    }
}