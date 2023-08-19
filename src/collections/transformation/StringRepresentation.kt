package collections.transformation

/**
 * transformasi dari collection ke string
 */
fun main() {
    val list = listOf("Rajawali", "Candimas", "Natar")

    val join = list.joinToString(", ","-","=")
    println(join)

    val builder = StringBuilder()
    list.joinTo(builder, ", ","[","]=>")
    list.joinTo(builder, ", ","[","]")
    println(builder)
}