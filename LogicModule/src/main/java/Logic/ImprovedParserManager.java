package Logic;

import Logic.Parser.DBGrammarLexer;
import Logic.Parser.DBGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ImprovedParserManager {
    public String Parse(String command) {
        DBGrammarLexer lexer = new DBGrammarLexer(CharStreams.fromString(command));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DBGrammarParser parser = new DBGrammarParser((tokens));
        String out;

        try {
            ParseTree tree = parser.parse();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            Listener listener = new Listener();
            parseTreeWalker.walk(listener, tree);
            out = listener.getMessageRet();
        } catch (Exception e) {
            out = "SystemError: " + e.getMessage();
        }

        return out;
    }
}
