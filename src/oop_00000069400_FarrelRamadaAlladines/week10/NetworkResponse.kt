package oop_00000069400_FarrelRamadaAlladines.week10

// Data class ApiResponse menggunakan parameter generik <T> untuk membungkus data apa pun
data class ApiResponse<T>(val status: String, val data: T)