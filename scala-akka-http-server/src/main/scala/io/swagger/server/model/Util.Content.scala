package io.swagger.server.model


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
case class Util.Content (
  active: Option[Boolean],
  aggregate: Option[Boolean],
  aggregatedIn: Option[Int],
  cid: Option[util.DbCID],
  createdAt: Option[String],
  dagSplit: Option[Boolean],
  dealStatus: Option[String],
  description: Option[String],
  failed: Option[Boolean],
  id: Option[Int],
  location: Option[String],
  name: Option[String],
  offloaded: Option[Boolean],
  origins: Option[String],
  pinMeta: Option[String],
  pinning: Option[Boolean],
  pinningStatus: Option[String],
  replace: Option[Boolean],
  replication: Option[Int],
  size: Option[Int],
  splitFrom: Option[Int],
  `type`: Option[util.ContentType],
  updatedAt: Option[String],
  userId: Option[Int]
)

