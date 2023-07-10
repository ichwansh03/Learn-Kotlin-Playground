package collections

fun main() {
    val list = listOf<Any>(1, 2, "Beep", true)
    val mutableList = mutableListOf<Any>(1, 4, 6, "Hai", 12.5, false)

    println(list)
    println(mutableList)

    println(list.subList(2,3))
    mutableList.add(3,"Add")
    println(mutableList)
}