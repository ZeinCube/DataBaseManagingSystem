public class Console {

    public static void main(String[] args) throws Exception {
        DBEngine engine = new DBEngine();
        engine.connectToDataBase("test");
        engine.dropTable("TEST");
    }
}
