package Logic;
 
import Engine.API;
import Engine.DBEngine;
import Engine.Entity.Column;
import Engine.Exceptions.DBMSException;

import java.util.HashMap;
import java.util.List;

import Logic.Parser.*;

import static Logic.Parser.DBGrammarParser.K_PRIMARY_KEY;
import static Logic.Parser.DBGrammarParser.K_UNIQUE;

public class Listener extends DBGrammarBaseListener {
    private DBEngine engine;
    private API api;
    private HashMap<String, Object> hashMap = new HashMap<>();
    private String messageRet = null;
    private HashMap<Integer, Object> hashMapLit = new HashMap<>();
    private HashMap<Integer, Object> hashMapOp = new HashMap<>();
    private HashMap<Integer, Object> hashMapNotNum = new HashMap<>();
    private int countLiteral = 0;
    private int countOperand = 0;


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
        Content,
        Where,
        Value
    }
 
    private InquiryMode mode;
 
    private enum BranchType {
        Create,
        ShowCreate,
        Drop,
        Table_sources,
        Select,
        Insert,
        Update
    }
 
    private BranchType branchType;
 
    @Override
    public void enterSql_query(DBGrammarParser.Sql_queryContext ctx) {
        super.enterSql_query(ctx);
        mode = InquiryMode.Undefined;
    }
 
    @Override
    public void enterShow_create(DBGrammarParser.Show_createContext ctx) {
        super.enterShow_create(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.ShowCreate;
    }
 
    @Override
    public void enterCreate(DBGrammarParser.CreateContext ctx) {
        super.enterCreate(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.Create;
    }
 
    @Override
    public void enterDrop(DBGrammarParser.DropContext ctx) {
        super.enterDrop(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.Drop;
    }
 
 
    @Override
    public void enterTable(DBGrammarParser.TableContext ctx) {
        super.enterTable(ctx);
        if (ctx.getChildCount() > 1 && mode == InquiryMode.What) {
            mode = InquiryMode.Content;
        }
        branchType = BranchType.Table_sources;
    }
 
    @Override
    public void enterTable_name_list(DBGrammarParser.Table_name_listContext ctx) {
        super.enterTable_name_list(ctx);
        int i = ctx.getChildCount();
        if (mode == InquiryMode.What && branchType == BranchType.Drop) {
            while (i > 0) {
                try {
                    String string = ctx.name(i - 1).getText();
                    messageRet = api.dropTable(string);
                } catch (DBMSException e) {
                    messageRet = e.getMessage();
                }
                i--;
            }
        }
        if (mode == InquiryMode.What && branchType == BranchType.ShowCreate) {
            while (i > 0) {
                String string = ctx.name(i - 1).getText();
                try {
                    messageRet = api.showCreateTable(string);
                } catch (Exception e) {
                    messageRet = e.getMessage();
                }
                i--;
            }
        }
    }
 
    @Override
    public void enterTable_definition(DBGrammarParser.Table_definitionContext ctx) {
        super.enterTable_definition(ctx);
        hashMap.put("Table_name", ctx.name().getText());
    }
 
    @Override
    public void enterColumns_sourse(DBGrammarParser.Columns_sourseContext ctx) {
        super.enterColumns_sourse(ctx);
        int i = ctx.getChildCount();
        int j = 0;
        List<DBGrammarParser.Column_defContext> columns = null;
        HashMap<String, Column> hashMap = new HashMap<>();
        boolean buff = false;
        while (j <= i / 2 && branchType == BranchType.Table_sources) {
            if ((ctx.column_def(j).getStop().getType() == K_PRIMARY_KEY) ||
                    (ctx.column_def(j).getStop().getType() == K_UNIQUE)) {
                buff = true;
            }
            String columnName = null;
            Class columnContainsClass = null;
            try {
                columnName = ctx.column_def(j).name().getText();
                String className = ctx.column_def(j).type().getText();
                className = "java.lang." + className.substring(0, 1).toUpperCase() + className.substring(1).toLowerCase();
                columnContainsClass = Class.forName(className);
            } catch (Exception e1) {
                messageRet = "the request was entered incorrectly";
            }
            Column k = new Column(columnName, columnContainsClass, buff);
            hashMap.put("Column", k);
            j++;
            buff = false;
        }
        try {
            String kek = this.hashMap.get("Table_name").toString();
            messageRet = api.createTable(kek, hashMap);
        } catch (DBMSException e) {
            messageRet = e.getMessage();
        }
    }
 
    @Override
    public void enterSelect(DBGrammarParser.SelectContext ctx) {
        super.enterSelect(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.What;
        }
        branchType = BranchType.Select;
    }
 
    @Override
    public void enterSelect_what(DBGrammarParser.Select_whatContext ctx) {
        super.enterSelect_what(ctx);
        int i = ctx.getChildCount();
        int j = 0;
        while (j <= i / 2 && (branchType == BranchType.Select) && (InquiryMode.What == mode)) {
            hashMap.put("Column_name " + j, ctx.result_column(j).getText());
            j++;
        }
        mode = InquiryMode.Where;
        branchType = BranchType.Table_sources;
    }
 
    @Override
    public void enterSelect_from(DBGrammarParser.Select_fromContext ctx) {
        super.enterSelect_from(ctx);
//        int i = ctx.getChildCount();
        int j = 0;
//        while (j <= i / 2 && (branchType == BranchType.Select) && (InquiryMode.Where == mode)) {
//            if (ctx.table_or_subquery(j).getText() == )
//        }
        if ((branchType == BranchType.Select) && (InquiryMode.Where == mode))
            hashMap.put("Table_name ", ctx.table_or_subquery(j).getText());
    }
 
    @Override
    public void enterInsert(DBGrammarParser.InsertContext ctx) {
        super.enterInsert(ctx);
        if (ctx.getChildCount() > 1) {
            mode = InquiryMode.Where;
            hashMap.put("Table_name ", ctx.name().getText());
        }
        branchType = BranchType.Insert;
    }
 
    @Override
    public void enterInsert_colums(DBGrammarParser.Insert_columsContext ctx) {
        super.enterInsert_colums(ctx);
        int i = ctx.getChildCount();
        int j = 0;
        while (j < i / 2 && (branchType == BranchType.Insert) && (InquiryMode.Where == mode)) {
            hashMap.put("Insert_Column " + j, ctx.name(j).getText());
            j++;
        }
        mode = InquiryMode.What;
    }
 
    @Override
    public void enterInsert_values(DBGrammarParser.Insert_valuesContext ctx) {
        super.enterInsert_values(ctx);
        if ((branchType == BranchType.Insert) && (InquiryMode.What == mode)) {
            mode = InquiryMode.Value;
        }
    }
 
    @Override
    public void enterInsert_expr(DBGrammarParser.Insert_exprContext ctx) {
        super.enterInsert_expr(ctx);
        int i = ctx.getChildCount();
        int j = 0;
        while (j < i / 2 && (branchType == BranchType.Insert) && (InquiryMode.Value == mode)) {
            hashMap.put("Insert_Value " + j, ctx.literal_value(j).getText());
            j++;
        }
    }

    @Override
    public void enterExpr(DBGrammarParser.ExprContext ctx) {
        super.enterExpr(ctx);
        String t;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            t = ctx.getChild(i).getText();
        }
    }

    @Override
    public void enterLiteral_value(DBGrammarParser.Literal_valueContext ctx) {
        super.enterLiteral_value(ctx);
        hashMapLit.put(countLiteral, ctx.start.getText());
        countLiteral++;
    }

    @Override
    public void enterOperand(DBGrammarParser.OperandContext ctx) {
        super.enterOperand(ctx);
        hashMapOp.put(countLiteral, ctx.start.getText());
        countOperand++;
    }


    @Override
    public void enterNot_num_value(DBGrammarParser.Not_num_valueContext ctx) {
        super.enterNot_num_value(ctx);
        hashMapNotNum.put(countLiteral, ctx.start.getText());
        countLiteral++;
    }

    public String getMessageRet() {
        return messageRet;
    }

}