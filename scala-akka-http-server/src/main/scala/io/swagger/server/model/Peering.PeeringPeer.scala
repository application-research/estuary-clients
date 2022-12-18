package io.swagger.server.model


/**
 * @param Addrs 
 * @param Connected 
 * @param ID 
 */
case class Peering.PeeringPeer (
  Addrs: Option[List[String]],
  Connected: Option[Boolean],
  ID: Option[String]
)

