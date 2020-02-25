// Generated from /home/hehogcode/Workspace/DataBase/LogicModule/src/main/java/Logic/DBGrammar.g4 by ANTLR 4.8
package Logic.Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBGrammarParser}.
 */
public interface DBGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#mynumber}.
	 * @param ctx the parse tree
	 */
	void enterMynumber(DBGrammarParser.MynumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#mynumber}.
	 * @param ctx the parse tree
	 */
	void exitMynumber(DBGrammarParser.MynumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#mystring}.
	 * @param ctx the parse tree
	 */
	void enterMystring(DBGrammarParser.MystringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#mystring}.
	 * @param ctx the parse tree
	 */
	void exitMystring(DBGrammarParser.MystringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(DBGrammarParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(DBGrammarParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DBGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DBGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#mychar}.
	 * @param ctx the parse tree
	 */
	void enterMychar(DBGrammarParser.MycharContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#mychar}.
	 * @param ctx the parse tree
	 */
	void exitMychar(DBGrammarParser.MycharContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#myint}.
	 * @param ctx the parse tree
	 */
	void enterMyint(DBGrammarParser.MyintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#myint}.
	 * @param ctx the parse tree
	 */
	void exitMyint(DBGrammarParser.MyintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#myfloat}.
	 * @param ctx the parse tree
	 */
	void enterMyfloat(DBGrammarParser.MyfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#myfloat}.
	 * @param ctx the parse tree
	 */
	void exitMyfloat(DBGrammarParser.MyfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DBGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DBGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DBGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DBGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#sql_query}.
	 * @param ctx the parse tree
	 */
	void enterSql_query(DBGrammarParser.Sql_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#sql_query}.
	 * @param ctx the parse tree
	 */
	void exitSql_query(DBGrammarParser.Sql_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#show_create}.
	 * @param ctx the parse tree
	 */
	void enterShow_create(DBGrammarParser.Show_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#show_create}.
	 * @param ctx the parse tree
	 */
	void exitShow_create(DBGrammarParser.Show_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(DBGrammarParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(DBGrammarParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(DBGrammarParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(DBGrammarParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#table_name_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_list(DBGrammarParser.Table_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#table_name_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_list(DBGrammarParser.Table_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DBGrammarParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DBGrammarParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_definition(DBGrammarParser.Table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#table_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_definition(DBGrammarParser.Table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#columns_sourse}.
	 * @param ctx the parse tree
	 */
	void enterColumns_sourse(DBGrammarParser.Columns_sourseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#columns_sourse}.
	 * @param ctx the parse tree
	 */
	void exitColumns_sourse(DBGrammarParser.Columns_sourseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(DBGrammarParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(DBGrammarParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(DBGrammarParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(DBGrammarParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(DBGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(DBGrammarParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#select_where}.
	 * @param ctx the parse tree
	 */
	void enterSelect_where(DBGrammarParser.Select_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#select_where}.
	 * @param ctx the parse tree
	 */
	void exitSelect_where(DBGrammarParser.Select_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(DBGrammarParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(DBGrammarParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#select_from}.
	 * @param ctx the parse tree
	 */
	void enterSelect_from(DBGrammarParser.Select_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#select_from}.
	 * @param ctx the parse tree
	 */
	void exitSelect_from(DBGrammarParser.Select_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#select_what}.
	 * @param ctx the parse tree
	 */
	void enterSelect_what(DBGrammarParser.Select_whatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#select_what}.
	 * @param ctx the parse tree
	 */
	void exitSelect_what(DBGrammarParser.Select_whatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(DBGrammarParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(DBGrammarParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(DBGrammarParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(DBGrammarParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#insert_colums}.
	 * @param ctx the parse tree
	 */
	void enterInsert_colums(DBGrammarParser.Insert_columsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#insert_colums}.
	 * @param ctx the parse tree
	 */
	void exitInsert_colums(DBGrammarParser.Insert_columsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void enterInsert_values(DBGrammarParser.Insert_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void exitInsert_values(DBGrammarParser.Insert_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#insert_expr}.
	 * @param ctx the parse tree
	 */
	void enterInsert_expr(DBGrammarParser.Insert_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#insert_expr}.
	 * @param ctx the parse tree
	 */
	void exitInsert_expr(DBGrammarParser.Insert_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(DBGrammarParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(DBGrammarParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#update_set}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set(DBGrammarParser.Update_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#update_set}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set(DBGrammarParser.Update_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#update_idef}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_idef(DBGrammarParser.Update_idefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#update_idef}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_idef(DBGrammarParser.Update_idefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#update_expr}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_expr(DBGrammarParser.Update_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#update_expr}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_expr(DBGrammarParser.Update_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#update_where}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_where(DBGrammarParser.Update_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#update_where}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_where(DBGrammarParser.Update_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DBGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DBGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#not_num_value}.
	 * @param ctx the parse tree
	 */
	void enterNot_num_value(DBGrammarParser.Not_num_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#not_num_value}.
	 * @param ctx the parse tree
	 */
	void exitNot_num_value(DBGrammarParser.Not_num_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(DBGrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(DBGrammarParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#binary_operator_sum_sub}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_sum_sub(DBGrammarParser.Binary_operator_sum_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#binary_operator_sum_sub}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_sum_sub(DBGrammarParser.Binary_operator_sum_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#binary_operator_mul_del}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_mul_del(DBGrammarParser.Binary_operator_mul_delContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#binary_operator_mul_del}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_mul_del(DBGrammarParser.Binary_operator_mul_delContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#binary_operator_comp}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_comp(DBGrammarParser.Binary_operator_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#binary_operator_comp}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_comp(DBGrammarParser.Binary_operator_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#binary_operator_eq}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_eq(DBGrammarParser.Binary_operator_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#binary_operator_eq}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_eq(DBGrammarParser.Binary_operator_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(DBGrammarParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(DBGrammarParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(DBGrammarParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(DBGrammarParser.Unary_operatorContext ctx);
}