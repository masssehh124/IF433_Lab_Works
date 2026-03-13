package oop_00000069400_FarrelRamadaAlladines.week06

class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnon() {
        super<Camera>.turnon() // Menjalankan logika Camera
        super<Phone>.turnon()  // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}