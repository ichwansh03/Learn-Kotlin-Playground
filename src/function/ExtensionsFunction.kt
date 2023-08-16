package function

/***
 * menambahkan function/properties pada tipe data/class yg sudah ada
 */

val name: String
    get() = "Extensions Properties"

fun String.loading(): String {
    return "Data Loading"
}

fun String.error(code: Int): String {
    return "Data Error | Status: $code"
}

fun String.success(code: Int): String {
    return "Data Success | Status: $code"
}

fun main() {
    val login = "error"

    when(login){
        "loading" -> println(login.loading())
        "error" -> println(login.error(400))
        "success" -> println(login.success(200))
    }

    println(name)
}