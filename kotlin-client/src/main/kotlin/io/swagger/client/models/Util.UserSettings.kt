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


/**
 * 
 * @param contentAddingDisabled 
 * @param dealDuration 
 * @param dealMakingDisabled 
 * @param fileStagingThreshold 
 * @param flags 
 * @param replication 
 * @param uploadEndpoints 
 * @param verified 
 */
data class UtilUserSettings (

    val contentAddingDisabled: kotlin.Boolean? = null,
    val dealDuration: kotlin.Int? = null,
    val dealMakingDisabled: kotlin.Boolean? = null,
    val fileStagingThreshold: kotlin.Int? = null,
    val flags: kotlin.Int? = null,
    val replication: kotlin.Int? = null,
    val uploadEndpoints: kotlin.Array<kotlin.String>? = null,
    val verified: kotlin.Boolean? = null
) {
}