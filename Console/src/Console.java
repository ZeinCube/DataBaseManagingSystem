

public class Console {

    public static void main(String[] args) {
        // создаем объект лексера. В качестве входа используем стандартный
// ввод.
        String str = "create table hui(kek int UNIQUE, lol int, kuk char[40] primary key, kuke char);" +
                "drop table hui " +
                "show create table hui";
        System.out.println(MainKt.execute(str));

    }
}