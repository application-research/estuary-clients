package io.swagger.server.model


/**
 * @param id 
 * @param initiator 
 * @param responder 
 */
case class Main.ChannelIDParam (
  id: Option[Int],
  initiator: Option[String],
  responder: Option[String]
)

