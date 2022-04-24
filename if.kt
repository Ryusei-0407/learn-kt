fun main() {
    val a: Int = 42;

    if (a > 100) {
        println("Big!!")
    } else {
        println("Small!!")
    }

    val n: Int = 100;
    val m: Int = 200;

    val l: Int = if (n > m) {
        n
    } else {
        m
    }

    println(l)
}
