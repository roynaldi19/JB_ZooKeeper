fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // do not change this line
    // enter your code
    val hours = (totalSeconds / 3600) % 24
    val minutes = (totalSeconds % 3600) / 60
    val seconds = (totalSeconds % 3600) % 60

    val formattedTime = "%02d:%02d:%02d".format(hours, minutes, seconds)
    println(formattedTime)

}