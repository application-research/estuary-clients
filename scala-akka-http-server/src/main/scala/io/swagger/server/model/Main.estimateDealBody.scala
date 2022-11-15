package io.swagger.server.model


/**
 * @param durationBlks 
 * @param replication 
 * @param size 
 * @param verified 
 */
case class Main.estimateDealBody (
  durationBlks: Option[Int],
  replication: Option[Int],
  size: Option[Int],
  verified: Option[Boolean]
)

