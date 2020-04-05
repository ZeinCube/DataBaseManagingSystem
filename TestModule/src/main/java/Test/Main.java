package Test;

import Test.Engine.TestCli;
import Test.Utils.CSWorker;

public class Main {

    public static void main(String[] args) {
        CSWorker.PROJECT_PATH = args[0];
        CSWorker.RunClientServer();

        new TestCli().run();

        CSWorker.StopClientServer();
    }

}
