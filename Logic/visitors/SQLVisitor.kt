package visitors
import antlr.HelloBaseVisitor
import antlr.HelloParser
import executables.DropExecute
import executables.Executable
import executables.ShowCreateExecute
import expresions.ConstExprVisitor
import expresions.ConstExpresion
import expresions.Expresion
import java.lang.Exception


abstract class BaseVisitor: HelloBaseVisitor<Executable<String>>();
class SQLVisitor:BaseVisitor()  {
    override fun visitSql_query(ctx: HelloParser.Sql_queryContext?): Executable<String> {
        if (ctx != null) {
            return this.visit(ctx.children[0])
        }else
        {
            throw Throwable("WTF");
        }
    }

    override fun visitCreate(ctx: HelloParser.CreateContext?): Executable<String> {
        return CreateVisitor().visitCreate(ctx)
    }

    override fun visitDrop(ctx: HelloParser.DropContext?): Executable<String> {
        return DropExecute(ctx);
    }

    override fun visitShow_create(ctx: HelloParser.Show_createContext?): Executable<String> {
        return ShowCreateExecute(ctx)
    }

    override fun visitConst_expr(ctx: HelloParser.Const_exprContext?): Executable<String> {
        return ConstExpresion<Any?>(ConstExprVisitor().visit(ctx)).toExecutable();
    }
}