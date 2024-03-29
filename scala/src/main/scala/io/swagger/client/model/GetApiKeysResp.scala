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
package io.swagger.client.model


/**
 * @param expiry 
 * @param isSession 
 * @param label 
 * @param token 
 * @param tokenHash 
 */
case class GetApiKeysResp (
  expiry: Option[String] = None,
  isSession: Option[Boolean] = None,
  label: Option[String] = None,
  token: Option[String] = None,
  tokenHash: Option[String] = None
)

