package io.swagger.server.model


/**
 * @param count 
 * @param results 
 */
case class Pinner.IpfsListPinStatusResponse (
  count: Option[Int],
  results: Option[List[pinner.IpfsPinStatusResponse]]
)

