package day2_1

import java.io.File

class Position {
    var x = 0
    var y = 0
}

fun main() {
    val input = File("src/main/kotlin/day2_1/input").readLines()
    val position = Position()

    for (line in input) {
        if (line.contains("forward")) {
            position.x += line.filter { it.isDigit() }.toInt()
        } else if (line.contains("down")) {
            position.y += line.filter { it.isDigit() }.toInt()
        } else if (line.contains("up")) {
            position.y -= line.filter { it.isDigit() }.toInt()
        }
    }
    println(position.x * position.y)
}