package Test;

import Test.Engine.TestCli;
import Test.Utils.ClientHelper;
import Test.Utils.ServerHelper;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        args[0] = !args[0].endsWith("/") ? args[0].concat("/") : args[0];

        ClientHelper.CLIENT_JAR = args[0] + "ClientModule/target/Client-1.0.0-jar-with-dependencies.jar";
        ServerHelper.SERVER_JAR = args[0] + "ServerModule/target/Server-1.0.0-jar-with-dependencies.jar";

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
