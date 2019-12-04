package Logic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserManager {

    public String Parse(String s) {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser((tokens));
        ParseTree tree = null;
        String out = null;
        try {
            tree = parser.parse();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            Listener listener = new Listener();
            parseTreeWalker.walk(listener, tree);
            out = listener.getMessageRet();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return out;
    }
}

