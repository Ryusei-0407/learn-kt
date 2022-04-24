fun foo(vararg args: String) {
    args.forEach {
        println(it)
    }
}

fun main() {
    foo("A", "B", "C")

    val arr = arrayOf("A", "B", "C")
    foo(*arr)
}
