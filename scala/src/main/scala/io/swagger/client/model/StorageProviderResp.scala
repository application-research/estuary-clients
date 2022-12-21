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
 * @param addr 
 * @param name 
 * @param suspended 
 * @param suspendedReason 
 * @param version 
 */
case class StorageProviderResp (
  addr: Option[address.Address] = None,
  name: Option[String] = None,
  suspended: Option[Boolean] = None,
  suspendedReason: Option[String] = None,
  version: Option[String] = None
)

