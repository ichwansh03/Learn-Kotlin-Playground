package generic

/**
 * menambahkan info covariant dan contravariant di @param function
 */
class Sentences<T>(var tense: T)

fun copy(from: Sentences<out Any>, to: Sentences<in Any>){
    to.tense = from.tense
}

fun main() {
    val sentences = Sentences("Data")
    val sentences2: Sentences<Any> = Sentences("Data 2")

    copy(sentences, sentences2)
}