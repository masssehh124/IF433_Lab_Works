package oop_00000069400_FarrelRamadaAlladines.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PERPUSTAKAAN UMN ===")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        println("LOG: Input durasi negatif. Otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    val currentLoan = Loan(title, borrower, duration)

    currentLoan.displayLoanDetails()
}