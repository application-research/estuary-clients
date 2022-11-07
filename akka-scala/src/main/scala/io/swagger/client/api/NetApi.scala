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
package io.swagger.client.api

import io.swagger.client.model.UtilHttpError
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object NetApi {

  /**
   * This endpoint is used to get net addrs
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def netAddrsGet()(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://api.estuary.tech", "/net/addrs", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint returns all miners
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param miner Filter by miner
   */
  def publicMinersFailuresMinerGet(miner: String)(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://api.estuary.tech", "/public/miners/failures/{miner}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("miner", miner)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint returns all miners
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def publicMinersGet()(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://api.estuary.tech", "/public/miners", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint is used to get net addrs
   * 
   * Expected answers:
   *   code 200 : Seq[String] (OK)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def publicNetAddrsGet()(implicit apiKey: ApiKeyValue): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://api.estuary.tech", "/public/net/addrs", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[Seq[String]](200)
        /**
   * This endpoint is used to get net peers
   * 
   * Expected answers:
   *   code 200 : Seq[String] (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def publicNetPeersGet()(implicit apiKey: ApiKeyValue): ApiRequest[Seq[String]] =
    ApiRequest[Seq[String]](ApiMethods.GET, "https://api.estuary.tech", "/public/net/peers", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[Seq[String]](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
      

}

