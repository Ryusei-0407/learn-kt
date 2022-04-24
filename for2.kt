fun main() {
    for (i in 1..10) {
        print("$i ")
        if (i == 10) print("\n")
    }

    for (i in 10 downTo 0 step 2) {
        print("$i ")
        if (i == 0) print("\n")
    }

    val colors = arrayOf("red", "green", "blue")
    for (color in colors) println(color)
}
