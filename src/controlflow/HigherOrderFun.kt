package controlflow

fun main() {
    printResult(10){ nilai ->
        nilai * nilai
    }

    val messages = "Hello everyone"

    printUser(messages){username, name, age ->
        println("$messages, my name is $name and $age years old, my username is $username")
    }
}

//sum dijadikan function yang menampung nilai dari value
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

//keyword inline berfungsi untuk mengurangi pembuatan instance ketika fun printUser di print berulang kali
inline fun printUser(message: String, callback: (username: String, name: String, age: Int) -> Unit){
    val usernames = "ichwansh03"
    val names = "Ichwna Sholihin"
    val ages = 22
    callback(usernames, names, ages)
}