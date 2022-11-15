package io.swagger.server.model


/**
 * @param cid 
 * @param createdAt 
 * @param description 
 * @param name 
 * @param userId 
 * @param uuid 
 */
case class Collections.Collection (
  cid: Option[String],
  createdAt: Option[String],
  description: Option[String],
  name: Option[String],
  userId: Option[Int],
  uuid: Option[String]
)

