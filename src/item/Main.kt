package item

fun main() {

    val getDataUser: GetData = object : GetData {}

    val item = ItemClass()
    item.data()
    var name = ItemClass.User.names

    println(name)

    println(item.getNames())

    getDataUser.read { username, name, age ->
        println(username)
        println(name)
        println(age)
    }
}

