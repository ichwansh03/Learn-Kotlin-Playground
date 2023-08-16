package classes.enumeration

enum class State(val description: String) {
    LOADING("data loading..."),

    ERROR("data error!"),

    SUCCESS("data successfully added")
}