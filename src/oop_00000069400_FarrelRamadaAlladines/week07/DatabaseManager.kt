package oop_00000069400_FarrelRamadaAlladines.week07

class DatabaseManager {
    object DatabaseManager {
        var connectionStatus: String = "Disconnected"

        fun connect() {
            connectionStatus = "Connected to Server"
            println("Database is ready.")
        }
    }
}