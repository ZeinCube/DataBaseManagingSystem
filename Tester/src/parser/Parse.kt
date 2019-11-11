package parser

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import parser.sqlqueryresultparser.QueryResultLexer
import parser.sqlqueryresultparser.QueryResultParser
import parser.testscriptparser.TestScriptLexer
import parser.testscriptparser.TestScriptParser

fun ParseToTree(s:String, parser: Class<out Parser>,lexer:Class<out Lexer>): ParseTree
{

    val lexer = lexer.getConstructor(CharStream::class.java).newInstance(CharStreams.fromString(s))
    val commonTokenStream = CommonTokenStream(lexer as TokenSource?)
    commonTokenStream.fill()
    val parser = parser.getConstructor(TokenStream::class.java).newInstance(commonTokenStream)
    var tree: ParseTree = parser.javaClass.getMethod("parse").invoke(parser) as ParseTree
    return tree;
}


fun parseTestScript(s:String):ParseTree
{
    return ParseToTree(s,TestScriptParser::class.java,TestScriptLexer::class.java)
}

fun parseQueryResult(s:String):ParseTree
{
    return ParseToTree(s,QueryResultParser::class.java,QueryResultLexer::class.java)
}