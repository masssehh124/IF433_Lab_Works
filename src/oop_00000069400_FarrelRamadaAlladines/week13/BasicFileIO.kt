package oop_00000069400_FarrelRamadaAlladines.week13

import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")

    // Menulis string baru ke file (akan menimpa jika file sudah ada)
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis.")
}