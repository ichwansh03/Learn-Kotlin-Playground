package coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReports())
        println("have a good day!")
    }
}

suspend fun getWeatherReports() = coroutineScope {
    val forecast = async { getForecasts() }
    val temperature = async {
        try {
            getTemperatures()
        } catch (e: AssertionError){
            println("caught exception $e")
            "{no temperature found}"
        }
    }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getTemperatures(): String {
    delay(500)
    throw AssertionError("temperature is invalid")
    return "30\u00b0C"
}

suspend fun getForecasts(): String {
    delay(1000)
    return "Cloudly"
}
