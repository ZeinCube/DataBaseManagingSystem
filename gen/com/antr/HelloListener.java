// Generated from /home/botinok/Documents/DataBaseManagingSystem/Console/src/antlr/Hello.g4 by ANTLR 4.7.2
package com.antr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#open_s}.
	 * @param ctx the parse tree
	 */
	void enterOpen_s(HelloParser.Open_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#open_s}.
	 * @param ctx the parse tree
	 */
	void exitOpen_s(HelloParser.Open_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#close_s}.
	 * @param ctx the parse tree
	 */
	void enterClose_s(HelloParser.Close_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#close_s}.
	 * @param ctx the parse tree
	 */
	void exitClose_s(HelloParser.Close_sContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(HelloParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(HelloParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(HelloParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(HelloParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(HelloParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(HelloParser.Sql_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(HelloParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(HelloParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_constr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_constr(HelloParser.Select_constrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_constr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_constr(HelloParser.Select_constrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(HelloParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(HelloParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(HelloParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(HelloParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#create_constr}.
	 * @param ctx the parse tree
	 */
	void enterCreate_constr(HelloParser.Create_constrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#create_constr}.
	 * @param ctx the parse tree
	 */
	void exitCreate_constr(HelloParser.Create_constrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(HelloParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(HelloParser.Any_nameContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(HelloParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(HelloParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(HelloParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(HelloParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(HelloParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(HelloParser.Table_nameContext ctx);
}