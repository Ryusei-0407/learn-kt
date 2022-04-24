fun main() {
    println("ABC" is String)
    println("ABC" !is String)

    open class ClassA()
    class ClassB() : ClassA()
    val a = ClassA()
    val b = ClassB()

    println(a is ClassA)
    println(a is ClassB)
    println(b is ClassA)
    println(b is ClassB)
}
