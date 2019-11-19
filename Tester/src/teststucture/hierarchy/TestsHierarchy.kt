package teststucture.hierarchy

import teststucture.tests.BaseTest

abstract class TestsHierarchy(var name: String = "")
{
    enum class HierarchyType
    {
        root,
        group,
        script
    }
    var conclusion: BaseTest.TestResult = BaseTest.TestResult.NT
    lateinit var type: HierarchyType
    var selected: Boolean = true
    abstract fun checkTests(necessarily:Boolean)
}

