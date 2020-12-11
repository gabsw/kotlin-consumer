package demo.api.consumer.pojos

import java.time.LocalDateTime

data class Game(val homeTeamName: String,
                val awayTeamName: String,
                val homeTeamPoints: Int,
                val awayTeamPoints: Int,
                val dateTime: LocalDateTime)