public class test {
    private static final String stringTransform(String s) {
        byte var2 = 1;
        int var3 = s.length() - 1;
        {
            return s.substring(var2, var3).replace("\\\"", "\"");
        }
    }
}
