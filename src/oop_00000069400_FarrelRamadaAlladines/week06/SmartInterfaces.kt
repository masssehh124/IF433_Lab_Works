package oop_00000069400_FarrelRamadaAlladines.week06

// Kontrak Identitas Dasar
interface SmartDevice {
    val id: String
    val name: String
}

// Kontrak Kemampuan On/Off
interface Switchable {
    fun turnon()
    fun turnoff()
}

// Kontrak Kemampuan Rekaman dengan Default Method
interface Recordable {
    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}