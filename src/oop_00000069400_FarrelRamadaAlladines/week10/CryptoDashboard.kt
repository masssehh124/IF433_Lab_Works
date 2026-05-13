package oop_00000069400_FarrelRamadaAlladines.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    println("--- Coin List ---")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.05))
    txRepo.add(Transaction("TX002", 1.2))

    println("\n--- Transaction List ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }
}