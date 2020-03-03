package Logic;

import Logic.Parser.DBGrammarLexer;
import Logic.Parser.DBGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ImprovedParserManager {

    private Listener listener;
    private ParseTreeWalker parseTreeWalker;

    public ImprovedParserManager() {
        listener = new Listener();
        parseTreeWalker = new ParseTreeWalker();
    }

    public String Parse(String command) {
        DBGrammarLexer lexer = new DBGrammarLexer(CharStreams.fromString(command));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DBGrammarParser parser = new DBGrammarParser((tokens));
        String out;

        try {
            ParseTree tree = parser.parse();
            parseTreeWalker.walk(listener, tree);
            out = listener.getMessageRet();
            if (out.isEmpty()) {
                out = "Operation completed;";
            }
        } catch (Exception e) {
            out = "SystemError: " + e.getMessage();
        }

        return out;
    }
}
