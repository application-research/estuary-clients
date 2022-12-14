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

import io.swagger.client.models.MainimportDealBody
import io.swagger.client.models.TypesIpfsPin
import io.swagger.client.models.UtilContentCreateBody
import io.swagger.client.models.UtilHttpError

import estuary-client.infrastructure.*

class ContentApi(basePath: kotlin.String = "//api.estuary.tech/") : ApiClient(basePath) {

    /**
     * Create an Estuary invite
     * This endpoint is used to create an estuary invite.
     * @param code Invite code to be created 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun adminInvitesCodePost(code: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/admin/invites/{code}".replace("{" + "code" + "}", "$code")
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
     * Get Estuary invites
     * This endpoint is used to list all estuary invites.
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun adminInvitesGet(): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/admin/invites"
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
     * Upload content via a car file
     * This endpoint uploads content via a car file
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAddCarPost(): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/add-car"
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
     * Add IPFS object
     * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
     * @param body IPFS Body 
     * @param ignoreDupes Ignore Dupes (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAddIpfsPost(body: TypesIpfsPin, ignoreDupes: kotlin.String? = null): kotlin.String {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf("ignore-dupes" to listOf("$ignoreDupes"))
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/add-ipfs", query = localVariableQuery
        )
        val response = request<kotlin.String>(
                localVariableConfig, localVariableBody
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
     * Upload a file
     * This endpoint uploads a file.
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAddPost(): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/add"
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
     * Get aggregated content stats
     * This endpoint returns aggregated content stats
     * @param content Content ID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAggregatedContentGet(content: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/aggregated/{content}".replace("{" + "content" + "}", "$content")
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
     * Get all deals for a user
     * This endpoint is used to get all deals for a user
     * @param begin Begin 
     * @param duration Duration 
     * @param all All 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAllDealsGet(begin: kotlin.String, duration: kotlin.String, all: kotlin.String): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("begin" to listOf("$begin"), "duration" to listOf("$duration"), "all" to listOf("$all"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/all-deals", query = localVariableQuery
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
     * Get content bandwidth
     * This endpoint returns content bandwidth
     * @param content Content ID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentBwUsageContentGet(content: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/bw-usage/{content}".replace("{" + "content" + "}", "$content")
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
     * Get user contents
     * This endpoint is used to get user contents
     * @param limit limit 
     * @param offset offset 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentContentsGet(limit: kotlin.String, offset: kotlin.String): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("limit" to listOf("$limit"), "offset" to listOf("$offset"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/contents", query = localVariableQuery
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
     * Add a new content
     * This endpoint adds a new content
     * @param body Content 
     * @param ignoreDupes Ignore Dupes (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentCreatePost(body: UtilContentCreateBody, ignoreDupes: kotlin.String? = null): kotlin.String {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf("ignore-dupes" to listOf("$ignoreDupes"))
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/create", query = localVariableQuery
        )
        val response = request<kotlin.String>(
                localVariableConfig, localVariableBody
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
     * Content with deals
     * This endpoint lists all content with deals
     * @param limit Limit (optional)
     * @param offset Offset (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentDealsGet(limit: kotlin.Int? = null, offset: kotlin.Int? = null): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("limit" to listOf("$limit"), "offset" to listOf("$offset"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/deals", query = localVariableQuery
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
     * Ensure Replication
     * This endpoint ensures that the content is replicated to the specified number of providers
     * @param datacid Data CID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentEnsureReplicationDatacidGet(datacid: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/ensure-replication/{datacid}".replace("{" + "datacid" + "}", "$datacid")
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
     * List all failures for a content
     * This endpoint returns all failures for a content
     * @param content Content ID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentFailuresContentGet(content: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/failures/{content}".replace("{" + "content" + "}", "$content")
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
     * Content
     * This endpoint returns a content by its ID
     * @param id Content ID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentIdGet(id: kotlin.Int): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/{id}".replace("{" + "id" + "}", "$id")
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
     * Import a deal
     * This endpoint imports a deal into the shuttle.
     * @param body Import a deal 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentImportdealPost(body: MainimportDealBody): kotlin.String {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/importdeal"
        )
        val response = request<kotlin.String>(
                localVariableConfig, localVariableBody
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
     * List all pinned content
     * This endpoint lists all content
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentListGet(): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/list"
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
     * Read content
     * This endpoint reads content from the blockstore
     * @param cont CID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentReadContGet(cont: kotlin.String): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/read/{cont}".replace("{" + "cont" + "}", "$cont")
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
     * Get staging zone for user, excluding its contents
     * This endpoint is used to get staging zone for user, excluding its contents.
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentStagingZonesGet(): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/staging-zones"
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
     * Get contents for a staging zone
     * This endpoint is used to get the contents for a staging zone
     * @param stagingZone Staging Zone Content ID 
     * @param limit limit 
     * @param offset offset 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentStagingZonesStagingZoneContentsGet(stagingZone: kotlin.Int, limit: kotlin.String, offset: kotlin.String): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("limit" to listOf("$limit"), "offset" to listOf("$offset"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/staging-zones/{staging_zone}/contents".replace("{" + "staging_zone" + "}", "$stagingZone"), query = localVariableQuery
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
     * Get staging zone without its contents field populated
     * This endpoint is used to get a staging zone, excluding its contents.
     * @param stagingZone Staging Zone Content ID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentStagingZonesStagingZoneGet(stagingZone: kotlin.Int): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/staging-zones/{staging_zone}".replace("{" + "staging_zone" + "}", "$stagingZone")
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
     * Get content statistics
     * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a content
     * @param limit limit 
     * @param offset offset 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentStatsGet(limit: kotlin.String, offset: kotlin.String): kotlin.String {
        val localVariableQuery: MultiValueMap = mapOf("limit" to listOf("$limit"), "offset" to listOf("$offset"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/stats", query = localVariableQuery
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
     * Content Status
     * This endpoint returns the status of a content
     * @param id Content ID 
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentStatusIdGet(id: kotlin.Int): kotlin.String {
        
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/content/status/{id}".replace("{" + "id" + "}", "$id")
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
}
