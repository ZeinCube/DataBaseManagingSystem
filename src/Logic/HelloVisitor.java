// Generated from D:/IDEA Projects/DataBaseManagingSystem/src/Logic\Hello.g4 by ANTLR 4.7.2
package Logic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#mynumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMynumber(HelloParser.MynumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mystring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMystring(HelloParser.MystringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(HelloParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(HelloParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(HelloParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mychar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMychar(HelloParser.MycharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#myint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyint(HelloParser.MyintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#myfloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyfloat(HelloParser.MyfloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HelloParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sql_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_query(HelloParser.Sql_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HelloParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#insert_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_value(HelloParser.Insert_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#insert_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_values(HelloParser.Insert_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#insert_colums}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_colums(HelloParser.Insert_columsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(HelloParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#select_idef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_idef(HelloParser.Select_idefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(HelloParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#select_table_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_table_list(HelloParser.Select_table_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(HelloParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#update_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_operand(HelloParser.Update_operandContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#update_idef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_idef(HelloParser.Update_idefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(HelloParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#show_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_create(HelloParser.Show_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(HelloParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(HelloParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#table_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_list(HelloParser.Table_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(HelloParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_definition(HelloParser.Table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#columns_sourse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_sourse(HelloParser.Columns_sourseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(HelloParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(HelloParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sub_const_arifm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_const_arifm_expr(HelloParser.Sub_const_arifm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#b_const_arifm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_const_arifm_expr(HelloParser.B_const_arifm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(HelloParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(HelloParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(HelloParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(HelloParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#concate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcate(HelloParser.ConcateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mynull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMynull(HelloParser.MynullContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#const_arifm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_arifm_expr(HelloParser.Const_arifm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sub_arifm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_arifm_expr(HelloParser.Sub_arifm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#b_arifm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_arifm_expr(HelloParser.B_arifm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#arifm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArifm_expr(HelloParser.Arifm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(HelloParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#neq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeq(HelloParser.NeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#moreeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreeq(HelloParser.MoreeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#more}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore(HelloParser.MoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(HelloParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#lesseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLesseq(HelloParser.LesseqContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#comp_op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op1(HelloParser.Comp_op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#comp_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op2(HelloParser.Comp_op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#b_const_compare_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_const_compare_expr(HelloParser.B_const_compare_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#const_compare_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_compare_expr(HelloParser.Const_compare_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#b_compare_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_compare_expr(HelloParser.B_compare_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#compare_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_expr(HelloParser.Compare_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mytrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMytrue(HelloParser.MytrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#myfalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyfalse(HelloParser.MyfalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#logic_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_literal(HelloParser.Logic_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#not_const_logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_const_logic_expr(HelloParser.Not_const_logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(HelloParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(HelloParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#b_const_logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_const_logic_expr(HelloParser.B_const_logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#const_logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_logic_expr(HelloParser.Const_logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#not_logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_logic_expr(HelloParser.Not_logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#b_logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB_logic_expr(HelloParser.B_logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr(HelloParser.Logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#const_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_expr(HelloParser.Const_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
}