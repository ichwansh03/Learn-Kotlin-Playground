package classes

interface User {
    fun validate()
    val age: Int
}

class Child(override val age: Int) : User {

    init {
        println("inisialisasi class")
    }

    override fun validate() {
        if (age > 18) println("adult")
        else println("child")
    }
}

fun main() {
    Child(20).validate()
}