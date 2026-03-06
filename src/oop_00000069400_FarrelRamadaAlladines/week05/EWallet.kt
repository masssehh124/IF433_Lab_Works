package oop_00000069400_FarrelRamadaAlladines.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran EWallet ($accountName) Rp$amount BERHASIL. Sisa saldo: Rp$balance")
        } else {
            println("Saldo EWallet ($accountName) TIDAK CUKUP untuk Rp$amount")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("TopUp EWallet ($accountName) Rp$amount berhasil. Saldo baru: Rp$balance")
    }
}