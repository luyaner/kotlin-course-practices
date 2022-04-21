package functions

fun main() {
    val number = listOf<Int>(1, 2, 3, 4, 6, 8, 10)
    println(reverse(number))
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size -1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}