package br.com.gabriel.projetos.sendingdatatodb.kafka

import br.com.gabriel.projetos.sendingdatatodb.entities.Message
import br.com.gabriel.projetos.sendingdatatodb.entities.OrderBi
import br.com.gabriel.projetos.sendingdatatodb.repositories.MessageRepository
import br.com.gabriel.projetos.sendingdatatodb.repositories.OrderBiRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class KafkaConsumer {
    @Autowired
    lateinit var messageRepository : MessageRepository
    @Autowired
    lateinit var orderBiRepository : OrderBiRepository

    @KafkaListener(topics = ["topic1"])
    fun consumeMessages(message: Message){
        messageRepository.save(message)
    }
    @KafkaListener(topics = ["avrosTopic"])
    fun consumeAvroMessages(orderBi: OrderBi){
        orderBiRepository.save(orderBi)
    }
}