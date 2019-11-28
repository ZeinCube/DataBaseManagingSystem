package teststucture.queryresults

import MySQLRealGetString
import parser.parseQueryResult
import visitors.TableVisitor

class Table(var ordered: Boolean) {
    override operator fun equals(other: Any?): Boolean {
        if (other is Table) {
            if (ordered) {
                return this.toString() == other.toString()
            } else {
                val records = records.map { record -> record.toString() }
                for (i in other.records)
                {
                    if (records.contains(i.toString()))
                    {
                        records.minus(i.toString())
                    }else
                    {
                        return false
                    }
                }
                return records.isEmpty()
            }
        } else
            return  false
    }

    constructor(s: String) : this(false) {
        val res = TableVisitor().visit(parseQueryResult("@table\n" + s, "rq_table"))!!
        columns = res.columns
        records = res.records
        ordered = res.ordered
    }

    class Record() {
        var values: Array<String> = arrayOf()
        override fun toString(): String {
            return "\n" + values.joinToString(" ")
        }

        operator fun get(i: Int): String {
            while (i >= values.size) {
                values += "NULL"
            }
            return MySQLRealGetString(values[i])
        }

        operator fun plus(s: Any) {
            values += s.toString()
        }
    }

    var columns: Array<String> = arrayOf()
    var records: Array<Record> = arrayOf()
    operator fun plus(s: String) {
        columns += s
    }

    operator fun plus(s: Record) {
        records += s
    }

    operator fun get(i: Int): Record {
        return records[i]
    }

    override fun toString(): String {
        return columns.joinToString(" ") + records.joinToString("")
    }

    override fun hashCode(): Int {
        var result = ordered.hashCode()
        result = 31 * result + columns.contentHashCode()
        result = 31 * result + records.contentHashCode()
        return result
    }
}