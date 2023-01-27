package br.com.gabriel.projetos.sendingdatatodb.controllers

import br.com.gabriel.projetos.sendingdatatodb.entities.OrderBi
import br.com.gabriel.projetos.sendingdatatodb.kafka.KafkaProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orderbiavros")
class OrderBiController(private val kafkaProducer: KafkaProducer) {
    @PostMapping
    fun sendAvros(@RequestBody orderBi: OrderBi){
        kafkaProducer.sendAvro("avrosTopic", orderBi)
    }
}