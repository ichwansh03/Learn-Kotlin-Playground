 package generic

 //can only set output data
class Covariant<out T>(private val data: T) {

    //return must be follow type parameter
    fun data(): T {
        return data
    }
}

 interface Data{
     fun core(name: String)
 }

//can only set input data
class Contravariant<in T>: Data {
    fun getData(data: T){
        return println("Data: $data")
    }

    override fun core(name: String) {
        return println("from $name at data")
    }
}

fun main() {

    val data: Covariant<String> = Covariant("200 OK")

    println(data.data())

    val dataCon: Contravariant<Any> = Contravariant()

    dataCon.getData("Ichwan")
}