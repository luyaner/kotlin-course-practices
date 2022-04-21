package oo

class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun <T> stackOf(vararg elements: T): Stack<T> {
        return Stack(*elements)
    }
}

fun main(args: Array<String>) {
    val stack = Stack(1,3,5,7,9)
    val stack1 = Stack("Hey", "Hello", "Halo")

    for (i in 1..3) {
        println(stack1.pop())
    }

    stack.push(11)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}