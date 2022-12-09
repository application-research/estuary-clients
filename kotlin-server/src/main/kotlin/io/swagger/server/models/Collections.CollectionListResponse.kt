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
*/package io.swagger.server.models

import io.swagger.server.models.CollectionsCidType
import io.swagger.server.models.UtilDbCID

/**
 *  * @param cid  * @param coluuid  * @param contId  * @param dir  * @param name  * @param size  * @param type  * @param updatedAt */
data class CollectionsCollectionListResponse (    val cid: UtilDbCID? = null,    val coluuid: kotlin.String? = null,    val contId: kotlin.Int? = null,    val dir: kotlin.String? = null,    val name: kotlin.String? = null,    val size: kotlin.Int? = null,    val type: CollectionsCidType? = null,    val updatedAt: kotlin.String? = null
) {
}
