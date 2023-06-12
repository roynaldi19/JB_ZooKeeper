fun main() {
    val number = readLine()?.toIntOrNull()
    val reversedNumber = number?.let { reverseNumber(it) }
    println(reversedNumber)
}

fun reverseNumber(number: Int): Int {
    val units = number % 10
    val tens = (number / 10) % 10
    val hundreds = number / 100

    return units * 100 + tens * 10 + hundreds
}