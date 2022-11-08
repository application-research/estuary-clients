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

import io.swagger.client.model.TypesIpfsPin
import io.swagger.client.model.UtilHttpError
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PinningApi {

  /**
   * This endpoint lists all pin status objects
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 404 : UtilHttpError (Not Found)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   */
  def pinningPinsGet()(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://api.estuary.tech", "/pinning/pins", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](404)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint deletes a pinned object.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param pinid Pin ID
   */
  def pinningPinsPinidDelete(pinid: String)(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.DELETE, "https://api.estuary.tech", "/pinning/pins/{pinid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("pinid", pinid)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint returns a pin status object.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param pinid cid
   */
  def pinningPinsPinidGet(pinid: String)(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.GET, "https://api.estuary.tech", "/pinning/pins/{pinid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("pinid", pinid)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint replaces a pinned object.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param pinid Pin ID
   */
  def pinningPinsPinidPost(pinid: String)(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.estuary.tech", "/pinning/pins/{pinid}", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withPathParam("pinid", pinid)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
        /**
   * This endpoint adds a pin to the IPFS daemon.
   * 
   * Expected answers:
   *   code 200 : String (OK)
   *   code 400 : UtilHttpError (Bad Request)
   *   code 500 : UtilHttpError (Internal Server Error)
   * 
   * Available security schemes:
   *   bearerAuth (apiKey)
   * 
   * @param pin Pin Body {cid:cid, name:name}
   */
  def pinningPinsPost(pin: TypesIpfsPin)(implicit apiKey: ApiKeyValue): ApiRequest[String] =
    ApiRequest[String](ApiMethods.POST, "https://api.estuary.tech", "/pinning/pins", "application/json")
      .withApiKey(apiKey, "Authorization", HEADER)
      .withBody(pin)
      .withSuccessResponse[String](200)
      .withErrorResponse[UtilHttpError](400)
      .withErrorResponse[UtilHttpError](500)
      

}

