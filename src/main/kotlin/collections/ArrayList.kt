package collections

fun main() {
    // an array will not be resize and is easy to loop
    val array = arrayOf("Peter", "John", "Amy")
    // elements of an array could be mixed types
    val mixedArray = arrayOf("Porfessor", 51, false)
    // get and set element
    val title = mixedArray[0]
    println(title)
    mixedArray[1] = 48
    println(mixedArray[1])
    //string could be treated as an array
    val str = "HotBeauty"
    println(str[0])
//    str[3] = 'b'
    // arrays with same type can be combined
    val students = arrayOf("Jane", "Ann")
    val allStudents = array + students
    println(allStudents.size)

    val empty = allStudents.isEmpty()
    println(empty)

    if (allStudents.contains("Emma")) {
        println("Emma is one of the students.")
    } else {
        println("Emma is not a student.")
    }

    //a list is able to resize
    val list = listOf("Honda", "Suzuki", "Yamaha")

    //an arraylist is able to resize
    println("-------------ArrayList--------------")
    val arrayList = arrayListOf("Revit", "Dianese", "Arai", "Shoei")
    val anotherArrayList = arrayListOf("Bmw")
    arrayList.add("Tcx")
    arrayList.add(0, "Unknown")
    println(arrayList[0])
    println(arrayList + anotherArrayList)
    println(arrayList.size)
    println(anotherArrayList.isEmpty())
    println(arrayList.contains("Revit"))
    val remove = arrayList.remove("Jack")
    println(remove)

    val subList = arrayList.subList(1, 4)
    println(subList)
}