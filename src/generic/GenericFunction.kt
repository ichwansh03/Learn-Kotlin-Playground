package generic

class Generic(val message: String, val code: Int) {
    fun <T> getDataGeneric(params: T){
        println("get data $params with code $code and message $message")
    }
}

fun main() {
    val getData = Generic("Success",200)

    getData.getDataGeneric(123)
}