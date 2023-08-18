package collections.transformation

/**
 * mengubah data ke tipe data lain menggunakan extension function map {}
 */
fun main() {

    val list1 = listOf("Ichwan", "Sholihin", "Siregar", "Nainggolan")
    val list2 = list1.map { it.uppercase() }
    println(list2)

    val set1 = setOf("English","Bahasa","Espana","Portuguesa")
    val set2 = set1.map { it.lowercase() }
    println(set2)

    val number = listOf(1,2,3,4,5,6,7,8)
    val odd = number.mapIndexedNotNull{index, num ->
        if (index % 2 == 0) null
        else num
    }

    println(odd)

    val even = (1..10).toList()
    val filter = even.mapNotNull {
        if (it % 2 == 0) null
        else it
    }

    println(filter)
}