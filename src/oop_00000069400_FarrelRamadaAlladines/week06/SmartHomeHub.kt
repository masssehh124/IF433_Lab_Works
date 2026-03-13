package oop_00000069400_FarrelRamadaAlladines.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\n--- Menjalankan Protokol Hemat Energi ---")
        for (device in devices) {
            // Smart Casting untuk mendeteksi interface Switchable
            if (device is Switchable) {
                device.turnoff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (device in devices) {
            // Deteksi perangkat yang bisa merekam
            if (device is Recordable) {
                device.startRecord()
            }

            // Deteksi SmartSpeaker untuk membunyikan sirine
            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}