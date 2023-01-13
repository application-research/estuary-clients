package io.swagger.server.model


/**
 * @param addr 
 * @param chain_info 
 * @param name 
 * @param suspended 
 * @param suspendedReason 
 * @param version 
 */
case class Api.minerResp (
  addr: Option[address.Address],
  chain_info: Option[miner.MinerChainInfo],
  name: Option[String],
  suspended: Option[Boolean],
  suspendedReason: Option[String],
  version: Option[String]
)

