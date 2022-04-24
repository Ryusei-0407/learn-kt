fun sub(x: Int = 10000, y: Int = 100): Int {
    return x - y
}

fun main() {
    println(sub())
    println(sub(100, 10))
    println(sub(y = 10))
}
