package io.swagger.server.model


/**
 * @param code 
 * @param details 
 * @param reason 
 */
case class Util.HttpError (
  code: Option[Int],
  details: Option[String],
  reason: Option[String]
)

