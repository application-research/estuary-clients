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
 * @param cid 
 * @param estuaryId 
 * @param estuaryRetrievalUrl 
 * @param providers 
 * @param retrievalUrl 
 */
case class ContentAddResponse (
  cid: Option[String] = None,
  estuaryId: Option[Integer] = None,
  estuaryRetrievalUrl: Option[String] = None,
  providers: Option[List[String]] = None,
  retrievalUrl: Option[String] = None
)

