package visitors

import parser.sqlqueryresultparser.QueryResultBaseVisitor
import teststucture.queryresults.Table

class TableVisitor: QueryResultBaseVisitor<Table>() {
}