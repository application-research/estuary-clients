package io.swagger.server.model


/**
 * @param cid 
 * @param meta 
 * @param name 
 * @param origins 
 */
case class Pinner.IpfsPin (
  cid: Option[String],
  meta: Option[Map[String, Object]],
  name: Option[String],
  origins: Option[List[String]]
)

