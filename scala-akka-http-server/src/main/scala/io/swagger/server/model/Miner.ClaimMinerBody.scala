package io.swagger.server.model


/**
 * @param claim 
 * @param miner 
 * @param name 
 */
case class Miner.ClaimMinerBody (
  claim: Option[String],
  miner: Option[address.Address],
  name: Option[String]
)

