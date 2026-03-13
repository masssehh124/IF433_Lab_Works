package oop_00000069400_FarrelRamadaAlladines.week06

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnon()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // --- TESTING TUGAS MANDIRI: SMART HOME ---
    println("\n=== TESTING SMART HOME SYSTEM ===")

    // 1. Instansiasi perangkat
    val lampuTamu = SmartLamp("L01", "Ruang Tamu")
    val nestDapur = SmartSpeaker("S01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C01", "Ezviz Garasi")

}