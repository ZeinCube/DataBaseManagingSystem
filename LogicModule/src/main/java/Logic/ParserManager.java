package Logic;

import Logic.Parser.DBGrammarLexer;
import Logic.Parser.DBGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ParserManager {

    private Listener listener;
    private ParseTreeWalker parseTreeWalker;

    public ParserManager() {
        listener = new Listener();
        parseTreeWalker = new ParseTreeWalker();
    }

    public String parse(String command) {
        DBGrammarLexer lexer = new DBGrammarLexer(CharStreams.fromString(command));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DBGrammarParser parser = new DBGrammarParser((tokens));

        PrintStream stderr = System.err;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(outputStream));

        String out = null;

        try {
            ParseTree tree = parser.parse();
            parseTreeWalker.walk(listener, tree);
            out = listener.getMessageRet();
            listener.clearMessageRet();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        if (out == null) {
            System.err.flush();
            out = outputStream.toString();
        }

        System.setErr(stderr);
        return out;
    }
}
