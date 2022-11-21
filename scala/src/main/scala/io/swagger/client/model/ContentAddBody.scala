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
 * @param data File to upload
 * @param filename Filenam to use for upload
 */
case class ContentAddBody (
  data: Array[Byte],
  filename: Option[String] = None
)
