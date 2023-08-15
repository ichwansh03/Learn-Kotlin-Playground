package classes.abstracts

/**
 * memaksa semua class turunan mengextend properties dan functionnya
 */
abstract class ApiRequest(val statusCode: Int) {
    abstract val message: String
    abstract fun data()
}

class User: ApiRequest(200) {
    override val message: String = "200 OK"

    override fun data() {
        println("data not available")
    }

}