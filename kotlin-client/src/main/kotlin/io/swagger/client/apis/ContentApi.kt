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

import io.swagger.client.models.TypesIpfsPin
import io.swagger.client.models.UtilContentAddResponse
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
     * Add Car object
     * This endpoint is used to add a car object to the network. The object can be a file or a directory.
     * @param body Car 
     * @param ignoreDupes Ignore Dupes (optional)
     * @param filename Filename (optional)
     * @return UtilContentAddResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAddCarPost(body: kotlin.String, ignoreDupes: kotlin.String? = null, filename: kotlin.String? = null): UtilContentAddResponse {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf("ignore-dupes" to listOf("$ignoreDupes"), "filename" to listOf("$filename"))
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/add-car", query = localVariableQuery
        )
        val response = request<UtilContentAddResponse>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UtilContentAddResponse
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
     * @param overwrite Overwrite conflicting files in collections (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAddIpfsPost(body: TypesIpfsPin, ignoreDupes: kotlin.String? = null, overwrite: kotlin.String? = null): kotlin.String {
        val localVariableBody: kotlin.Any? = body
        val localVariableQuery: MultiValueMap = mapOf("ignore-dupes" to listOf("$ignoreDupes"), "overwrite" to listOf("$overwrite"))
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
     * Add new content
     * This endpoint is used to upload new content.
     * @param &#x60;data&#x60;  
     * @param filename  
     * @param coluuid Collection UUID (optional)
     * @param replication Replication value (optional)
     * @param ignoreDupes Ignore Dupes true/false (optional)
     * @param overwrite Overwrite files with the same path on same collection (optional)
     * @param lazyProvide Lazy Provide true/false (optional)
     * @param dir Directory (optional)
     * @return UtilContentAddResponse
     */
    @Suppress("UNCHECKED_CAST")
    fun contentAddPost(&#x60;data&#x60;: kotlin.Array<kotlin.Byte>, filename: kotlin.String, coluuid: kotlin.String? = null, replication: kotlin.Int? = null, ignoreDupes: kotlin.String? = null, overwrite: kotlin.String? = null, lazyProvide: kotlin.String? = null, dir: kotlin.String? = null): UtilContentAddResponse {
        val localVariableBody: kotlin.Any? = mapOf("data" to "$&#x60;data&#x60;", "filename" to "$filename")
        val localVariableQuery: MultiValueMap = mapOf("coluuid" to listOf("$coluuid"), "replication" to listOf("$replication"), "ignore-dupes" to listOf("$ignoreDupes"), "overwrite" to listOf("$overwrite"), "lazy-provide" to listOf("$lazyProvide"), "dir" to listOf("$dir"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String, kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/content/add", query = localVariableQuery, headers = localVariableHeaders
        )
        val response = request<UtilContentAddResponse>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as UtilContentAddResponse
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
