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

import io.swagger.client.models.ApistorageProviderResp
import io.swagger.client.models.GithubComApplicationResearchEstuaryApiV2claimMsgResponse
import io.swagger.client.models.GithubComApplicationResearchEstuaryApiV2claimResponse
import io.swagger.client.models.MinerClaimMinerBody
import io.swagger.client.models.MinerMinerSetInfoParams
import io.swagger.client.models.MinerSuspendMinerBody
import io.swagger.client.models.UtilHttpError

import estuary-client.infrastructure.*

class SpApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * Claim Storage Provider
     * This endpoint lets a user claim a storage provider
     * @param body Claim Storage Provider Body 
     * @return GithubComApplicationResearchEstuaryApiV2claimResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersClaimPost(body: MinerClaimMinerBody): GithubComApplicationResearchEstuaryApiV2claimResponse {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/storage-providers/claim"
        )
        val response = request<GithubComApplicationResearchEstuaryApiV2claimResponse>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GithubComApplicationResearchEstuaryApiV2claimResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get Claim Storage Provider
     * This endpoint lets a user get the message in order to claim a storage provider
     * @param sp Storage Provider claim message 
     * @return GithubComApplicationResearchEstuaryApiV2claimMsgResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersClaimSpGet(sp: kotlin.String): GithubComApplicationResearchEstuaryApiV2claimMsgResponse {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/storage-providers/claim/{sp}".replace("{" + "sp" + "}", "$sp")
        )
        val response = request<GithubComApplicationResearchEstuaryApiV2claimMsgResponse>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as GithubComApplicationResearchEstuaryApiV2claimMsgResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get all storage providers deals
     * This endpoint returns all storage providers deals
     * @param sp Filter by storage provider 
     * @param ignoreFailed Ignore Failed (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersDealsSpGet(sp: kotlin.String, ignoreFailed: kotlin.String? = null): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("ignore-failed" to listOf("$ignoreFailed"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/storage-providers/deals/{sp}".replace("{" + "sp" + "}", "$sp"), query = localVariableQuery
        )
        val response = request<kotlin.String>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get all storage providers
     * This endpoint returns all storage providers
     * @param sp Filter by storage provider 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersFailuresSpGet(sp: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/storage-providers/failures/{sp}".replace("{" + "sp" + "}", "$sp")
        )
        val response = request<kotlin.String>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get all storage providers
     * This endpoint returns all storage providers
     * @return kotlin.Array<ApistorageProviderResp>
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersGet(): kotlin.Array<ApistorageProviderResp> {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/storage-providers"
        )
        val response = request<kotlin.Array<ApistorageProviderResp>>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.Array<ApistorageProviderResp>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Set Storage Provider Info
     * This endpoint lets a user set storage provider info.
     * @param body Storage Provider set info params 
     * @param sp Storage Provider to set info for 
     * @return void
     */
    fun storageProvidersSetInfoSpPut(body: MinerMinerSetInfoParams, sp: kotlin.String): Unit {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/storage-providers/set-info/{sp}".replace("{" + "sp" + "}", "$sp")
        )
        val response = request<Any?>(
                localVariableConfig, localVariableBody
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
     * Get storage provider stats
     * This endpoint returns storage provider stats
     * @param sp Filter by storage provider 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersStatsSpGet(sp: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/storage-providers/stats/{sp}".replace("{" + "sp" + "}", "$sp")
        )
        val response = request<kotlin.String>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.String
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Suspend Storage Provider
     * This endpoint lets a user suspend a storage provider.
     * @param body Suspend Storage Provider Body 
     * @param sp Storage Provider to suspend 
     * @return kotlin.collections.Map<kotlin.String, kotlin.String>
     */
    @Suppress("UNCHECKED_CAST")
    fun storageProvidersSuspendSpPost(body: MinerSuspendMinerBody, sp: kotlin.String): kotlin.collections.Map<kotlin.String, kotlin.String> {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/storage-providers/suspend/{sp}".replace("{" + "sp" + "}", "$sp")
        )
        val response = request<kotlin.collections.Map<kotlin.String, kotlin.String>>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as kotlin.collections.Map<kotlin.String, kotlin.String>
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Unuspend Storage Provider
     * This endpoint lets a user unsuspend a Storage Provider.
     * @param sp Storage Provider to unsuspend 
     * @return void
     */
    fun storageProvidersUnsuspendSpPut(sp: kotlin.String): Unit {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.PUT,
                "/storage-providers/unsuspend/{sp}".replace("{" + "sp" + "}", "$sp")
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
}
