fun main() {
    // write your code here
    val year = readln().toInt()
    if (year in 1900..3000){
        val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
        val output = if (isLeapYear) "Leap" else "Regular"
        println(output)

    }
}

