package oop_00000069400_FarrelRamadaAlladines.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")

    // Instansiasi Box dengan tipe Int
    val intBox = Box(100)

    // Instansiasi Box dengan tipe String
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")
}