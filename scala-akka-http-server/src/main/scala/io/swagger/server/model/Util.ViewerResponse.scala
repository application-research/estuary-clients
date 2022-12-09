package io.swagger.server.model


/**
 * @param address 
 * @param auth_expiry 
 * @param id 
 * @param miners 
 * @param perms 
 * @param settings 
 * @param username 
 */
case class Util.ViewerResponse (
  address: Option[String],
  auth_expiry: Option[String],
  id: Option[Int],
  miners: Option[List[String]],
  perms: Option[Int],
  settings: Option[util.UserSettings],
  username: Option[String]
)

