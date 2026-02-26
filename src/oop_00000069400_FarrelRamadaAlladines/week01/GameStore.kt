package oop_00000069400_FarrelRamadaAlladines.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val userNote: String? = null // Simulasi data null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("--- Struk SteamKW ---")
    println("Game: $title")
    println("Harga Asli: Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
    // Elvis Operator: Jika null munculkan pesan default
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}