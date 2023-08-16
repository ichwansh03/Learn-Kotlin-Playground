package annotations

@Fancy("Ichwan")
class Annotate(val name: String, val version: Int){
    fun info(): String = "App $name in version $version"
}

fun main() {
    val annotate = Annotate("Sholihin",1)
    println(annotate.info())
}