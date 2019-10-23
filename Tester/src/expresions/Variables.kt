package expresions

abstract class Variable{
    fun operation(other:Variable,op:String):Variable {
        return other._operation(this,op);
    }
    abstract fun castAs(type:String):Variable
    abstract fun unOp(op: String):Variable
    abstract fun _operation(other:Variable,op:String):Variable;
    abstract fun _operation(other:StringVar,op:String):Variable;
    abstract fun _operation(other:IntVar,op:String):Variable;
    abstract fun _operation(other:DoubleVar,op:String):Variable;
    abstract fun _operation(other:BoolVar,op:String):Variable;
    /*
    operator fun plus(other:Variable):Variable
    operator fun div(other:Variable):Variable
    operator fun times(other:Variable):Variable
    operator fun compareTo(other:Variable):Int
    operator fun minus(other:Variable):Variable
    operator fun not():Variable
    operator fun rem(other: Variable):Variable
    override operator fun equals(other: Any?): Boolean
    operator fun rem(other: Variable):Variable*/

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //var s3 = Operation.Sum().op(s1, s2)
        }
    }
}

class StringVar(var value:String): Variable()
{
    override fun castAs(type: String):Variable {
        try {
            return when(type.toLowerCase())
            {
                ("int")->IntVar(value.toInt())
                ("double")->DoubleVar(value.toDouble())
                ("string")-> this
                ("bool")->BoolVar(value.toBoolean())
                ("boolean")->BoolVar(value.toBoolean())
                else -> throw Throwable("WTF")
            }
        }catch (ex:Throwable)
        {
            throw Throwable("Cast type wrong")
        }
    }

    override fun unOp(op: String):Variable {
        throw Throwable("Type mismatch")
    }

    override fun _operation(other: Variable, op: String): Variable {
        return other._operation(this,op)
    }

    override fun _operation(other: StringVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"-> StringVar(value+other.value)
            "||"->StringVar(value+other.value)
            "<"->BoolVar(value.compareTo(other.value)<0)
            "<="->BoolVar(value.compareTo(other.value)<=0)
            ">"->BoolVar(value.compareTo(other.value)>0)
            ">="->BoolVar(value.compareTo(other.value)>=0)
            "=="->BoolVar(value==other.value)
            "!="->BoolVar(value!=other.value)
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: IntVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "=="->BoolVar(value==other.value.toString())
            "!="->BoolVar(value!=other.value.toString())
            "+"-> StringVar(value+other.value)
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: DoubleVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "=="->BoolVar(value==other.value.toString())
            "!="->BoolVar(value!=other.value.toString())
            "+"-> StringVar(value+other.value)
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: BoolVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "=="->BoolVar(value==other.value.toString())
            "!="->BoolVar(value!=other.value.toString())
            "+"-> StringVar(value+other.value)
            else -> throw Throwable("Type mismatch")
        }
    }

}
class IntVar(var value:Int):Variable()
{
    override fun castAs(type: String):Variable {
        try {
            return when(type.toLowerCase())
            {
                ("int")->this
                ("double")->DoubleVar(value.toDouble())
                ("string")-> StringVar(value.toString())
                ("boolean")-> BoolVar(value!=0)
                ("bool")-> BoolVar(value!=0)
                else -> throw Throwable("Cast type wrong")
            }
        }catch (ex:Throwable)
        {
            throw Throwable("Cast type wrong")
        }
    }

    override fun unOp(op: String): Variable {
        return when(op.toLowerCase())
        {
            ("-")->IntVar(-value)
            ("+")->IntVar(value)
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: Variable, op: String): Variable {
        return other._operation(this,op)
    }

    override fun _operation(other: StringVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"-> StringVar(value.toString()+other.value)
            "=="->BoolVar(value.toString()==other.value.toString())
            "!="->BoolVar(value.toString()!=other.value.toString())
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: IntVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"->IntVar(value+other.value)
            "-"->IntVar(value-other.value)
            "*"->IntVar(value*other.value)
            "/"->IntVar(value/other.value)
            "%"->IntVar(value+other.value)
            "||"-> IntVar((value.toString()+other.value.toString()).toInt())
            "&"->BoolVar((value!=0) and (other.value != 0))
            "|"->BoolVar((value!=0) or (other.value != 0))
            "<"->BoolVar(value<other.value)
            "<="->BoolVar(value<=other.value)
            ">"->BoolVar(value>other.value)
            ">="->BoolVar(value>=other.value)
            "=="->BoolVar(value==other.value)
            "!="->BoolVar(value!=other.value)
            "and"->BoolVar((value!=0) and (other.value != 0))
            "or"->BoolVar((value!=0) or (other.value != 0))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: DoubleVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"->DoubleVar(value+other.value)
            "-"->DoubleVar(value-other.value)
            "*"->DoubleVar(value*other.value)
            "/"->DoubleVar(value/other.value)
            "%"->DoubleVar(value+other.value)
            "||"-> DoubleVar((value.toString()+other.value.toString()).toDouble())
            "&"->BoolVar((value!=0) and (other.value != 0.0))
            "|"->BoolVar((value!=0) or (other.value != 0.0))
            "<"->BoolVar(value<other.value)
            "<="->BoolVar(value<=other.value)
            ">"->BoolVar(value>other.value)
            ">="->BoolVar(value>=other.value)
            "=="->BoolVar(value.toDouble()==other.value)
            "!="->BoolVar(value.toDouble()!=other.value)
            "and"->BoolVar((value!=0) and (other.value != 0.0))
            "or"->BoolVar((value!=0) or (other.value != 0.0))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: BoolVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "&"->BoolVar((value!=0) and (other.value))
            "|"->BoolVar((value!=0) or (other.value))
            "and"->BoolVar((value!=0) and (other.value))
            "or"->BoolVar((value!=0) or (other.value))
            else -> throw Throwable("Type mismatch")
        }
    }

}

class DoubleVar(var value:Double):Variable()
{
    override fun castAs(type: String):Variable {
        try {
            return when(type.toLowerCase())
            {
                ("int")->IntVar(value.toInt())
                ("double")->this
                ("string")-> StringVar(value.toString())
                ("boolean")-> BoolVar(value!=0.0)
                ("bool")-> BoolVar(value!=0.0)
                else -> throw Throwable("WTF")
            }
        }catch (ex:Throwable)
        {
            throw Throwable("Cast type wrong")
        }
    }

    override fun unOp(op: String): Variable {
        return when(op.toLowerCase())
        {
            ("-")->DoubleVar(-value)
            ("+")->DoubleVar(value)
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: Variable, op: String): Variable {
        return other._operation(this,op)
    }

    override fun _operation(other: StringVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"-> StringVar(value.toString()+other.value)
            "=="->BoolVar(value.toString()==other.value)
            "!="->BoolVar(value.toString()!=other.value)
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: IntVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"->DoubleVar(value+other.value)
            "-"->DoubleVar(value-other.value)
            "*"->DoubleVar(value*other.value)
            "/"->DoubleVar(value/other.value)
            "%"->DoubleVar(value+other.value)
            "||"-> DoubleVar((value.toString()+other.value.toString()).toDouble())
            "&"->BoolVar((value!=0.0) and (other.value != 0))
            "|"->BoolVar((value!=0.0) or (other.value != 0))
            "<"->BoolVar(value<other.value)
            "<="->BoolVar(value<=other.value)
            ">"->BoolVar(value>other.value)
            ">="->BoolVar(value>=other.value)
            "=="->BoolVar(value==other.value.toDouble())
            "!="->BoolVar(value!=other.value.toDouble())
            "and"->BoolVar((value!=0.0) and (other.value != 0))
            "or"->BoolVar((value!=0.0) or (other.value != 0))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: DoubleVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "+"->DoubleVar(value+other.value)
            "-"->DoubleVar(value-other.value)
            "*"->DoubleVar(value*other.value)
            "/"->DoubleVar(value/other.value)
            "%"->DoubleVar(value+other.value)
            "||"-> DoubleVar((value.toString()+other.value.toString()).toDouble())
            "&"->BoolVar((value!=0.0) and (other.value != 0.0))
            "|"->BoolVar((value!=0.0) or (other.value != 0.0))
            "<"->BoolVar(value<other.value)
            "<="->BoolVar(value<=other.value)
            ">"->BoolVar(value>other.value)
            ">="->BoolVar(value>=other.value)
            "=="->BoolVar(value==other.value)
            "!="->BoolVar(value!=other.value)
            "and"->BoolVar((value!=0.0) and (other.value != 0.0))
            "or"->BoolVar((value!=0.0) or (other.value != 0.0))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: BoolVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "&"->BoolVar((value!=0.0) and (other.value))
            "|"->BoolVar((value!=0.0) or (other.value))
            "and"->BoolVar((value!=0.0) and (other.value))
            "or"->BoolVar((value!=0.0) or (other.value))
            else -> throw Throwable("Type mismatch")
        }
    }

}
class BoolVar(var value:Boolean):Variable()
{

    override fun castAs(type: String):Variable {
        try {
            return when(type.toLowerCase())
            {
                ("string")-> StringVar(value.toString())
                ("bool")->this
                ("boolean")->this
                else -> throw Throwable("Cast type wrong")
            }
        }catch (ex:Throwable)
        {
            throw Throwable("Cast type wrong")
        }
    }

    override fun unOp(op: String): Variable {
        return when(op.toLowerCase())
        {
            ("~")->BoolVar(value.not())
            ("@not")->BoolVar(value.not())
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: Variable, op: String): Variable {
        return other._operation(this,op)
    }

    override fun _operation(other: StringVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "&"->BoolVar((value) and (other.value.toBoolean()))
            "|"->BoolVar((value) or (other.value.toBoolean()))
            "and"->BoolVar((value) and (other.value.toBoolean()))
            "or"->BoolVar((value) or (other.value.toBoolean()))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: IntVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "&"->BoolVar((value) and (other.value != 0))
            "|"->BoolVar((value) or (other.value != 0))
            "and"->BoolVar((value) and (other.value != 0))
            "or"->BoolVar((value) or (other.value != 0))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: DoubleVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "&"->BoolVar((value) and (other.value != 0.0))
            "|"->BoolVar((value) or (other.value != 0.0))
            "and"->BoolVar((value) and (other.value != 0.0))
            "or"->BoolVar((value) or (other.value != 0.0))
            else -> throw Throwable("Type mismatch")
        }
    }

    override fun _operation(other: BoolVar, op: String): Variable {
        return when(op.toLowerCase())
        {
            "&"->BoolVar((value) and (other.value))
            "|"->BoolVar((value) or (other.value))
            "and"->BoolVar((value) and (other.value))
            "or"->BoolVar((value) or (other.value))
            else -> throw Throwable("Type mismatch")
        }
    }


}


