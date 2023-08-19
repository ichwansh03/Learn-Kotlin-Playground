package collections

/**
 * melakukan pengecekan data pada collection
 */

fun main() {
    val univ = listOf("ITB", "UI", "UGM", "IPB", "ITS")
    println(univ.contains("UGM"))
    println(univ.containsAll(listOf("UI", "ITB", "UTI")))
}