package io.swagger.server.model


/**
 * @param coluuid 
 * @param dealIDs 
 * @param dir 
 * @param name 
 */
case class Main.importDealBody (
  coluuid: Option[String],
  dealIDs: Option[List[Int]],
  dir: Option[String],
  name: Option[String]
)

