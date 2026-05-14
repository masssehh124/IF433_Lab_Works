package oop_00000069400_FarrelRamadaAlladines.week11

// Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

// Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

// Extension function pada tipe nullable (String?)
fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty()
}