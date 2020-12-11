package demo.api.consumer.services

import demo.api.consumer.entities.GameEvent
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class GamesService(val gamesRepository: ) {

    fun getEventsByTeams(homeTeamName: String, awayTeamName: String): List<GameEvent> {

    }

    fun getEventsByCreationDate(createdAt: LocalDate): List<GameEvent>  {

    }
}