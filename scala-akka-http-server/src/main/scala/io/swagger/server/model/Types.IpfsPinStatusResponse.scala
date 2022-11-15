package io.swagger.server.model


/**
 * @param created 
 * @param delegates 
 * @param info 
 * @param pin 
 * @param requestid 
 * @param status 
 */
case class Types.IpfsPinStatusResponse (
  created: Option[String],
  delegates: Option[List[String]],
  info: Option[Object],
  pin: Option[types.IpfsPin],
  requestid: Option[String],
  status: Option[String]
)

