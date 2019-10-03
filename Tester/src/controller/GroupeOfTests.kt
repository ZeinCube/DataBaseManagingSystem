package controller

import java.io.File

class GroupeOfTests {
    var Tests : Array<Test> = arrayOf()
    lateinit var name : Test
    lateinit var dirr  : String
    constructor(dir: String, n :String)
    {
        name = Test(n,"",null,null,TestType.group)
        println("$dir$n\\meta.txt")
        println("$dir")
        dirr  = "$dir$n"
        val meta = File("$dir$n\\meta.txt")
        print(meta.exists())
        meta.forEachLine {

            val inDir = File( "$dir$n\\$it.in")
            val outDir = File( "$dir$n\\$it.out")
            Tests = Tests + Test(it,"",inDir.readLines().toTypedArray(),outDir.readLines().toTypedArray(),TestType.test)
        }

    }
    fun exist(s:String): Boolean {
        var flag = true;
        for(t in Tests)
        {
            if (t.name==s)
            {
                flag = false
            }
        }
        return !flag
    }
    fun addTest(s:String)
    {
        val meta = File("$dirr\\meta.txt")
        meta.appendText("\n$s")
        val inDir = File( "$dirr\\$s.in")
        val outDir = File( "$dirr\\$s.out")
        inDir.createNewFile()
        outDir.createNewFile()
        Tests+= Test(s,"",null,null,TestType.test)
    }
}