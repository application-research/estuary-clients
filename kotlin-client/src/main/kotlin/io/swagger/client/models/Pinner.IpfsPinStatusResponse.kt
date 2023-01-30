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

import io.swagger.client.models.PinnerIpfsPin
import io.swagger.client.models.StatusPinningStatus
import io.swagger.client.models.UtilContent

/**
 * 
 * @param content 
 * @param created 
 * @param delegates 
 * @param info 
 * @param pin 
 * @param requestid 
 * @param status 
 */
data class PinnerIpfsPinStatusResponse (

    val content: UtilContent? = null,
    val created: kotlin.String? = null,
    val delegates: kotlin.Array<kotlin.String>? = null,
    val info: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,
    val pin: PinnerIpfsPin? = null,
    val requestid: kotlin.String? = null,
    val status: StatusPinningStatus? = null
) {
}