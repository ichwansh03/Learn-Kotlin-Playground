package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        println("weather forecast")
        //printed in the same time
        /*launch {
            printForecasts()
        }
        launch {
            printTemperatures()
        }*/
        //synchronous code from begin to end, but forecast and temperatur is async
        /*val forecast: Deferred<String> = async {
            getForecast()
        }
        val temperature: Deferred<String> = async {
            getTemprature()
        }
        println("${forecast.await()} ${temperature.await()}")*/
        getWeatherReport()
        println("have a good day!")
    }
}

//parallel with text have a good day
suspend fun getWeatherReport() = coroutineScope {
    val forecast = async {
        getForecast()
    }
    val temperature = async {
        getTemprature()
    }
    println("${forecast.await()} ${temperature.await()}")
}

//nothing suspend modifier, fun delay isn't work
suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemprature(): String {
    delay(1000)
    return "30\u00b0C"
}
