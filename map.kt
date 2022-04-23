fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map[1])

    for ((k, v) in map) {
        println("$k -> $v")
    }
}
