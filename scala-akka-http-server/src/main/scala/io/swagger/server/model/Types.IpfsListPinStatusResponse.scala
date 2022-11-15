package io.swagger.server.model


/**
 * @param count 
 * @param results 
 */
case class Types.IpfsListPinStatusResponse (
  count: Option[Int],
  results: Option[List[types.IpfsPinStatusResponse]]
)

