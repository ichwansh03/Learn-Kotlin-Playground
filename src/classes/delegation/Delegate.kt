package classes.delegation

/**
 * dengan keyword by, tidak perlu lagi meng-override function dan properties
 * cukup gunakan milik parent
 */

interface Disaster{
    val name: String

    fun dataDisaster(name: String, killed: Int)
}

class DataDisaster: Disaster {
    override val name: String
        get() = "Flood"

    override fun dataDisaster(name: String, killed: Int) {
        println("name $name with $killed people")
    }
}

class Tsunami(val disaster: Disaster) : Disaster by disaster

fun main() {

    val disaster = Tsunami(DataDisaster())

    disaster.dataDisaster("Flood", 230)
}