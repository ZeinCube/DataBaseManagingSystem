package meta

open class TableDefinition {
    var name: String = "";
    var columns: Array<ColumnDef> = arrayOf()
}

class ColumnDef {

    var sp: Specificators? = null
    lateinit var t: MyType
    lateinit var name: String

    override fun toString(): String {
        if (sp == null)
            return name + " " + t.toString() + " "
        else
            return name + " " + t.toString() + " " + sp.toString()
    }

    enum class MyType {
        int,
        char,
        float;
        override fun toString(): String {
            return when(this)
            {
                (int) ->{"int"}
                (char) ->{"char[${length}]"}
                (float) ->{"float"}
                else -> throw Throwable("WFT")
            }
        }
        fun toClass():Class<Any>
        {
            return when(this)
            {
                (int) ->{Int.javaClass}
                (char) ->{String.javaClass}
                (float) ->{Double.javaClass}
                else -> throw Throwable("WFT")
            }
        }
        var length: Int = 1;
    }

    enum class Specificators {
        unique,
        primary_key;
        override fun toString(): String {
            return when(this)
            {
                (unique) ->{"unique"}
                (primary_key) ->{"primary key"}
                else -> throw Throwable("WFT")
            }
        }
    }
}