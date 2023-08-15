package function

/***
 * menambahkan function pada tipe data yg sudah ada
 */

fun String.loading(): String {
    return "Data Loading"
}

fun String.error(): String {
    return "Data Error"
}

fun String.success(): String {
    return "Data Success"
}

fun main() {
    val login = "error"

    when(login){
        "loading" -> println(login.loading())
        "error" -> println(login.error())
        "success" -> println(login.success())
    }
}