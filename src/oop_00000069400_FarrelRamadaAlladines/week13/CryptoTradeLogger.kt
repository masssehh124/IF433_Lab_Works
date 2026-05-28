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

// Serialization (Extension Function) mengubah objek menjadi format string dipisahkan koma
fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

// Deserialization Parsing dengan proteksi try-catch untuk menangani data korup
fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        when (e) {
            is NumberFormatException, is IndexOutOfBoundsException -> {
                println("(Log) Data korup diabaikan: $line")
                null
            }
            else -> throw e
        }
    }
}

// Write System untuk menyimpan seluruh data trade menggunakan printWriter dan use block
fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}