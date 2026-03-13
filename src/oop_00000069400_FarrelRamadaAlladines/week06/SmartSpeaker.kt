package oop_00000069400_FarrelRamadaAlladines.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnon() {
        println("Speaker '$name' menyala. Siap menerima perintah suara.")
    }

    override fun turnoff() {
        println("Speaker '$name' dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}