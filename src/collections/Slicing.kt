package collections

/**
 * menggunakan fungsi take() dan drop() untuk men-slicing collections
 * chunked() untuk men-separate collection sesuai size
 * windowed() juga untuk men-separate sesuai size, step dan kondisi mencetak datanya
 */
fun main() {
    val chars = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(3))
    println(chars.takeWhile { it < 'j' })
    println(chars.takeLastWhile { it > 'x' })

    println(chars.drop(5))
    println(chars.dropLast(5))
    println(chars.dropWhile { it < 'x' })
    println(chars.dropLastWhile { it > 'y' })

    val range = (1..20).toList()
    val list1 = range.chunked(5)
    println(list1)
    val list2 = range.chunked(5) {values ->
        var total = 0
        for (value in values){
            total += value
        }
        total
    }
    println(list2)
}