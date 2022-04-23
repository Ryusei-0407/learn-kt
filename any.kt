fun foo(arg: Any?) {
    when (arg) {
        is Int -> println("Int: $arg")
        is Char -> println("Char: $arg")
        is String -> println("String: $arg")
    }
}

fun main() {
    val a: Int = 42
    val c: Char = 'A'
    val s: String = "Kotlin"

    foo(a)
    foo(c)
    foo(s)
}
