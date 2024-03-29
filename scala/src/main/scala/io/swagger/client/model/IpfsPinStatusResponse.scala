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
 * @param content 
 * @param created 
 * @param delegates 
 * @param info 
 * @param pin 
 * @param requestid 
 * @param status 
 */
case class IpfsPinStatusResponse (
  content: Option[util.Content] = None,
  created: Option[String] = None,
  delegates: Option[List[String]] = None,
  info: Option[Map[String, Any]] = None,
  pin: Option[pinner.IpfsPin] = None,
  requestid: Option[String] = None,
  status: Option[status.PinningStatus] = None
)

