package demo.api.consumer.services

import com.fasterxml.jackson.databind.ObjectMapper
import demo.api.consumer.configurations.RabbitMqProperties
import com.rabbitmq.client.Channel
import demo.api.consumer.pojos.GameEvent

class RabbitMqReceiver (private val channel: Channel,
                        private val rabbitMqProperties: RabbitMqProperties,
                        private val objectMapper: ObjectMapper){
    fun send(message : GameEvent) {
        val sendMessage = objectMapper.writeValueAsString(message)
        channel.basicPublish("", rabbitMqProperties.queueName, null ,sendMessage.toByteArray())
        println("[x] Sent '$message'")
    }
}
