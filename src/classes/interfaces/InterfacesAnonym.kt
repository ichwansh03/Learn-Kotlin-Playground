package classes.interfaces

interface User {
    fun validate()
    val age: Int

    //concrete function
    fun adults(name: String){
        when(age){
            in 10..18 -> println("you are kid")
            in 19..40 -> println("you are adult")
            else -> println("baby or grand adult")
        }
    }
}

interface Admin{
    val name: String
}

class Age(override val age: Int, override val name: String) : User, Admin {

    init {
        println("=====Admin: $name=====")
    }

    override fun validate() {
        if (age > 18) println("adult")
        else println("child")
    }
}

fun main() {
    Age(17, "Mahmud").validate()
    Age(19, "Admin").adults("Joko")
}