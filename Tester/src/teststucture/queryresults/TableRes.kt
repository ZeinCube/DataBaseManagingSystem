package teststucture.queryresults

import visitors.Table

class TableRes(var table: Table): BaseRes() {
    override fun _getExepected(): String {
        return "@table \n $table"
    }

}