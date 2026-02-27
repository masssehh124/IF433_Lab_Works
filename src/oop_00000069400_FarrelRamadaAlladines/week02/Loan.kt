package oop_00000069400_FarrelRamadaAlladines.week02

class Loan (
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    /**
     * Menghitung denda berdasarkan durasi pinjam.
     * Jika > 3 hari, denda = (durasi - 3) * 2000.
     * Jika <= 3 hari, denda = 0.
     */
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    fun displayLoanDetails() {
        println("\n--- Detail Peminjaman ---")
        println("Judul Buku    : $bookTitle")
        println("Peminjam      : $borrower")
        println("Durasi Pinjam : $loanDuration hari")
        println("Total Denda   : Rp ${calculateFine()}")
    }
}