package controller

import java.io.File
import java.nio.file.Paths
import java.util.*
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater

enum class TestType {
    group,
    test,
    root
}

class Test(var name: String, var mainTestResult: String, var _in: Array<String>? = null, var _out: Array<String>? = null, var type: TestType, var gr: String? = null) {
    var updater: () -> Unit = {}
    val _results: Array<String> = Array<String>(0, { "" })
    val _des: Array<String> = Array<String>(0, { "" })

    fun update(_name: String, __in: Array<String>, __out: Array<String>) {
        var _path = Paths.get("").toAbsolutePath().toString()
        var path = "$_path\\tests\\$gr"
        var meta = File("$path\\meta.txt")
        var tests = meta.readLines()
        meta.delete()
        meta.createNewFile()
        var flag = true
        for (s in tests)
            if (s != name)
                if (flag) {
                    flag = false
                    meta.appendText(s)
                } else
                    meta.appendText("\n$s")
            else
                if (flag) {
                    flag = false
                    meta.appendText(_name)
                } else
                    meta.appendText("\n" + _name)

        name = _name
        var inFile = File("$path\\$name.in")
        var outFile = File("$path\\$name.out")

        inFile.delete()
        outFile.delete()
        inFile.createNewFile()
        outFile.createNewFile()
        for (s in __in)
            inFile.appendText(s + "\n")
        for (s in __out)
            outFile.appendText(s + "\n")
        _in = __in
        _out = __out
        updater()

    }

    fun checkTest() {

    }
}

