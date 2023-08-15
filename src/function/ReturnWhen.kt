package function

/**
 * menggunakan expression langsung pada return function
 */
fun main() {

    fun validate(result: Boolean): String{
        return when(result){
            true -> "Benar"
            false -> "Salah"
        }
    }

    println(validate(true))
}