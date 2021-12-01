package day1_2

import java.io.File

fun main() {
    val input = File("src/main/kotlin/day1_1/input").readLines().map { it.toInt() }
    var largerMeasurementCount = 0
    for (i in 3 until input.size) {
        val window1 = input[i - 3] + input[i - 2] + input[i - 1]
        val window2 = input[i - 2] + input[i - 1] + input[i]
        if (window1 < window2) {
            largerMeasurementCount++
        }
    }
    println(largerMeasurementCount)
}