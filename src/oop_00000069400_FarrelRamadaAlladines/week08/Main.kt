package oop_00000069400_FarrelRamadaAlladines.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")

    val emptyOrder = Order(null, null)

    // Rantai Safe Calls yang elegan. Jika salah satu null, akan return "Kota Tidak Diketahui"
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"

    println("Tujuan pengiriman: $destination")
}