package teststucture.queryresults

class StringRes(val expect:String): BaseRes() {
    override fun _getExepected(): String {
        return "@string: \"${expect}\""
    }

}