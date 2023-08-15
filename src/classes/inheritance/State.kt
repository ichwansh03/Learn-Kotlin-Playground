package classes.inheritance

/**
 * menggunakan keyword open agar dapat di inherit
 * keyword open dapat digunakan pada class, function, dan properties
 */
open class State(val status: String) {

    open val requestCodeSuccess: Int = 200

    fun confirmState(status: String){
        println("this ${this.status} is $status")
    }

    open fun changeState(message: String){
        println("you can change this $message when status is ${this.status}")
    }
}

class Product(data: String) : State(data){

    override val requestCodeSuccess: Int
        get() = 201

    override fun changeState(message: String) {
        println("change $message from product, result $requestCodeSuccess OK")
    }
}

class Report(message: String) : State(message){

    //akses value milik class parent
    override val requestCodeSuccess: Int
        get() = super.requestCodeSuccess

    override fun changeState(message: String) {
        println("change $message from report, result $requestCodeSuccess OK")
    }
}

/**
 * versi kotlin saat ini sudah tidak mendukung constructor
 * cek @link berikut: https://kotlinlang.org/docs/classes.html#constructors
 */
//open class Result(val data: String, val result: Int) {
//    constructor(data: String, result: Int): this(data, result)
//}

open class Result {

    val code: Int
    val message: String

    constructor(code: Int, message: String) {
        this.code = code
        this.message = message
    }

}

class HttpRequest(code: Int, message: String): Result(400, "not found")
