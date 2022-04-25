enum class Color(val rgb: String) {
    RED("#f00"),
    GREEN("#0f0"),
    BLUE("#00f"),
}

fun main() {
    println(Color.RED)
    println(Color.RED.name)
    println(Color.RED.rgb)
}
