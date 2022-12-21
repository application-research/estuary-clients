package io.swagger.server.model


/**
 * @param addr 
 * @param name 
 * @param suspended 
 * @param suspendedReason 
 * @param version 
 */
case class Api.storageProviderResp (
  addr: Option[address.Address],
  name: Option[String],
  suspended: Option[Boolean],
  suspendedReason: Option[String],
  version: Option[String]
)

