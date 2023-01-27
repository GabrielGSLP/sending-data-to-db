package br.com.gabriel.projetos.sendingdatatodb.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class OrderBi
(
                   @Id
                   val orderId: Long,
                   val referenceId: String,
                   val costumerName: String,
                   val costumerEmail: String,
                   val costumerTaxId: String,
                   val shippingAddressCity: String,
                   val shippingAddressComplement: String,
                   val shippingAddressCountry: String,
                   val shippingAddressLocality: String,
                   val shippingAddressNumber: String,
                   val shippingAddressPostalCode: String,
                   val shippingAddressRegion: String,
                   val shippingAddressRegionCode: String,
                   val shippingAddressStreet: String,
                   val shippingProviderCarrier: String,
                   val shippingProviderService: String,
                   val amountCurrency: String,
                   val amountAdditional: String,
                   val amountDiscount: String,
                   val desFlow: String,
                   val codConnectId: String,
                   val merchantCostumerId: String,
                   val datUpdate: String,
                   val datCreate: String,
        )