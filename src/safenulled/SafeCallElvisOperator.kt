package safenulled

fun main() {
    val text: String? = null
    println(text?.length)

    val textLength = text?.length ?: 5
    println(textLength)
}