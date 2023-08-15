package classes.inheritance


fun main() {

    val product = Product("Items")
    product.confirmState("Loading")
    product.changeState("Success")

    val report = Report("weekly data")
    report.confirmState("Successfully Added")
    report.changeState("Finish")

    val result = HttpRequest(404, "not found")
    println("result ${result.code}")
}