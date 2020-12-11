package demo.api.consumer.controllers

import demo.api.consumer.entities.GameEvent
import demo.api.consumer.services.GamesService
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController
@RequestMapping("api/events")
class GameController(val eventsService : GamesService) {

    @GetMapping("/")
    fun getEventsByTeams(@RequestParam(name = "home_team_name", required = false) homeTeamName : String,
                         @RequestParam(name = "away_team_name", required = false) awayTeamName : String)
            : ResponseEntity<List<GameEvent>> =
            ResponseEntity.ok(eventsService.getEventsByTeams(homeTeamName, awayTeamName))

    @GetMapping("/")
    fun getEventsByTeams( @RequestParam(name = "created_at", required = false)
                          @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                          createdAt : LocalDate)
            : ResponseEntity<List<GameEvent>> =
            ResponseEntity.ok(eventsService.getEventsByCreationDate(createdAt))
}