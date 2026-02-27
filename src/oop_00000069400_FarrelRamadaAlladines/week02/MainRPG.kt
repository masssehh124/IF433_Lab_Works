package oop_00000069400_FarrelRamadaAlladines.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Stat Damage: ")
    val damage = scanner.nextInt()

    val myHero = Hero(name, damage)

    var enemyHp = 100

    println("--- BATTLE START: ${myHero.name} VS Slime ---")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- Status ---")
        println("Hero HP: ${myHero.hp} | Enemy HP: $enemyHp")
        println("Menu: 1. Serang, 2. Kabur")
        print("Pilihan: ")

        when (scanner.nextInt()) {
            1 -> {
                myHero.attack("Slime")
                enemyHp -= myHero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("Sisa HP Musuh: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Slime menyerang balik dengan $enemyDamage damage!")
                    myHero.takeDamage(enemyDamage)
                    println("Sisa HP Hero: ${myHero.hp}")
                }
            }
            2 -> {
                println("Anda memilih kabur dari pertarungan!")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    println("\n--- BATTLE END ---")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} memenangkan pertarungan!")
    } else if (!myHero.isAlive()) {
        println("GAME OVER! ${myHero.name} telah gugur.")
    } else {
        println("Pertarungan berakhir tanpa pemenang (Kabur).")
    }
}