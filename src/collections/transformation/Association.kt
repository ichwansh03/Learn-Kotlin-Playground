package collections.transformation

/**
 * transformasi result element bisa dijadikan key atau value
 */
fun main() {
    val list1 = listOf("NUS", "Univ. Malaya", "UI")
    val map1 = list1.associate { Pair(it, it.length) }
    println(map1)

    val map2 = list1.associateWith { it.length }
    println(map2)

    val map3 = list1.associateBy { it.length }
    println(map3)
}