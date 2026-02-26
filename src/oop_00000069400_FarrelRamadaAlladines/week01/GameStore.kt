package oop_00000069400_FarrelRamadaAlladines.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    // Pemanggilan wajib menggunakan Named Arguments
    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int) {
    println("--- Struk SteamKW ---")
    println("Game: $title")
    println("Harga Asli: Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
}