package generic

/**
 * membatasi data yang boleh digunakan di generic @param type
 * keyword where digunakan untuk membatasi lebih dari 1 type
 */
interface DataDisaster{
    fun getData(name: String, killed: Int)
}

open class Disaster

class Flood : Disaster()

//limited generic constraint only 1 type
//class Haze<T : Flood>(val haze: T)
//inline type parameter
class Haze(val haze: Flood)

class Earthquake : Disaster(), DataDisaster {
    override fun getData(name: String, killed: Int) {
        println("disaster $name in killed $killed people")
    }
}

//limited generic constraint more than 1 type
class Tsunami<T>(val disaster: T) where T : Disaster, T : DataDisaster

fun main() {

    val disaster = Haze(Flood())

    val data = Tsunami(Earthquake())

    data.disaster.getData("Flood",230)
}