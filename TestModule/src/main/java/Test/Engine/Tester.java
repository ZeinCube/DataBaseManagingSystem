package Test.Engine;

import Test.Utils.CommandRunner;
import Test.Utils.Configurator;

public class Tester {
    private CommandRunner commandRunner;
    private Configurator configurator;

    public Tester() {
        commandRunner = new CommandRunner();
        configurator = new Configurator();
    }

    public void test(String testName) {

    }

    public Configurator getConfigurator() {
        return configurator;
    }
}
