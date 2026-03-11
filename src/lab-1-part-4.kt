import kotlin.math.round

// Part A
class Calculator {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double? {
        if (b == 0.0) {
            return null
        }
        return a / b
    }
}

// Part B
class Calculator2 {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double? {
        if (b == 0.0) {
            return null
        }
        return safeRound(a / b)
    }

    private fun safeRound(x: Double): Double {
        return round(x * 100) / 100
    }
}

fun calculate(a: Double, b: Double, op: String): Double? {
    return when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b == 0.0) null else a / b
        else -> null
    }
}

fun Double.formatResult(): String {
    return "%.2f".format(this)
}

fun main() {
    val calc = Calculator()
    println(calc.add(5.0, 3.0))
    println(calc.subtract(5.0, 3.0))
    println(calc.multiply(5.0, 3.0))
    println(calc.divide(10.0, 2.0))
    println(calc.divide(10.0, 0.0))

    val calc2 = Calculator2()
    println(calc2.add(5.0, 3.0))
    println(calc2.subtract(5.0, 3.0))
    println(calc2.multiply(5.0, 3.0))
    println(calc2.divide(10.0, 3.0))
    println(calc2.divide(10.0, 0.0))

    println(calculate(5.0, 3.0, "+"))
    println(calculate(5.0, 3.0, "-"))
    println(calculate(5.0, 3.0, "*"))
    println(calculate(10.0, 2.0, "/"))
    println(calculate(10.0, 0.0, "/"))
    println(calculate(5.0, 3.0, "%"))

    val result = 10.0 / 3
    println(result.formatResult())
}