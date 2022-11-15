package io.swagger.server.model


/**
 * @param coluuid 
 * @param dir 
 * @param location 
 * @param name 
 * @param root 
 * @param `type` 
 */
case class Util.ContentCreateBody (
  coluuid: Option[String],
  dir: Option[String],
  location: Option[String],
  name: Option[String],
  root: Option[String],
  `type`: Option[Int]
)

