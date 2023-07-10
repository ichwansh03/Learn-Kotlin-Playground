package item

interface GetData {

    fun read(callback: (
        username: String,
        name: String,
        age: Int
    ) -> Unit){
        val usernames = "ichwansh03"
        val names = "Ichwna Sholihin"
        val ages = 22
        callback(usernames, names, ages)
    }
}