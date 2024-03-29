/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models

import io.swagger.client.models.AddressAddress
import io.swagger.client.models.MinerMinerChainInfo

/**
 * 
 * @param addr 
 * @param chainInfo 
 * @param name 
 * @param suspended 
 * @param suspendedReason 
 * @param version 
 */
data class ApiminerResp (

    val addr: AddressAddress? = null,
    val chainInfo: MinerMinerChainInfo? = null,
    val name: kotlin.String? = null,
    val suspended: kotlin.Boolean? = null,
    val suspendedReason: kotlin.String? = null,
    val version: kotlin.String? = null
) {
}