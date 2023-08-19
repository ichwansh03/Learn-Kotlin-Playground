package collections

/**
 * melakukan filtrasi tanpa menghapus data indexnya
 * partition() berfungsi untuk memisahkan antara data yg masuk ke filterring dan tidak masuk
 */
fun main() {
    val number = (1..10).toList()
    val list1 = number.filter { it > 4 }
    val list2 = list1.filterIndexed { index, _ -> index % 2 == 0 }
    println(list2)

    val (listEven, listOdd) = number.partition { it % 2 == 0 }
    println(listEven)
    println(listOdd)

    println(number.any { it > 0 })
    println(number.none { it > 0 })
    println(number.all { it > 0 })

    val list3 = listOf(null, 1, 1.2, "Ichwan", 'A', "Sholihin")
    val getString = list3.filterIsInstance<String>()
    println(getString)
}