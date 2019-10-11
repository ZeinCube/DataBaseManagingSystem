package antlr;

import com.antr.HelloBaseListener;
import com.antr.HelloParser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

public class HelloWalker extends HelloBaseListener {
    public void enterParse(HelloParser.ParseContext ctx) {
        System.out.println("input string : " + ctx.sql_stmt_list().sql_stmt().drop_table().getText());
        System.out.println("options : " + ctx.sql_stmt_list().sql_stmt().drop_table().K_DROP().getText());
        System.out.println("table name : " + ctx.sql_stmt_list().sql_stmt().drop_table().table_name().getText());
//        System.out.println( "column name : " + ctx.sql_stmt_list().sql_stmt().create_table().column_def(0).column_name().getText());
//        System.out.println( "column type : " + ctx.sql_stmt_list().sql_stmt().create_table().column_def(0).column_constraint().stop.getText());
//        System.out.println( "column name : " + ctx.sql_stmt_list().sql_stmt().create_table().column_def(1).column_name().getText());
//        System.out.println( "column type : " + ctx.sql_stmt_list().sql_stmt().create_table().column_def(1).column_constraint().getText());
    }
}