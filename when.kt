fun main() {
    println(describe(1))
    println(describe(2))
    println(describe("Hello"))
    val a: Long = 42
    println(describe(a))

    println(type("Hello, World"))
    println(type(42))
    println(type(42.0F))
    println(type(42.0))
    println(type(true))
}

fun describe(obj: Any): String =
    when (obj) {
        1 -> "One"
        in 2..3 -> "Two or Three"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }

fun type(i: Any): String =
    when (i) {
        is String -> "String"
        is Int -> "Int"
        is Long -> "Long"
        is Float -> "Float"
        is Double -> "Double"
        is Boolean -> "Boolean"
        else -> "Unknown"
    }
