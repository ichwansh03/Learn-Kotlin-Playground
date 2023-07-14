package abstracts

interface User {
    fun validate()
    val age: Int
}

class Child(override val age: Int) : User {
    override fun validate() {
        if (age > 18) println("adult")
        else println("child")
    }
}

fun main() {
    Child(20).validate()
}