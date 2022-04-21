package io

fun main() {
    val nameToId = mutableMapOf(
        "Jane" to 12160086,
        "Hanna" to 14209786,
        "Wanyi" to 12184723
    )

    println(nameToId.keys)
    println(nameToId.values)
    println(nameToId.entries)

    nameToId["Momo"] = 14228429
    nameToId.putIfAbsent("Jane", 12140085)
    println(nameToId)

    println(nameToId.contains("Jane"))
    println(nameToId.containsKey("John"))
    println(nameToId.containsValue(18181818))

    println(nameToId["Wanyi"])
    println(nameToId.getOrDefault("Wang", "Default"))

    nameToId.entries.forEach {
        println("${it.key}, ID: ${it.value}")
    }
}