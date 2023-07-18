package generic

class DataUser<T>(private val username: T, private val password: T, private val age: T){
    fun printData(){
        return println("Username: $username").apply {
            println("Password : $password")
            println("Age : $age")
        }
    }

    fun getData(){
        return with(DataUser(username, password, age)){
            println("$username, $password, $age")
        }
    }
}

//multiple generic type
interface User<T, U> {
    fun validate (user: T, pass: U) : T
}

class Login : User<Any, Int> {

    override fun validate(user: Any, pass: Int): Any {
        return if (pass == 123){
            println("Login success")
        } else
            println("Username or password incorrect")
    }
}

fun main() {

    val dataUser: DataUser<Any> = DataUser("ichwansh03","123",22)
    dataUser.printData()
    dataUser.getData()

    Login().validate("ichwansh03", 123)
}