package classes.inheritance

/**
 * menggunakan keyword is untuk cek data dalam tipe data
 * keyword as untuk cast tipe data
 */

fun check(any: Any){
    when(any) {
        is Product -> println("get code ${any.requestCodeSuccess} from product")
        is Report -> println("get code ${any.requestCodeSuccess} from report")
        !is Product -> println("get code from not product")
    }
}

fun cast(any: Any){
    val value = any as Int
    println(value)
}
fun main() {
    check(Product("from product"))

    check("Finish")

    cast(20)
}