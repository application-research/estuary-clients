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
 * @param &#x60;data&#x60; File to upload
 * @param filename Filenam to use for upload
 */
data class ContentAddBody (

    /* File to upload */
    val `data`: kotlin.Array<kotlin.Byte>,
    /* Filenam to use for upload */
    val filename: kotlin.String? = null
) {
}