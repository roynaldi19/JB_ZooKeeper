fun main() {
    // Read the input values
    val firstHours = readLine()!!.toInt()
    val firstMinutes = readLine()!!.toInt()
    val firstSeconds = readLine()!!.toInt()
    val secondHours = readLine()!!.toInt()
    val secondMinutes = readLine()!!.toInt()
    val secondSeconds = readLine()!!.toInt()

    // Convert moments to seconds
    val firstTotalSeconds = firstHours * 3600 + firstMinutes * 60 + firstSeconds
    val secondTotalSeconds = secondHours * 3600 + secondMinutes * 60 + secondSeconds

    // Calculate time difference in seconds
    val secondsDifference = secondTotalSeconds - firstTotalSeconds

    // Output the result
    println(secondsDifference)
}