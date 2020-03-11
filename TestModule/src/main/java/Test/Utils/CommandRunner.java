package Test.Utils;

import Logic.ImprovedParserManager;

public class CommandRunner {
    private ImprovedParserManager parserManager;

    public CommandRunner() {
        parserManager = new ImprovedParserManager();
    }

    public String runCommand(String cmd) {
        return parserManager.parse(cmd);
    }
}
