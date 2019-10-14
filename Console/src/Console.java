

public class Console {

    public static void main(String[] args) {
        // создаем объект лексера. В качестве входа используем стандартный
// ввод.
        String str = "create table hui (kek int UNIQUE, lol int)";
        MainKt.execute(str);
    }
}