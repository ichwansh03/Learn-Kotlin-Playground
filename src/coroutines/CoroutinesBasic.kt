package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("weather forecast")
            printForecast()
            printTemperature()
        }
    }

    println("execute time: ${time / 1000.0} sec")
}

//nothing suspend modifier, fun delay isn't work
suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0c")
}
