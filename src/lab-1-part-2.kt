// Part A
class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 18)
}

fun task2A() {
    val p1 = Person("Amina", 22)
    val p2 = Person("Kenan")
    println("${p1.name} is ${p1.age} years old.")
    println("${p2.name} is ${p2.age} years old.")
}

// Part B
class PersonWithGetter(val name: String, val age: Int) {
    val isAdult: Boolean
        get() = age >= 18
}

fun task2B() {
    val p1 = PersonWithGetter("John", 17)
    val p2 = PersonWithGetter("James", 19)
    println(p1.isAdult)
    println(p2.isAdult)
}

// Part C
class BankAccount(initialBalance: Double) {
    var balance: Double = initialBalance
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Warning. Value less than 0.")
            }
        }
}

fun task2C() {
    val b1 = BankAccount(100.0)
    println("Start balance: ${b1.balance}")
    b1.balance = 200.0
    println("Updated balance: ${b1.balance}")
    b1.balance = -50.0
    println("After invalid set: ${b1.balance}")
}

// Part D
class SecureBankAccount(initialBalance: Double) {
    private var balance: Double = initialBalance
    fun deposit(amount: Double) {
        if (amount <= 0) {
            println("Amount must be greater than 0.")
            return
        }
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= 0) {
            println("Amount must be greater than 0.")
            return
        }

        if (amount > balance) {
            println("Not enough balance.")
            return
        }
        balance -= amount
    }

    fun getBalance(): Double {
        return balance
    }
}

fun task2D() {
    val acc = SecureBankAccount(100.0)
    //println(s1.balance)
    acc.deposit(50.0)
    acc.withdraw(30.0)
    println(acc.getBalance())
}

// Part E
open class Vehicle(val brand: String) {
    open fun description(): String = "Vehicle brand: $brand"
}

class Car(brand: String, val model: String) : Vehicle(brand) {
    override fun description(): String = "Car: $brand $model"
}

fun task2E() {
    val vehicle = Vehicle("Generic")
    val car = Car("Renault", "Modus")
    println(vehicle.description())
    println(car.description())
}

fun main() {
    task2A()
    task2B()
    task2C()
    task2D()
    task2E()
}