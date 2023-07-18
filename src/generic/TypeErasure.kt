package generic

//change generic (from T to Any) when compile time
inline fun <reified A, reified  B> Pair <*, *>.asPairOf(): Pair<A, B>? {
    if (first !is A || second !is B) return null
    return first as A to second as B
}

val somePair: Pair<Any?, Any?> = "items" to listOf(1,2,3,4,5)

fun main() {
    val stringToSomething = somePair.asPairOf<String, Any>()
    println("stringToSomething = $stringToSomething")

    //null, because list cannot defined to Int
    val stringToInt = somePair.asPairOf<String, Int>()
    println("stringToInt = $stringToInt")

    //null, because list cannot defined to String
    val stringToString = somePair.asPairOf<String, String>()
    println("stringToString = $stringToString")

    val stringToList = somePair.asPairOf<String, List<*>>()
    println("stringToList = $stringToList")

    val stringToStringList = somePair.asPairOf<String, List<String>>()
    println("stringToStringList = $stringToStringList")
}