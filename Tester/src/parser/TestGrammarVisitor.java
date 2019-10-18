// Generated from C:/Users/Алексей/Desktop/DataBaseManagingSystem/Tester/src/parser\TestGrammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TestGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TestGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TestGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#parseIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseIn(TestGrammarParser.ParseInContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#parseOut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseOut(TestGrammarParser.ParseOutContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(TestGrammarParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#test_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_block(TestGrammarParser.Test_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(TestGrammarParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#myfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyfor(TestGrammarParser.MyforContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(TestGrammarParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(TestGrammarParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TestGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TestGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(TestGrammarParser.Literal_valueContext ctx);
}