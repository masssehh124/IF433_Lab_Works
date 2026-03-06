package oop_00000069400_FarrelRamadaAlladines.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran CreditCard ($accountName) Rp$amount BERHASIL. Limit terpakai: Rp$usedAmount / Rp$limit")
        } else {
            println("Transaksi CreditCard ($accountName) DITOLAK! Melebihi limit.")
        }
    }
}