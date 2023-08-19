package collections

/**
 * menggabungkan 2 collection
 */
fun main() {
    val list = listOf("IF","SI","TK","TE","IF","SIA","SI")
    val map = list.groupBy { value ->
        value.length > 2
    }

    println(map)
    val maps = list.groupingBy { it }
    println(maps.toString())
}