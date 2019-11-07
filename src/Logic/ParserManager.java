package Logic;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class ParserManager {

    public void Parse(String s) {
        HelloLexer lexer = new HelloLexer(CharStreams.fromString(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser((tokens));
        ParseTree tree = null;
        try {
            tree = parser.parse();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            Listener listener = new Listener();
            parseTreeWalker.walk(listener, tree);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}

