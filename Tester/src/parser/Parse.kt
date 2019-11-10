package parser

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import parser.sqlqueryresultparser.QueryResultLexer
import parser.sqlqueryresultparser.QueryResultParser

fun Parse(s:String, parser: Class<out Parser>,lexer:Class<out Lexer>): ParseTree
{

    val lexer = lexer.getConstructor(CharStream::class.java).newInstance(CharStreams.fromString(s))
    val commonTokenStream = CommonTokenStream(lexer as TokenSource?)
    commonTokenStream.fill()
    val parser = parser.getConstructor(TokenStream::class.java).newInstance(commonTokenStream)
    var tree: ParseTree = parser.javaClass.getMethod("parse").invoke(parser) as ParseTree
    return tree;
}
