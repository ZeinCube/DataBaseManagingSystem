// Generated from D:/IDEA Projects/DataBaseManagingSystem/src/Logic\Hello.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HelloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HelloParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value(HelloParser.Insert_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value(HelloParser.Insert_valueContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#select_idef}.
	 * @param ctx the parse tree
	 */
	void enterSelect_idef(HelloParser.Select_idefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_idef}.
	 * @param ctx the parse tree
	 */
	void exitSelect_idef(HelloParser.Select_idefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(HelloParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(HelloParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#select_table_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_table_list(HelloParser.Select_table_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#select_table_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_table_list(HelloParser.Select_table_listContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#update_operand}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_operand(HelloParser.Update_operandContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#update_operand}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_operand(HelloParser.Update_operandContext ctx);
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
	 * Enter a parse tree produced by {@link HelloParser#sub_const_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void enterSub_const_arifm_expr(HelloParser.Sub_const_arifm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sub_const_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void exitSub_const_arifm_expr(HelloParser.Sub_const_arifm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#b_const_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_const_arifm_expr(HelloParser.B_const_arifm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#b_const_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_const_arifm_expr(HelloParser.B_const_arifm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(HelloParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(HelloParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(HelloParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(HelloParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(HelloParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(HelloParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(HelloParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(HelloParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#concate}.
	 * @param ctx the parse tree
	 */
	void enterConcate(HelloParser.ConcateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#concate}.
	 * @param ctx the parse tree
	 */
	void exitConcate(HelloParser.ConcateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mynull}.
	 * @param ctx the parse tree
	 */
	void enterMynull(HelloParser.MynullContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mynull}.
	 * @param ctx the parse tree
	 */
	void exitMynull(HelloParser.MynullContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#const_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_arifm_expr(HelloParser.Const_arifm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#const_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_arifm_expr(HelloParser.Const_arifm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sub_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void enterSub_arifm_expr(HelloParser.Sub_arifm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sub_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void exitSub_arifm_expr(HelloParser.Sub_arifm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#b_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_arifm_expr(HelloParser.B_arifm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#b_arifm_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_arifm_expr(HelloParser.B_arifm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#arifm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArifm_expr(HelloParser.Arifm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#arifm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArifm_expr(HelloParser.Arifm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(HelloParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(HelloParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#neq}.
	 * @param ctx the parse tree
	 */
	void enterNeq(HelloParser.NeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#neq}.
	 * @param ctx the parse tree
	 */
	void exitNeq(HelloParser.NeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#moreeq}.
	 * @param ctx the parse tree
	 */
	void enterMoreeq(HelloParser.MoreeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#moreeq}.
	 * @param ctx the parse tree
	 */
	void exitMoreeq(HelloParser.MoreeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#more}.
	 * @param ctx the parse tree
	 */
	void enterMore(HelloParser.MoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#more}.
	 * @param ctx the parse tree
	 */
	void exitMore(HelloParser.MoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#less}.
	 * @param ctx the parse tree
	 */
	void enterLess(HelloParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#less}.
	 * @param ctx the parse tree
	 */
	void exitLess(HelloParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#lesseq}.
	 * @param ctx the parse tree
	 */
	void enterLesseq(HelloParser.LesseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#lesseq}.
	 * @param ctx the parse tree
	 */
	void exitLesseq(HelloParser.LesseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comp_op1}.
	 * @param ctx the parse tree
	 */
	void enterComp_op1(HelloParser.Comp_op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comp_op1}.
	 * @param ctx the parse tree
	 */
	void exitComp_op1(HelloParser.Comp_op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#comp_op2}.
	 * @param ctx the parse tree
	 */
	void enterComp_op2(HelloParser.Comp_op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#comp_op2}.
	 * @param ctx the parse tree
	 */
	void exitComp_op2(HelloParser.Comp_op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#b_const_compare_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_const_compare_expr(HelloParser.B_const_compare_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#b_const_compare_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_const_compare_expr(HelloParser.B_const_compare_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#const_compare_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_compare_expr(HelloParser.Const_compare_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#const_compare_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_compare_expr(HelloParser.Const_compare_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#b_compare_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_compare_expr(HelloParser.B_compare_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#b_compare_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_compare_expr(HelloParser.B_compare_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#compare_expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expr(HelloParser.Compare_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#compare_expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expr(HelloParser.Compare_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mytrue}.
	 * @param ctx the parse tree
	 */
	void enterMytrue(HelloParser.MytrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mytrue}.
	 * @param ctx the parse tree
	 */
	void exitMytrue(HelloParser.MytrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#myfalse}.
	 * @param ctx the parse tree
	 */
	void enterMyfalse(HelloParser.MyfalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#myfalse}.
	 * @param ctx the parse tree
	 */
	void exitMyfalse(HelloParser.MyfalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#logic_literal}.
	 * @param ctx the parse tree
	 */
	void enterLogic_literal(HelloParser.Logic_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#logic_literal}.
	 * @param ctx the parse tree
	 */
	void exitLogic_literal(HelloParser.Logic_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#not_const_logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot_const_logic_expr(HelloParser.Not_const_logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#not_const_logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot_const_logic_expr(HelloParser.Not_const_logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(HelloParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(HelloParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(HelloParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(HelloParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#b_const_logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_const_logic_expr(HelloParser.B_const_logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#b_const_logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_const_logic_expr(HelloParser.B_const_logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#const_logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_logic_expr(HelloParser.Const_logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#const_logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_logic_expr(HelloParser.Const_logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#not_logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot_logic_expr(HelloParser.Not_logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#not_logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot_logic_expr(HelloParser.Not_logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#b_logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterB_logic_expr(HelloParser.B_logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#b_logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitB_logic_expr(HelloParser.B_logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(HelloParser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(HelloParser.Logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr(HelloParser.Const_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr(HelloParser.Const_exprContext ctx);
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
}