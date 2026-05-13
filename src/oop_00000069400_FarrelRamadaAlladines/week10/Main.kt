package oop_00000069400_FarrelRamadaAlladines.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== TEST CONSTRAINTS ===")
    // Menguji MathBox dengan tipe Double dan Int (keduanya adalah Number)
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")

    // Menguji getMax dengan tipe Int (Int mengimplementasikan Comparable)
    println("Terbesar: ${getMax(45, 90)}")
}