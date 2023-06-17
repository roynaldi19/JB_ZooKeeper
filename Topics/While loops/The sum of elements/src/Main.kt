fun main() {
    var sum = 0
    var number: Int

    do {
        number = readLine()!!.toInt()
        sum += number
    } while (number != 0)

    println("$sum")
}