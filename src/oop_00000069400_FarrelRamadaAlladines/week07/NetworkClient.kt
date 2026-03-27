package oop_00000069400_FarrelRamadaAlladines.week07

class NetworkClient {
    class NetworkClient private constructor (val url: String) {
        fun connect() {
            println("Connecting to $url...")
        }
    }
}