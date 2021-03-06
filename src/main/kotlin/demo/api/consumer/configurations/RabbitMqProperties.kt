package demo.api.consumer.configurations

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "rabbitmq")
class RabbitMqProperties {
    var queueName : String = "games"
    var username : String = "test"
    var password : String = "test"
    var host : String = "localhost"
    var port : Int = 5672
}