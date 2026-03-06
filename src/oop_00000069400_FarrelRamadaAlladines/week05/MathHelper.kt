package oop_00000069400_FarrelRamadaAlladines.week05

class MathHelper {
    // Overload 1: Persegi
    fun hitungLuas(sisi: Int): Int = sisi * sisi

    // Overload 2: Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int = panjang * lebar

    // Overload 3: Lingkaran
    fun hitungLuas(jariJari: Double): Double = 3.14 * jariJari * jariJari
}