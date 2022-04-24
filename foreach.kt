fun main() {
    val colors = arrayOf("Red", "Green", "Blue")

    colors.forEach {
        value -> println(value)
    }

    colors.forEachIndexed {
        index, value -> println("$index: $value")
    }
}
