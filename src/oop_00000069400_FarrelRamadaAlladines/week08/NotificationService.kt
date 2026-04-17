package oop_00000069400_FarrelRamadaAlladines.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // Ini akan error karena tipe data email adalah String? (bisa null)

        if (user.email != null) {
            // SUCCESS via Smart Cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}