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
 * @param coluuid 
 * @param dir 
 * @param filename 
 * @param peers 
 * @param root 
 */
case class ContentAddIpfsBody (
  coluuid: Option[String] = None,
  dir: Option[String] = None,
  filename: Option[String] = None,
  peers: Option[List[String]] = None,
  root: Option[String] = None
)

