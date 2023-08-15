package function

/**
 * lambda yang dapat dijadikan function sebagai parameter atau return value
 * lambda expression hanya dapat diletakkan dipaling akhir param
 */

fun main() {

    fun product(name: String, price: Int, detail: (String) -> String): String {
        return detail("{name: $name, price: $price}")
    }

    val result = product("Ciki",12000, detail = {
        "Detail product = $it"
    })

    println(result)
}