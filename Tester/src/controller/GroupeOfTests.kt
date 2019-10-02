package controller

import java.io.File

class GroupeOfTests {
    var Tests : Array<Test> = arrayOf()
    lateinit var name : Test
    constructor(dir: String, n :String)
    {
        name = Test(n,"")
        println("$dir$n\\meta.txt")
        println("$dir")
        val meta = File("$dir$n\\meta.txt")
        print(meta.exists())
        meta.forEachLine {

            val inDir = File( "$dir$n\\$it.in")
            val outDir = File( "$dir$n\\$it.out")
            Tests = Tests + Test(it,"OK",inDir.readLines().toTypedArray(),outDir.readLines().toTypedArray())
        }

    }
}