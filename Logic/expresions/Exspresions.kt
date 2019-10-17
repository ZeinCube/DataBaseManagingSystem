package expresions

import antlr.HelloParser
import executables.Executable

interface Expresion<T>:Executable<T>

open class ConstExpresion<T>():Expresion<T>
{
    constructor(ce:T) : this() {
        value = ce
    }

    fun toExecutable():Executable<String>
    {
        return object :Executable<String>
        {
            var s:String? = null
            init {
                if (value!=null)
                {
                    s=value.toString()
                }else{
                    s=null
                }
            }

            override fun execute(): String {
                if (s==null)
                    return "NULL"
                else
                    return s!!;
            }
        }
    }

    protected var value:T? = null;
    override fun execute(): T {
        return value!!;
    }
}



class CompConstExpr:ConstExpresion<Boolean>
{
    constructor(b:Boolean)
    {
        value = b
    }

    constructor(ctx:HelloParser.Const_logic_exprContext) {
        value = ConstLogicExprVisitor().visit(ctx)
    }
}