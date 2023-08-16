package classes.destructuring

/**
 * menggabungkan param dari data class menjadi 1 variabel
 * destructuring declaration juga bisa diterapkan di fun dan lambda exp
 */
data class Users(
    val id: Int,
    val name: String,
    val address: String
)

fun users(username: String) : Users {
    return when {
        username == "ichwan" -> Users(1,"Ichwan","Natar")
        else -> Users(0,"null","null")
    }
}
fun main() {
    val user = Users(1,"Ichwan","Natar")
    val (_, name, address) = user

    println("id: null, name: $name, address: $address")

    val (_, username, location) = users("ichwan")
    println("username $username, location $location")
}