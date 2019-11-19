package teststucture.queryresults

class TableRes(var table: Table): BaseRes() {
    override fun toString(): String {
        return "@table \n ${table}"
    }

}