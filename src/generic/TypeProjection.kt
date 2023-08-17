package generic

/**
 * menambahkan info covariant dan contravariant di @param function
 * tanda asterix (*) berarti tipe yang digunakan bebas
 */

fun DataLength(array: Array<*>){
    println("length of array is ${array.size}")
}

class Sentences<T>(var tense: T)

fun copy(from: Sentences<out Any>, to: Sentences<in Any>){
    to.tense = from.tense
}

fun main() {
    val sentences = Sentences("Data")
    val sentences2: Sentences<Any> = Sentences("Data 2")

    copy(sentences, sentences2)

    val arraySize = arrayOf(1, 2, "3", 4, 5.0, "A")
    DataLength(arraySize)
}