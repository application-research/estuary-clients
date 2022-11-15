package io.swagger.server.model


/**
 * @param cid 
 * @param meta 
 * @param name 
 * @param origins 
 */
case class Types.IpfsPin (
  cid: Option[String],
  meta: Option[Object],
  name: Option[String],
  origins: Option[List[String]]
)

