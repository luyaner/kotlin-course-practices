package loops

fun main() {
    for (c in "Kotlin") {
        if (c == 'i') {
            break
        }
        print(c)
    }

    println("-----------------------------------")

    val list = listOf("Honda", "Suzuki", "Yamaha")
    for (element in list) {
        if (!element.contains('a')) {
            continue
        }
        println(element)
    }
}