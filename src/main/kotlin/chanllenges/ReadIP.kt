package chanllenges

import java.io.File

fun main() {

    val ipToCount = mutableMapOf<String, Int>()

    File("src/60.ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount[it] = previous + 1
    }

    val (maxIp, maxCount) = ipToCount.entries.maxByOrNull { it.value }!!

    println("The most frequent ip address is $maxIp, which occurred $maxCount times.")
}