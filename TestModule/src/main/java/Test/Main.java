package Test;

import Test.Engine.TestCli;
import Test.Utils.CSWorker;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        if (!args[0].endsWith("/"))
            args[0] = args[0] + "/";
        CSWorker.PROJECT_PATH = args[0];

        CSWorker.runClientServer();

        PrintStream original = System.out;

        if (args.length > 1) {
            try {
                System.setOut(new PrintStream(new OutputStream() {
                    public void write(int b) {
                    }
                }));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        boolean result = new TestCli().run(Arrays.copyOfRange(args, 1, args.length));

        if (args.length > 1) {
            System.setOut(original);

            System.out.println(result);
        }

        CSWorker.stopClientServer();
    }

}
