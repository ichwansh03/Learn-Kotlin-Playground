package function

/**
 * lambda expression : function yang tidak memiliki nama
 * langsung include pada variable, array dll
 */

//typealias untuk function
typealias RequestData = (Int, String) -> String

fun main() {
    val requestCode: RequestData = {resultHttp: Int, message: String ->
        val result = "{result: $resultHttp, message: $message}"
        result
    }

    val result = requestCode(200,"Success")
    println(result)

    //it hanya jalan jika 1 parameter
    val name: (String) -> String = {
        "hello $it"
    }

    val names = name("Ichwan")
    println(names)

    //method references
    fun login (username: String, password: String): String{
        return "Username: $username, Password: $password"
    }

    val loginUser : (String, String) -> String = ::login
    println(loginUser("Ichwan","123abc"))
}