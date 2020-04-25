package Test;

import Test.Engine.Cli.TestCli;
import Test.Utils.ClientHelper;
import Test.Utils.ServerHelper;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        args[0] = !args[0].endsWith("/") ? args[0].concat("/") : args[0];

        ClientHelper.CLIENT_JAR = new File(args[0] + "ClientModule/target/Client-1.0.0-jar-with-dependencies.jar").getAbsolutePath();
        ServerHelper.SERVER_JAR = new File(args[0] + "ServerModule/target/Server-1.0.0-jar-with-dependencies.jar").getAbsolutePath();

        ServerHelper.runServer();

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

        ServerHelper.stopServer();
    }

}
