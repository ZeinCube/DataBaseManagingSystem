package visitors
import antlr.HelloBaseVisitor
import antlr.HelloParser
import java.util.*

interface Executable
{
    fun execute():String;
}
abstract class BaseVisitor: HelloBaseVisitor<Executable>();
class CentralVisitor:BaseVisitor()  {
    override fun visitParse(ctx: HelloParser.ParseContext?): Executable {

        if (ctx != null) {
            return SQLSwitcher().visit(ctx.children[0])
        }else
        {
            throw Throwable("WTF");
        }
    }
}

class SQLSwitcher: BaseVisitor()
{
    override fun visitSql_query(ctx: HelloParser.Sql_queryContext?): Executable {
        if (ctx != null) {
            return this.visit(ctx.children[0])
        }else
        {
            throw Throwable("WTF");
        }
    }

    override fun visitCreate(ctx: HelloParser.CreateContext?): Executable {
        return CreateVisitor().visitCreate(ctx)
    }

    override fun visitDrop(ctx: HelloParser.DropContext?): Executable {
        return super.visitDrop(ctx)
    }

    override fun visitShow_create(ctx: HelloParser.Show_createContext?): Executable {
        return super.visitShow_create(ctx)
    }

}