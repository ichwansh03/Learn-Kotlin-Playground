package controlflow

fun main(){
    val message = manageList {
        append("Hello")
        append(" Brother")
        append(12)
    }

    println(message)
}

fun manageList(union: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.union()
    return stringBuilder.toString()
}