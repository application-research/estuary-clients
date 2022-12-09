package io.swagger.server.model


/**
 * @param cid 
 * @param coluuid 
 * @param contId 
 * @param dir 
 * @param name 
 * @param size 
 * @param `type` 
 * @param updatedAt 
 */
case class Collections.CollectionListResponse (
  cid: Option[util.DbCID],
  coluuid: Option[String],
  contId: Option[Int],
  dir: Option[String],
  name: Option[String],
  size: Option[Int],
  `type`: Option[collections.CidType],
  updatedAt: Option[String]
)

