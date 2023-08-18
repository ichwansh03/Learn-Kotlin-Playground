package collections.transformation

/**
 * pairing data dari 2 collection berupa Pair<T1, T2>
 */
fun main() {
    val list1 = listOf("UI", "ITB", "UGM", "ITS")
    val list2 = listOf("FASILKOM", "STEI", "MKOM")

    val list3 = list1.zip(list2)
    println(list3)

    val list4 = list1.zip(list2){univ, fakultas ->
        "$univ -> $fakultas"
    }
    println(list4)

    val pair = listOf(
        "UI" to "M.Cs.",
        "ITB" to "M.T.",
        "UGM" to "M.Kom."
    )

    val unpairing = pair.unzip()
    println(unpairing.first)
    println(unpairing.second)
}