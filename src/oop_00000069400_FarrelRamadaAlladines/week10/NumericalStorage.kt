package oop_00000069400_FarrelRamadaAlladines.week10

// Class MathBox hanya menerima tipe data yang merupakan turunan dari Number
class MathBox<T: Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}