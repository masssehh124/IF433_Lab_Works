package oop_00000069400_FarrelRamadaAlladines.week10

fun <T> printData(data: T) {
    println("Data yang diterima: $data")
}

// Fungsi generik yang mengembalikan tipe data yang sama dengan parameternya
fun <T> processData(input: T): T {
    return input
}