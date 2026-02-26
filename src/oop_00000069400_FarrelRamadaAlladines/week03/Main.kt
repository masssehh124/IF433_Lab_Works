package oop_00000069400_FarrelRamadaAlladines.week03

fun main() {
    val w1 = Weapon("Excalibur")

    println("--- Test Weapon ---")
    w1.damage = -50

    w1.damage = 9999
    println("Damage sekarang: ${w1.damage}")

    println("Tier Senjata: ${w1.tier}")
}