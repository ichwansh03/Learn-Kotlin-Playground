package classes.sealed

/**
 * jenis class yang didesain sama dengan inheritance
 * default sealed class adalah abstract class
 * cocok untuk class parent
 */
sealed class RequestState(val code: Int, val message: String)

class Success : RequestState(200,"OK")
class Error : RequestState(400,"ERROR")

fun getData(name: String, requestState: RequestState){
    return when(requestState){
        is Error -> println("status $name error: ${requestState.code} ${requestState.message}")
        is Success -> println("status $name success: ${requestState.code} ${requestState.message}")
    }
}

fun main() {
    getData("Report", Error())
    getData("Product", Success())
}