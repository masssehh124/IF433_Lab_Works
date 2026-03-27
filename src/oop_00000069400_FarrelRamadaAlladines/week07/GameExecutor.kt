package oop_00000069400_FarrelRamadaAlladines.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Hati-hati! Kamu bertemu dengan ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            // Menggunakan destructuring atau smart cast untuk mengambil data item
            val (name, damage, rarity) = event.item
            println("Selamat! Kamu mendapatkan loot: $name [$rarity] dengan Damage: $damage")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Tidak ada monster di sekitar.")
        }
    }
}