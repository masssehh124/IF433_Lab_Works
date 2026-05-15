package oop_00000069400_FarrelRamadaAlladines.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    // Validasi input [cite: 137]
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    // Validasi hardware [cite: 141]
    if (isJammed) {
        throw DispenserJamException()
    }

    // Validasi stok makanan [cite: 145]
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1: MULTIPLE CATCH ===")
    // Eksekusi Jadwal 1 dengan porsi yang melebihi stok
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("Caught Hardware Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Supply Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== JADWAL MAKAN 2: RUNCATCHING IDIOM ===")
    // Simulasi alat normal dengan pengisian ulang stok
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000,
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}