// Generated from C:/Users/Алексей/Desktop/DataBaseManagingSystem/Tester/src/parser\TestGrammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TestGrammarParser}.
 */
public interface TestGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TestGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TestGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#parseIn}.
	 * @param ctx the parse tree
	 */
	void enterParseIn(TestGrammarParser.ParseInContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#parseIn}.
	 * @param ctx the parse tree
	 */
	void exitParseIn(TestGrammarParser.ParseInContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#parseOut}.
	 * @param ctx the parse tree
	 */
	void enterParseOut(TestGrammarParser.ParseOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#parseOut}.
	 * @param ctx the parse tree
	 */
	void exitParseOut(TestGrammarParser.ParseOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(TestGrammarParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(TestGrammarParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#test_block}.
	 * @param ctx the parse tree
	 */
	void enterTest_block(TestGrammarParser.Test_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#test_block}.
	 * @param ctx the parse tree
	 */
	void exitTest_block(TestGrammarParser.Test_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(TestGrammarParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(TestGrammarParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#myfor}.
	 * @param ctx the parse tree
	 */
	void enterMyfor(TestGrammarParser.MyforContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#myfor}.
	 * @param ctx the parse tree
	 */
	void exitMyfor(TestGrammarParser.MyforContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(TestGrammarParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(TestGrammarParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(TestGrammarParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(TestGrammarParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TestGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TestGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TestGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(TestGrammarParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TestGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(TestGrammarParser.Literal_valueContext ctx);
}