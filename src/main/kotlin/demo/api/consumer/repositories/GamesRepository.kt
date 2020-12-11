package demo.api.consumer.repositories

import demo.api.consumer.entities.GameEvent
import org.springframework.stereotype.Repository

@Repository
interface GamesRepository : CrudRepository<GameEvent, Long>