package collections

/**
 * sequence mengeksekusi semua operasi secara lazy, hanya akan dibutuhkan
 * dan tidak menambahkan banyak operasi ketika dijalankan
 */
fun main() {
    val words = "the quickly brown fox jumps over the lazy dogs".split(" ")

    val result = words
        .filter { println("filter: $it"); it.length > 3 }
        .map { println("map: $it"); it.length }
        .take(4)

    println(result)

    val resultSequence = words.asSequence()
        .filter { println("filter: $it"); it.length > 3 }
        .map { println("map: $it"); it.length }
        .take(4)

    println(resultSequence.toList())
}