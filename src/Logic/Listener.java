package Logic;

import Engine.API;
import Engine.DBEngine;
import Engine.Entity.Column;
import Engine.Exceptions.DBMSException;
import Engine.Exceptions.DropException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Listener extends HelloBaseListener {
    private DBEngine engine;
    private API api;
    private HashMap<String, Object> hashMap = new HashMap<>();

    {
        try {
            engine = new DBEngine();
            api = engine.getApi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private enum InquiryMode {
        Undefined,
        What,
        Content
    }

    private InquiryMode mode;

    private enum BranchType {
        Create,
        ShowCreate,
        Drop,
        Table_sources,
        Column_source
    }

    private BranchType branchType;

    @Override
    public void enterSql_query(HelloParser.Sql_queryContext ctx) {
        super.enterSql_query(ctx);
        mode = InquiryMode.Undefined;
    }

    @Override
    public void enterShow_create(HelloParser.Show_createContext ctx) {
        super.enterShow_create(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.ShowCreate;
    }

    @Override
    public void enterCreate(HelloParser.CreateContext ctx) {
        super.enterCreate(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.Create;
    }

    @Override
    public void enterDrop(HelloParser.DropContext ctx) {
        super.enterDrop(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.Drop;
    }

    @Override
    public void enterTable(HelloParser.TableContext ctx) {
        super.enterTable(ctx);
        if (ctx.getChildCount() > 1 && mode == InquiryMode.What) {
            mode = InquiryMode.Content;
        }
        branchType = BranchType.Table_sources;
    }

    @Override
    public void enterTable_name_list(HelloParser.Table_name_listContext ctx) {
        super.enterTable_name_list(ctx);
        int i = ctx.getChildCount();
        if (mode == InquiryMode.What && branchType == BranchType.Drop) {
            while (i > 0) {
                try {
                    String string = ctx.name(i - 1).getText();
                    api.dropTable(string);
                } catch (DropException e) {
                    System.err.println(e.getMessage());
                } finally {
                    System.out.println("table droped");
                }
                i--;
            }
        }
        if (mode == InquiryMode.What && branchType == BranchType.ShowCreate) {
            while (i > 0) {
                String string = ctx.name(i - 1).getText();
                try {
                    System.out.println(api.showCreateTable(string));
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
                i--;
            }
        }
    }

    @Override
    public void enterTable_definition(HelloParser.Table_definitionContext ctx) {
        super.enterTable_definition(ctx);
        hashMap.put("Table_name", ctx.name().getText());
    }

    @Override
    public void enterColumns_sourse(HelloParser.Columns_sourseContext ctx) {
        super.enterColumns_sourse(ctx);
        int i = ctx.getChildCount();
        List<HelloParser.Column_defContext> columns = null;
        HashSet<Column> hashSet = new HashSet<Column>();
        boolean unique = false;
        while (i > 0 && branchType == BranchType.Table_sources) {
            if (ctx.column_def(i - 1).getStop().getText() != "unique" ||
                    !ctx.column_def(i - 1).getStop().getText().equals("primary key")) {
                unique = true;
            }
            String columnName = ctx.column_def(i - 1).name().getText();
            Class columnContainsClass = null;
            String className = ctx.column_def(i - 1).type().getText();
            className = "java.lang." + className.substring(0, 1).toUpperCase() + className.substring(1);
            try {
                columnContainsClass = Class.forName(className);
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
            Column k = new Column(columnName, columnContainsClass, unique);
            hashSet.add(k);
            i--;
        }
        try {
            String kek = hashMap.get("Table_name").toString();
            api.createTable(kek, hashSet);
        } catch (DBMSException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("table created");
        }
    }
}
