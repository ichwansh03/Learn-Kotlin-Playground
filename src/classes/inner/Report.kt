package classes.inner

/**
 * inner keyword digunakan agar class inner dapat mengakses data dari class outer
 */
class Report(val data: String, val status: Int) {

    inner class ReportDisaster(val data: String){
        fun printReport(){
            println("this data is ${this@Report.data} from $data with $status")
        }
    }
}

fun main() {
    val flood = Report("Flood", 200)

    flood.ReportDisaster("Flood-JKT").printReport()
}