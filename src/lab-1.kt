import kotlin.math.sqrt

// Part A
fun task1A() {
    val university: String = "IBU"
    val city: String = "Sarajevo"
    val year: Int = 2026
    //city = "Banja Luka"

    var course: String = "Mobile Programming"
    var level: Int = 1
    var isActive: Boolean = true
    course = "Mobilno"
    level = 2
    isActive = false

    println(course)
    println(level)
    println(isActive)
}

// Part B
fun task1B() {
    val name = "John"
    val age = 25
    val gpa = 7.5
    val isStudent: Boolean = true
    val gradeLetter: Char = 'A'
    if (isStudent) {
        println("$name is $age years old with a gpa of $gpa and grade letter equaling to $gradeLetter.")
    } else {
        println("Not a student.")
    }
}

// Part C
fun task1C() {
    var nickname: String? = "John"
    //println(nickname?.length)
    //println(nickname?:length)
    //println(nickname!!.length)
    //nickname = null
    //println(nickname?.length)
    //println(nickname?:length)
}

// Part D
fun calculateGrade(score: Int): String = when (score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    in 0..59 -> "F"
    else -> "Invalid"
}

fun task1D() {
    println(calculateGrade(93))
    println(calculateGrade(67))
    println(calculateGrade(31))
}

// Part E
fun task1E() {
    for (i in 1..100) {
        if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else {
            println(i)
        }
    }
}

fun isPrime(n: Int): Boolean {
    if (n < 2) {
        return false
    }
    val squareRoot = sqrt(n.toDouble()).toInt()
    for (i in 2..squareRoot) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun printPrimes1to100() {
    for (i in 1..100) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

fun main() {
    task1A()
    task1B()
    task1C()
    task1D()
    task1E()
    printPrimes1to100()
}