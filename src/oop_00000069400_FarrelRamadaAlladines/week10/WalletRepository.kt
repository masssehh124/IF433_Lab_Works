package oop_00000069400_FarrelRamadaAlladines.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    // Fungsi pencarian sederhana menggunakan filter
    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}