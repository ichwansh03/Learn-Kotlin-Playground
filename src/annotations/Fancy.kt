package annotations

/**
 * annotation tidak boleh memiliki property dan function
 */

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)
