package collections

/**
 * melakukan operasi seperti di excel
 */

fun main() {
    val list = listOf(1,5,4,3,6,7,10,12,8)

    println(list.max())
    println(list.min())
    println(list.average())
    println(list.sum())

    println(list.sumOf { it * 2 })

    val min = list.reduce { first, second ->
        if (first < second) first
        else second
    }

    println(min)

    val sum = list.fold(0) {first, second ->
        first + second
    }

    println(sum)
}