package demo.api.consumer.entities

import java.time.LocalDateTime

data class GameEvent(val id: Long,
                     val homeTeamName: String,
                     val awayTeamName: String,
                     val homeTeamPoints: Int,
                     val awayTeamPoints: Int,
                     val dateTime: LocalDateTime,
                     val createdAt: LocalDateTime)