package generic

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * untuk men-tracking perubahan data sebelum dan sesudah
 */

class LogObservable<T>(data: T) : ObservableProperty<T>(data){

    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("${property.name} changed success before $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("${property.name} changed success after $oldValue to $newValue")
    }
}

class Product(name: String, price: Int, stock: Int){
    var name: String by LogObservable(name)
    var price: Int by LogObservable(price)
    var stock: Int by LogObservable(stock)

    //buat observable tanpa class log
    var category: String by Delegates.vetoable("Makanan"){
        property, oldValue, newValue ->
        println("${property.name} changed success before $oldValue to $newValue")
        true
    }

    var description: String by Delegates.observable("desc"){
        property, oldValue, newValue ->
        println("${property.name} changed success after $oldValue to $newValue")
    }
}

fun main() {

    var product = Product("Es Teh",2000,3)
    product.name = "Es Jeruk"

    product.category = "Minuman"
    product.description = "Enak"
}