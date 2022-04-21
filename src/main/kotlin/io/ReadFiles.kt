package io

import java.io.File

fun main() {

    var lineNumber = 0

    File("src/readFile.txt").forEachLine {
        lineNumber++
        println("#$lineNumber $it")
    }
}