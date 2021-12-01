package day1_1

import java.io.File

fun main() {
    val input = File("src/main/kotlin/day1_1/input").readLines().map { it.toInt()  }
    var largerMeasurementCount = 0;
    for (i in 1 until input.size) {
            if (input[i] > input[i - 1]) {
                largerMeasurementCount++
            }
    }
    println(largerMeasurementCount)
}