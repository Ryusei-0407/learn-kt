fun main() {
    val a = 42

    try {
        if (a == 50) throw IllegalStateException()
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Finally")
    }
}
