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

import io.swagger.client.models.UtilHttpError
import io.swagger.client.models.UtilViewerResponse

import estuary-client.infrastructure.*

class DefaultApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * Fetch viewer details
     * This endpoint fetches viewer details such as username, permissions, address, owned miners, user settings etc.
     * @return UtilViewerResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun viewerGet(): UtilViewerResponse {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/viewer"
        )
        val response = request<UtilViewerResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UtilViewerResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
