package loops

fun main() {
    var sum = 0
    for (i in 100..100000) {
        sum = sum + i
    }
    println(sum)
}