package Test;

import Test.Engine.TestCli;
import Logic.ParserManager;

public class Main {

    public static void main(String[] args) {
        ParserManager manager = new ParserManager();
        TestCli cli = new TestCli();
        cli.run();
    }

}
