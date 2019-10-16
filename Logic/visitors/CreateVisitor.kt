package visitors

import antlr.HelloParser
import executables.CreateTableExecutable
import executables.Executable

class CreateVisitor: BaseVisitor()
{
    override fun visitCreate(ctx: HelloParser.CreateContext?): Executable<String> {
        if (ctx != null) {
            return this.visit(ctx.children[1])
        }else
        {
            throw Throwable("WTF What i showed create?")
        }
    }

    override fun visitTable(ctx: HelloParser.TableContext?): Executable<String> {

        return CreateTableExecutable(ctx!!.table_definition())
    }
}



