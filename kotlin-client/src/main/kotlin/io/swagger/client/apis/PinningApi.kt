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
package io.swagger.client.apis

import io.swagger.client.models.TypesIpfsListPinStatusResponse
import io.swagger.client.models.TypesIpfsPin
import io.swagger.client.models.TypesIpfsPinStatusResponse
import io.swagger.client.models.UtilHttpError

import estuary-client.infrastructure.*

class PinningApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * List all pin status objects
     * This endpoint lists all pin status objects
     * @return TypesIpfsListPinStatusResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun pinningPinsGet(): TypesIpfsListPinStatusResponse {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/pinning/pins"
        )
        val response = request<TypesIpfsListPinStatusResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TypesIpfsListPinStatusResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Delete a pinned object
     * This endpoint deletes a pinned object.
     * @param pinid Pin ID 
     * @return void
     */
    fun pinningPinsPinidDelete(pinid: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.DELETE,
                "/pinning/pins/{pinid}".replace("{" + "pinid" + "}", "$pinid")
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get a pin status object
     * This endpoint returns a pin status object.
     * @param pinid cid 
     * @return TypesIpfsPinStatusResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun pinningPinsPinidGet(pinid: kotlin.String): TypesIpfsPinStatusResponse {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/pinning/pins/{pinid}".replace("{" + "pinid" + "}", "$pinid")
        )
        val response = request<TypesIpfsPinStatusResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TypesIpfsPinStatusResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Replace a pinned object
     * This endpoint replaces a pinned object.
     * @param body New pin 
     * @param pinid Pin ID to be replaced 
     * @return TypesIpfsPinStatusResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun pinningPinsPinidPost(body: TypesIpfsPin, pinid: kotlin.String): TypesIpfsPinStatusResponse {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/pinning/pins/{pinid}".replace("{" + "pinid" + "}", "$pinid")
        )
        val response = request<TypesIpfsPinStatusResponse>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TypesIpfsPinStatusResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Add and pin object
     * This endpoint adds a pin to the IPFS daemon.
     * @param body Pin Body {cid:cid, name:name} 
     * @param ignoreDupes Ignore Dupes (optional)
     * @param overwrite Overwrite conflicting files in collections (optional)
     * @return TypesIpfsPinStatusResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun pinningPinsPost(body: TypesIpfsPin, ignoreDupes: kotlin.String? = null, overwrite: kotlin.String? = null): TypesIpfsPinStatusResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf("ignore-dupes" to listOf("$ignoreDupes"), "overwrite" to listOf("$overwrite"))
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/pinning/pins", query = localVariableQuery
        )
        val response = request<TypesIpfsPinStatusResponse>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as TypesIpfsPinStatusResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
