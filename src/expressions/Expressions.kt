package expressions

fun main() {
    val list = listOf(1,2,3,4,5,6)
    val value: Any = 9

    when(value){
        in list -> println("Yes, in list")
        !in list -> println("No, not in list")
        else -> println("you wierd? input must be a number")
    }

    when(value){
        is Int -> println("is it integer")
        is String -> println("is it string")
        else -> println("undefined")
    }
}