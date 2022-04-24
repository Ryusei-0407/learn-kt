fun main() {
    foo@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 5 && j == 5) break@foo
            print("${i * j} ")
        }
        println()
    }
}
