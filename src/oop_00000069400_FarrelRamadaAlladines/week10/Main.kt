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
    // Menguji fungsi printData dengan tipe Double
    printData(3.14)

    // Menguji fungsi processData dengan tipe String
    val result = processData("Stable Coin")
    println("Hasil proses: $result")
}