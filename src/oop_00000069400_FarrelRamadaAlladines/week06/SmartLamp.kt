package oop_00000069400_FarrelRamadaAlladines.week06

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnon() {
        println("Lampu '$name' dinyalakan. Cahaya putih hangat memenuhi ruangan.")
    }

    override fun turnoff() {
        println("Lampu '$name' dimatikan.")
    }
}