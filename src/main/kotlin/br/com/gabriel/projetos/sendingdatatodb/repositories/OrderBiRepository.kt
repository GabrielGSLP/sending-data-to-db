package br.com.gabriel.projetos.sendingdatatodb.repositories

import br.com.gabriel.projetos.sendingdatatodb.entities.OrderBi
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderBiRepository : JpaRepository<OrderBi, Long> {
}