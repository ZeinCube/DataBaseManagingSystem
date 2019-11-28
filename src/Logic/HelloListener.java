// Generated from /home/botinok/Documents/ghjk/DataBaseManagingSystem/src/Logic/Hello.g4 by ANTLR 4.7.2
package Logic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#mynumber}.
	 * @param ctx the parse tree
	 */
	void enterMynumber(HelloParser.MynumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mynumber}.
	 * @param ctx the parse tree
	 */
	void exitMynumber(HelloParser.MynumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mystring}.
	 * @param ctx the parse tree
	 */
	void enterMystring(HelloParser.MystringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mystring}.
	 * @param ctx the parse tree
	 */
	void exitMystring(HelloParser.MystringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(HelloParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(HelloParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(HelloParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(HelloParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mychar}.
	 * @param ctx the parse tree
	 */
	void enterMychar(HelloParser.MycharContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mychar}.
	 * @param ctx the parse tree
	 */
	void exitMychar(HelloParser.MycharContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#myint}.
	 * @param ctx the parse tree
	 */
	void enterMyint(HelloParser.MyintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#myint}.
	 * @param ctx the parse tree
	 */
	void exitMyint(HelloParser.MyintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#myfloat}.
	 * @param ctx the parse tree
	 */
	void enterMyfloat(HelloParser.MyfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#myfloat}.
	 * @param ctx the parse tree
	 */
	void exitMyfloat(HelloParser.MyfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(HelloParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(HelloParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sql_query}.
	 * @param ctx the parse tree
	 */
	void enterSql_query(HelloParser.Sql_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sql_query}.
	 * @param ctx the parse tree
	 */
	void exitSql_query(HelloParser.Sql_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#show_create}.
	 * @param ctx the parse tree
	 */
	void enterShow_create(HelloParser.Show_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#show_create}.
	 * @param ctx the parse tree
	 */
	void exitShow_create(HelloParser.Show_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(HelloParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(HelloParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(HelloParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(HelloParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#table_name_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_list(HelloParser.Table_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#table_name_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_list(HelloParser.Table_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(HelloParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(HelloParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(HelloParser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(HelloParser.Table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#columns_sourse}.
	 * @param ctx the parse tree
	 */
	void enterColumns_sourse(HelloParser.Columns_sourseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#columns_sourse}.
	 * @param ctx the parse tree
	 */
	void exitColumns_sourse(HelloParser.Columns_sourseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(HelloParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(HelloParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(HelloParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(HelloParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(HelloParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(HelloParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_where}.
	 * @param ctx the parse tree
	 */
	void enterSelect_where(HelloParser.Select_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_where}.
	 * @param ctx the parse tree
	 */
	void exitSelect_where(HelloParser.Select_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(HelloParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(HelloParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_from}.
	 * @param ctx the parse tree
	 */
	void enterSelect_from(HelloParser.Select_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_from}.
	 * @param ctx the parse tree
	 */
	void exitSelect_from(HelloParser.Select_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_what}.
	 * @param ctx the parse tree
	 */
	void enterSelect_what(HelloParser.Select_whatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_what}.
	 * @param ctx the parse tree
	 */
	void exitSelect_what(HelloParser.Select_whatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(HelloParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(HelloParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(HelloParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(HelloParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#insert_colums}.
	 * @param ctx the parse tree
	 */
	void enterInsert_colums(HelloParser.Insert_columsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#insert_colums}.
	 * @param ctx the parse tree
	 */
	void exitInsert_colums(HelloParser.Insert_columsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void enterInsert_values(HelloParser.Insert_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void exitInsert_values(HelloParser.Insert_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#insert_expr}.
	 * @param ctx the parse tree
	 */
	void enterInsert_expr(HelloParser.Insert_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#insert_expr}.
	 * @param ctx the parse tree
	 */
	void exitInsert_expr(HelloParser.Insert_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(HelloParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(HelloParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#update_set}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set(HelloParser.Update_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#update_set}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set(HelloParser.Update_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#update_idef}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_idef(HelloParser.Update_idefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#update_idef}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_idef(HelloParser.Update_idefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#update_expr}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_expr(HelloParser.Update_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#update_expr}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_expr(HelloParser.Update_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#update_where}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_where(HelloParser.Update_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#update_where}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_where(HelloParser.Update_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(HelloParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(HelloParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(HelloParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(HelloParser.Unary_operatorContext ctx);
}