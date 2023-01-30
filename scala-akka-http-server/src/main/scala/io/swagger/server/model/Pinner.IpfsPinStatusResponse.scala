package io.swagger.server.model


/**
 * @param content 
 * @param created 
 * @param delegates 
 * @param info 
 * @param pin 
 * @param requestid 
 * @param status 
 */
case class Pinner.IpfsPinStatusResponse (
  content: Option[util.Content],
  created: Option[String],
  delegates: Option[List[String]],
  info: Option[Map[String, Object]],
  pin: Option[pinner.IpfsPin],
  requestid: Option[String],
  status: Option[status.PinningStatus]
)

