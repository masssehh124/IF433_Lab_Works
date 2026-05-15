package oop_00000069400_FarrelRamadaAlladines.week12

sealed class FeederException(msg: String): Exception(msg)

// Exception untuk stok makanan tidak cukup
class FoodEmptyException(requested: Int, available: Int):
    FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

// Exception untuk dispenser yang macet
class DispenserJamException: FeederException("Wadah dispenser tersangkut/macet!")