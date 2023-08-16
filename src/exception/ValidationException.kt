package exception

/**
 * direkomendasikan untuk membuat class exception sendiri (custom)
 * agar lebih mudah dimonitor ketika error
 */
class ValidationException(message: String) : Throwable(message)

class CheckedException(message: String) : Throwable(message)

fun userValidate(name: String) {
    if (name.isBlank())
        throw ValidationException("name cannot blank")
    else
        println("hi $name")
}

fun userCheck(name: String){
    if (name != "ichwan")
        throw CheckedException("you cannot change name")
    else
        println("done")
}
fun main() {
    try {
        userValidate("")
        userCheck("bambang")
    } catch (e: ValidationException){
        println("error ${e.message}")
    } catch (e: CheckedException){
        println("checked error ${e.message}")
    } finally {
        println("done")
    }
}