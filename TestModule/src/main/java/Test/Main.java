package Test;

import Test.Engine.TestCli;
import Test.Utils.CSWorker;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
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

        int code = new TestCli().run(Arrays.copyOfRange(args, 1, args.length));

        if (args.length > 1) {
            System.setOut(original);

            System.out.println(code == 0);
        }

        CSWorker.stopClientServer();
    }

}
