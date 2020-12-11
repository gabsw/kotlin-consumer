package demo.api.consumer.services

import org.springframework.stereotype.Service

@Service
class EventsService(val rabbitMqReceiver: RabbitMqReceiver)