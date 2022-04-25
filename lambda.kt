fun main() {
    val add1 = fun(x: Int, y: Int): Int = x + y

    println(add1(3, 5))

    val add2 = { a: Int, b: Int -> a + b }
    val add3: (Int, Int) -> Int = { a, b -> a + b }

    println(add2(3, 5))
    println(add3(3, 5))

    val square: (Int) -> Int = { it * it }
    println(square(5))
}
