package oop_00000069400_FarrelRamadaAlladines.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}