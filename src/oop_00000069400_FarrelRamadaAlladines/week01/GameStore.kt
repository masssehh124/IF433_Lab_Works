package oop_00000069400_FarrelRamadaAlladines.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

// Fungsi menghitung diskon dengan Expression Body
fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()