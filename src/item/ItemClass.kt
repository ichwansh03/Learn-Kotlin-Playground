package item

class ItemClass : GetData {

    private val getDataUser: GetData = object : GetData {}

    var id: Int? = 0
    var name: String? = null

    object User{
        var ids: Int? = 0
        var names: String? = null
    }

    fun data(){
        name = "Ichwan Sholihin"
        User.names = name
    }

    fun getNames(): String{
        return name.toString()
    }
    
    fun getDataCallback(){
        getDataUser.read { _, name, _ ->
            User.names = name
        }
    }
}