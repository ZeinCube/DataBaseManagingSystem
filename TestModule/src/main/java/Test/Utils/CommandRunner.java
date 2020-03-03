package Test.Utils;

import Logic.ImprovedParserManager;

public class CommandRunner {
    public static String RunCommand(String cmd) {
        ImprovedParserManager manager = new ImprovedParserManager();
        return manager.Parse(cmd);
    }
}
