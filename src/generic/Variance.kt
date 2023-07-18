 package generic

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

//can only set output data
class Covariant<out T>(private val data: T) {

    //return must be follow type parameter
    fun data(): T {
        return data
    }
}

//can only set input data
class Contravariant<in T>{
    fun getData(data: T){
        return println("Data: $data")
    }
}

fun main() {
    val car = Car(230)
    val motorCycle = MotorCycle(120)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val data1: Covariant<Int> = Covariant(2000)
    val data2: Covariant<Int> =data1

    println(data2.data())

    val dataCon1: Contravariant<String> = Contravariant()
    val dataCon2: Contravariant<String> = dataCon1

    dataCon2.getData("Ichwan")
}