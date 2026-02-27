package oop_00000069400_FarrelRamadaAlladines.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()    // Memanggil method milik sendiri (Car)
    myCar.honk()         // Memanggil method yang sudah di-override
    myCar.accelerate()   // Memanggil gabungan method Parent dan Child
}