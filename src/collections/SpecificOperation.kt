package collections

/**
 * fungsi spesifik yang hanya ada pada collection tsb
 */

fun main() {
    val list = listOf("FASILKOM", "STEI", "DIKE", "FIK")

    println(list.getOrNull(1))
    println(list.getOrElse(2) { "null" })

    val sorted = list.sorted()
    println(sorted.binarySearch("FIK"))

    val set1 = (1..5).toSet()
    val set2 = (6..10).toSet()

    println(set1 union set2)
    println(set1 intersect set2)
    println(set1.subtract(set2))

}