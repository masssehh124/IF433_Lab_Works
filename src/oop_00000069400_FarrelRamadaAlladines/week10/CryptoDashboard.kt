package oop_00000069400_FarrelRamadaAlladines.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    // Menambahkan data koin ke dalam repository
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))
}