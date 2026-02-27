package oop_00000069400_FarrelRamadaAlladines.week04

fun main() {
    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager(name = "Budi", baseSalary = 8000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Andi", baseSalary = 6000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}