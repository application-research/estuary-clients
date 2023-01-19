package io.swagger.server.model


/**
 * @param expiry 
 * @param isSession 
 * @param label 
 * @param token 
 * @param tokenHash 
 */
case class Api.getApiKeysResp (
  expiry: Option[String],
  isSession: Option[Boolean],
  label: Option[String],
  token: Option[String],
  tokenHash: Option[String]
)

