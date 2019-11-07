package Console;

import Engine.API;
import Engine.DBEngine;
import Engine.Entity.Column;

import java.util.HashSet;

public class Console {

    public static void main(String[] args) throws Exception {
        DBEngine engine = new DBEngine();

        API api = engine.getApi();

        System.out.println(api.dropAll());

        engine = new DBEngine();

        api = engine.getApi();

        HashSet<Column> columns = new HashSet<>();

        columns.add(new Column("id", Integer.class, true));

        columns.add(new Column("name", Integer.class, true, false));

        System.out.println(api.createTable("test", columns));

        System.out.println(api.showCreateTable("test"));
    }
}

