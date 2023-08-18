package collections.transformation

/**
 * mengubah nested collection menjadi 1 collection
 */

class Product(val category: String, val name: List<String>)

fun main() {
    val list: List<List<String>> = listOf(
        listOf("Melbourne", "Adelaide", "Sydney"),
        listOf("Tokyo", "Fukushima", "Kobe"),
    )

    val unionList = list.flatten()
    println(unionList)

    val product = listOf(
        Product("Minuman", listOf("Es teh", "Es jeruk")),
        Product("Makanan", listOf("Pecel", "Kredok", "Soto"))
    )

    val flatMap = product.flatMap { it.name }
    println(flatMap)
}