package oop_00000069400_FarrelRamadaAlladines.week13

import java.io.File
import java.io.FileNotFoundException

// Model Data untuk merekam riwayat posisi transaksi kripto
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)