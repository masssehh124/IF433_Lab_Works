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

// Load System dengan penanganan FileNotFoundException dan mengabaikan baris bernilai null
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File histori transaksi tidak ditemukan!")
        emptyList()
    }
}

// Dashboard Setup & Mock Data
fun main() {
    // Definisikan riwayat trade simulasi
    val trades = listOf(
        TradeRecord(id = 1, symbol = "BTCUSDT", type = "Long", margin = 150.0, pnl = 45.5),
        TradeRecord(id = 2, symbol = "ETHUSDT", type = "Short", margin = 100.0, pnl = -20.0),
        TradeRecord(id = 3, symbol = "SOLUSDT", type = "Long", margin = 50.0, pnl = 12.3)
    )

    // Panggil saveTrades ke tujuan file
    saveTrades(trades, path = "crypto_trades.csv")

    // Injecting Malformed Data untuk menguji keandalan sistem penanganan error
    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")

    // Aggregation & Calculation - Tarik histori transaksi
    val loadedData = loadTrades("crypto_trades.csv")

    // Hitung jumlah PnL bersih menggunakan higher-order function sumOf
    val totalPnl = loadedData.sumOf { it.pnl }
}