// Generated from /home/hehogcode/Workspace/DataBase/LogicModule/src/main/java/Logic/DBGrammar.g4 by ANTLR 4.8
package Logic.Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#mynumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMynumber(DBGrammarParser.MynumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#mystring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMystring(DBGrammarParser.MystringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(DBGrammarParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DBGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#mychar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMychar(DBGrammarParser.MycharContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#myint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyint(DBGrammarParser.MyintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#myfloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyfloat(DBGrammarParser.MyfloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DBGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DBGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#sql_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_query(DBGrammarParser.Sql_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#show_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_create(DBGrammarParser.Show_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(DBGrammarParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(DBGrammarParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#table_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_list(DBGrammarParser.Table_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(DBGrammarParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_definition(DBGrammarParser.Table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#columns_sourse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_sourse(DBGrammarParser.Columns_sourseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(DBGrammarParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(DBGrammarParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(DBGrammarParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#select_where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_where(DBGrammarParser.Select_whereContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(DBGrammarParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#select_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_from(DBGrammarParser.Select_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#select_what}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_what(DBGrammarParser.Select_whatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(DBGrammarParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(DBGrammarParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#insert_colums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_colums(DBGrammarParser.Insert_columsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#insert_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_values(DBGrammarParser.Insert_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#insert_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_expr(DBGrammarParser.Insert_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DBGrammarParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#update_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set(DBGrammarParser.Update_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#update_idef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_idef(DBGrammarParser.Update_idefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#update_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_expr(DBGrammarParser.Update_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#update_where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_where(DBGrammarParser.Update_whereContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DBGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#not_num_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_num_value(DBGrammarParser.Not_num_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(DBGrammarParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#binary_operator_sum_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_sum_sub(DBGrammarParser.Binary_operator_sum_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#binary_operator_mul_del}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_mul_del(DBGrammarParser.Binary_operator_mul_delContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#binary_operator_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_comp(DBGrammarParser.Binary_operator_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#binary_operator_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_eq(DBGrammarParser.Binary_operator_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(DBGrammarParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(DBGrammarParser.Unary_operatorContext ctx);
}