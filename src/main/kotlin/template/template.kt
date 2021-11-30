package template

import java.io.File

fun main() {
    val input = File("src/day1_1/input").readLines().map { it.toInt()  }
    val input2 = File("src/day1_1/input").readText()
    val input3 = File("src/day1_1/input").readLines()

    val sanitized = "   5-6-7".trim()
    val numbers = sanitized.split("-").map { it.toInt() }

    for (i in input) {
        for (j in input) {
            if (i + j == 2021) {
                println(i * j)
                return
            }
        }
    }

//    val validCounter = input.count { line ->
//        val minimum = line.substringBefore("-").toInt()
//        val max = line.substringAfter("-").substringBefore(" ").toInt()
//        val letter = line.substringAfter(" ").substringBefore(":")[0]
//        val letterCounter = line.count { letter == it } - 1
//        letterCounter in minimum..max
}