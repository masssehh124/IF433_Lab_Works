package oop_00000069400_FarrelRamadaAlladines.week13

import java.io.File

fun main() {
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("unsafe_logs.txt")

    // Membuka stream secara manual
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    // BAHAYA: Jika terjadi Exception di atas baris ini,
    // writer.close() di bawah tidak akan pernah tereksekusi dan file terkunci.
    writer.close()
    println("Proses penulisan unsafe selesai.")
}