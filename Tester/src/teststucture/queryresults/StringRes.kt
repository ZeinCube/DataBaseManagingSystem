package teststucture.queryresults

class StringRes(val expect:String): BaseRes() {
    override fun toString(): String {
        return "@string: \"${expect}\""
    }

}