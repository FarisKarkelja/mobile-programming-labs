// Part A
data class Student(val name: String, val id: Int, val grades: List<Int>)

// Part B
data class Student2(val name: String, val id: Int, val grades: List<Int>) {
    fun calculateAverage(): Double {
        var sum = 0.0
        for (grade in grades) {
            sum += grade
        }
        return sum / grades.size
    }

    fun letterGrade(): Char {
        val average = calculateAverage()
        return when {
            average >= 90 -> 'A'
            average >= 80 -> 'B'
            average >= 70 -> 'C'
            average >= 60 -> 'D'
            else -> 'F'
        }
    }
}

// Part C
fun Student2.isPassing(): Boolean {
    val average = calculateAverage()
    if (average >= 55) {
        return true
    }
    return false
}

// Part D
fun task3() {
    val students = listOf(
        Student2("John", 1, listOf(90, 92, 98)),
        Student2("James", 2, listOf(80, 82, 78)),
        Student2("Alice", 3, listOf(60, 35, 76)),
        Student2("Bob", 4, listOf(98, 98, 98)),
        Student2("Max", 5, listOf(50, 50, 58)),
        Student2("Janice", 6, listOf(64, 72, 58)),
        Student2("Andreas", 7, listOf(90, 92, 97)),
        Student2("Mathew", 8, listOf(86, 92, 88)),
        Student2("Layla", 9, listOf(70, 80, 90)),
        Student2("Cleo", 10, listOf(61, 75, 85))
    )

    val top3 = students
        .sortedByDescending { it.calculateAverage() }
        .take(3)

    top3.forEach {
        println("${it.name} (${it.id}) -> avg = ${"%.2f".format(it.calculateAverage())}, grade=${it.letterGrade()}")
    }

    students
        .filter { it.isPassing() }
        .forEach {
            println("${it.name} -> ${"%.2f".format(it.calculateAverage())}")
        }
}

fun main() {
    task3()
}