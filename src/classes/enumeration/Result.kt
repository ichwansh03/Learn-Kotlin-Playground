package classes.enumeration

typealias Status = State
fun main() {

    val allState: Array<Status> = Status.entries.toTypedArray()
    println(allState.toList())
}