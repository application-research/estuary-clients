package io.swagger.server.model


/**
 * @param expiry 
 * @param label 
 * @param token 
 * @param tokenHash 
 */
case class Api.getApiKeysResp (
  expiry: Option[String],
  label: Option[String],
  token: Option[String],
  tokenHash: Option[String]
)

