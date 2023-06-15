fun main() {
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()

    val ascendingOrder = h1 <= h2 && h2 <= h3
    val descendingOrder = h1 >= h2 && h2 >= h3

    val arrangedCorrectly = ascendingOrder || descendingOrder

    if (arrangedCorrectly) {
        println("true")
    } else {
        println("false")
    }

}