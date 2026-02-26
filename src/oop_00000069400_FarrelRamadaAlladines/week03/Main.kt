package oop_00000069400_FarrelRamadaAlladines.week03

fun main() {
    val p1 = Player("ProGamer99")

    println("\n--- Test Player ---")

    p1.addXp(50)
    println("XP ditambah 50. Level saat ini: ${p1.level}")

    p1.addXp(60)
}