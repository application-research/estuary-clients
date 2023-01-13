package io.swagger.server.model


/**
 * @param addresses 
 * @param owner 
 * @param peerId 
 * @param worker 
 */
case class Miner.MinerChainInfo (
  addresses: Option[List[String]],
  owner: Option[String],
  peerId: Option[String],
  worker: Option[String]
)

