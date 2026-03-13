package oop_00000069400_FarrelRamadaAlladines.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnon() {
        println("CCTV '$name' aktif.")
        startRecord()
    }

    override fun turnoff() {
        println("CCTV '$name' nonaktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '$name' mulai merekam video...")
    }
}