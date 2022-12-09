package io.swagger.server.model


/**
 * @param contentAddingDisabled 
 * @param dealDuration 
 * @param dealMakingDisabled 
 * @param fileStagingThreshold 
 * @param flags 
 * @param replication 
 * @param uploadEndpoints 
 * @param verified 
 */
case class Util.UserSettings (
  contentAddingDisabled: Option[Boolean],
  dealDuration: Option[Int],
  dealMakingDisabled: Option[Boolean],
  fileStagingThreshold: Option[Int],
  flags: Option[Int],
  replication: Option[Int],
  uploadEndpoints: Option[List[String]],
  verified: Option[Boolean]
)

