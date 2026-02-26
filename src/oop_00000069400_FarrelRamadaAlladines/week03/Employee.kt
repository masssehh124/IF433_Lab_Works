package oop_00000069400_FarrelRamadaAlladines.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // ERROR: Rekursif (memanggil dirinya sendiri)
            this.salary = value
        }
}