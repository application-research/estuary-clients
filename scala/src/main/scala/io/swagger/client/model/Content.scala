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
 * @param active 
 * @param aggregate 
 * @param aggregatedIn TODO: shift most of the 'state' booleans in here into a single state field, should make reasoning about things much simpler
 * @param cid 
 * @param createdAt 
 * @param dagSplit If set, this content is part of a split dag. In such a case, the 'root' content should be advertised on the dht, but not have deals made for it, and the children should have deals made for them (unlike with aggregates)
 * @param dealStatus 
 * @param description 
 * @param failed 
 * @param id 
 * @param location 
 * @param name 
 * @param offloaded 
 * @param origins 
 * @param pinMeta 
 * @param pinning 
 * @param pinningStatus 
 * @param replace 
 * @param replication 
 * @param size 
 * @param splitFrom 
 * @param `type` 
 * @param updatedAt 
 * @param userId 
 */
case class Content (
  active: Option[Boolean] = None,
  aggregate: Option[Boolean] = None,
  aggregatedIn: Option[Integer] = None,
  cid: Option[util.DbCID] = None,
  createdAt: Option[String] = None,
  dagSplit: Option[Boolean] = None,
  dealStatus: Option[String] = None,
  description: Option[String] = None,
  failed: Option[Boolean] = None,
  id: Option[Integer] = None,
  location: Option[String] = None,
  name: Option[String] = None,
  offloaded: Option[Boolean] = None,
  origins: Option[String] = None,
  pinMeta: Option[String] = None,
  pinning: Option[Boolean] = None,
  pinningStatus: Option[String] = None,
  replace: Option[Boolean] = None,
  replication: Option[Integer] = None,
  size: Option[Integer] = None,
  splitFrom: Option[Integer] = None,
  `type`: Option[util.ContentType] = None,
  updatedAt: Option[String] = None,
  userId: Option[Integer] = None
)

