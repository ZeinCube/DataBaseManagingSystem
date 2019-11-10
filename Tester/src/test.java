public class test {
    private static final String stringTransform(String s) {
        byte var2 = 1;
        int var3 = s.length() - 1;
        {
            String var10000 = s.substring(var2, var3);

            return var10000.replace("\\\"", "\"");
        }
    }
}
