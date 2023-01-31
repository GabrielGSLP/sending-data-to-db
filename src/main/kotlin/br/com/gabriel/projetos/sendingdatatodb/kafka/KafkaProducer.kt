package br.com.gabriel.projetos.sendingdatatodb.kafka

import br.com.gabriel.projetos.sendingdatatodb.entities.Message
import br.com.gabriel.projetos.sendingdatatodb.entities.OrderBi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaProducer(var kafkaTemplate: KafkaTemplate<String, Message>, var kafkaTemplateOrderBi: KafkaTemplate<String, OrderBi>) {


    fun sendMessage(topic: String, message: Message) {
        kafkaTemplate.send(topic, message)
    }
    fun sendAvro(topic: String, orderBi: OrderBi) {
        kafkaTemplateOrderBi.send(topic, orderBi)
    }
}