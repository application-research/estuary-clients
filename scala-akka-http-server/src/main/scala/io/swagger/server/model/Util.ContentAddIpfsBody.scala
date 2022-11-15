package io.swagger.server.model


/**
 * @param coluuid 
 * @param dir 
 * @param filename 
 * @param peers 
 * @param root 
 */
case class Util.ContentAddIpfsBody (
  coluuid: Option[String],
  dir: Option[String],
  filename: Option[String],
  peers: Option[List[String]],
  root: Option[String]
)

