package Logic;

import Engine.API;
import Engine.DBEngine;
import Engine.Entity.Column;
import Engine.Exceptions.DBMSException;
import Logic.pars.HelloBaseListener;
import Logic.pars.HelloParser;

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
    public void enterSelect_table_list(HelloParser.Select_table_listContext ctx) {
        super.enterSelect_table_list(ctx);
        if (mode == InquiryMode.What && branchType == BranchType.Drop) {

        }
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
    public void enterTable_definition(HelloParser.Table_definitionContext ctx) {
        super.enterTable_definition(ctx);
        hashMap.put("Table_name", ctx.name().getText());
    }

    @Override
    public void enterColumns_sourse(HelloParser.Columns_sourseContext ctx) {
        super.enterColumns_sourse(ctx);
        int i = ctx.getChildCount();
        List<HelloParser.Column_defContext> columns = null;
        HashSet<Column> hashSet = new HashSet<>();
        boolean unique = false;
        try {
            while (i > 0 && branchType == BranchType.Table_sources) {
                if (ctx.column_def(i - 1).getStop().getText() != "unique" ||
                        !ctx.column_def(i - 1).getStop().getText().equals("primary key")) {
                    unique = true;
                }
                hashSet.add(new Column(ctx.column_def(i - 1).name().getText(), Class.forName(ctx.column_def(i - 1).type().getText()), unique));
                i--;
            }
        } catch (ClassNotFoundException e) {
        }
        try {
            api.createTable(hashMap.get("Table_name").toString(), hashSet);
        } catch (DBMSException e) {
            e.printStackTrace();
        }
    }
}
