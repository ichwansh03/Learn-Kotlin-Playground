package function

/**
 * melakukan operasi matematika terhadap dua data
 * harus memiliki 1 param, tidak boleh varargs dan tidak boleh memiliki nilai default
 */

infix fun String.validate(number: Int): String {
    if (number % 2 == 0)
        return "Genap : $this"
    else
        return "Ganjil : $this"
}

fun main() {
    val result = "Lima Belas" validate 15

    println(result)
}