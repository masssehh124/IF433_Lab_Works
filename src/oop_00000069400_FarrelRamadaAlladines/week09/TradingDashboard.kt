package oop_00000069400_FarrelRamadaAlladines.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 25, 30.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 5.0, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 10, -2.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}