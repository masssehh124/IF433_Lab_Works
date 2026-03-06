package oop_00000069400_FarrelRamadaAlladines.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya project Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN  ERROR karena tipe referensinya adalah Pegawai
        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
            pegawai.mengajar()  // Smart cast! Tidak perlu manual casting (as)
            }
        is Admin -> {
            println("=> Terdeteksi sebagai Admin")
            pegawai.doAdminWork()
        }
        }
        println("--------------------------")
    }
    // ==================== TUGAS MANDIRI 1 ====================
    println("\n=== TUGAS MANDIRI 1: COMPILE-TIME POLYMORPHISM (OVERLOADING) ===")
    val mathHelper = MathHelper()
    println("Luas Persegi (sisi=5)       : ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (4x6) : ${mathHelper.hitungLuas(4, 6)}")
    println("Luas Lingkaran (r=7.0)     : ${mathHelper.hitungLuas(7.0)}")
    // Test MathHelper.kt

    // ==================== TUGAS MANDIRI 2 ====================
    println("\n=== TUGAS MANDIRI 2: SISTEM PEMBAYARAN (POLYMORPHISM + SMART CASTING) ===")
    val eWallet = EWallet("Farrel E-Wallet", 50000.0)
    val creditCard = CreditCard("Farrel Credit Card", 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in daftarPembayaran) {
        payment.processPayment(75000.0)

        // Smart Casting Challenge 2
        if (payment is EWallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)   // sekarang harus berhasil
        }
    }
}