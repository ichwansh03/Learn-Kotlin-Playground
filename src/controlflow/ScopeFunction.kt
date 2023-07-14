package controlflow

fun main() {
    //return value based on different expression inside lambda
    run()

    //the context object is passed as an argument, but inside the lambda, it's available as a receiver (this).
    with()

    //the context object is available as a receiver (this), and return value is the object itself
    apply()

    //access context from object, if null then let (biarkan) => no need to print
    let()
}

fun run(){
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = "Hai"
        "replace text from $from to $to"
    }

    println("result: $result")
}

fun with(){
    val numbers = mutableListOf("one", "two", "three")
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }
}

data class User(
    var name: String,
    var username: String? = null,
    var age: Int? = 0,
    var password: String? = null)

fun apply() {
    val ichwan = User("Ichwan").apply {
        username = "ichwansh03"
        age = 22
        password = "12**5"
    }

    println(ichwan)
}

fun let(){
    val message: String? = null
    message?.let {
        val length = it.length
        val text = "text length: $length"

        println(text)
    }
}