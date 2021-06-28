fun main() {
    val player = Player("Madrigal")
    player.castFireball(5)

    //光環
    //player.auraColor() 用不到

    //玩家狀態
    printPlayerStatus(player)
}

private fun printPlayerStatus(player: Player) {
    val statusFormatString = "(血量:${player.healthPoints}) (光環顏色:${player.auraColor()}) " +
            "(運氣:${if (player.isBlessed) "好" else "壞"}) -> ${player.name} ${player.formatHealthStatus()}"
    println(statusFormatString)
}

/*private fun drink(glass: Int) {
    val drunkenness = when (glass) {
        0 -> "清醒"
        in 1..10 -> "微醺"
        in 11..20 -> "微醉"
        in 21..30 -> "醉了"
        in 31..40 -> "大醉"
        in 41..50 -> "爛醉如泥"
        else -> "沒意識"
    }
    println("酒醉狀態: $drunkenness")
}*/