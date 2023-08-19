package collections

/**
 * mengurutkan data pada collection
 */

data class Disaster(val name: String, val city: String)

fun main() {

    val number = listOf(1,4,5,2,3,8,6,7,10)

    println(number.sorted())
    println(number.sortedDescending())

    val disaster = listOf(
        Disaster("Haze", "JK"),
        Disaster("Earthquake", "ST"),
        Disaster("Volcano", "LP")
    )

    println(disaster.sortedBy { it.city })

    val list = (1..10).toList()
    println(list.shuffled())

}