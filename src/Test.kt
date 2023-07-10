fun main() {
    val items = listOf(1,2,3,4,5)

    items.fold(0) { acc: Int, i: Int ->
        print("acc = $acc, i = $i")
        val result = acc + i
        println("result = $result")
        result
    }

    val joinedToString = items.fold("Elements:") { acc, i -> "$acc $i" }
    val product = items.fold(1, Int::times)
}
