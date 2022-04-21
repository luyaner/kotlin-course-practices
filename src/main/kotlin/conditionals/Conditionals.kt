fun main() {
//    var age: Int = 15
//    if (age < 18) {
//        println("You cannot register.")
//    }

//    val mode: Int = 2
//    val result = when (mode) {
//        1 -> "mode is lazy."
//        2 -> {
//            "mode is 2."
//            "mode is busy."
//        }
//        3 -> "mode is super productive."
//        else -> { "invalid mode." }
//    }
//    print(result)

    val x = 10
    when(x) {
        5 -> println("x is 5")
        2*3 -> println("x is 6")
        "Hey there".length -> println("x is the length of 'hey there'")
        in 0..5 -> println("x is between 0 to 5")
        !in 6..11 -> println("x is not between 6 to 11")
        is Int -> println("x is of type Int")
    }
}