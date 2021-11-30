package day1_1

import java.io.File

fun main() {
    val input = File("src/Day1_1/input").readLines().map { it.toInt()  }
    for (i in input) {
        for (j in input) {
            if (i + j == 2020) {
                println(i * j)
                return
            }
        }
    }
}