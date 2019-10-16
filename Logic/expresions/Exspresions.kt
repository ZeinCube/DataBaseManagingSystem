package expresions

import antlr.HelloParser
import executables.Executable

interface Expresion<T>:Executable<T>

open class ConstExpresion<T>():Expresion<T>
{

    constructor(ce:ConstExpresion<out T>) : this() {
        value = ce.value
    }

    fun toExecutable():Executable<String>
    {
        return object :Executable<String>
        {
            var s:String = value.toString()
            override fun execute(): String {
                return s;
            }
        }
    }

    protected var value:T? = null;
    override fun execute(): T {
        return value!!;
    }
}



class LogicConstExpr:ConstExpresion<Boolean>
{
    constructor(b:Boolean)
    {
        value = b
    }
    fun not():LogicConstExpr
    {
        value = ! value!!
        return this;
    }
    constructor(ctx:HelloParser.Const_logic_exprContext) {
        value = LogicConstExprVisitor().visit(ctx).execute()
    }
}