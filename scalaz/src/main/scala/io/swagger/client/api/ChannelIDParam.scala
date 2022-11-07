package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ChannelIDParam._

case class ChannelIDParam (
  id: Option[Integer],
initiator: Option[String],
responder: Option[String])

object ChannelIDParam {
  import DateTimeCodecs._

  implicit val ChannelIDParamCodecJson: CodecJson[ChannelIDParam] = CodecJson.derive[ChannelIDParam]
  implicit val ChannelIDParamDecoder: EntityDecoder[ChannelIDParam] = jsonOf[ChannelIDParam]
  implicit val ChannelIDParamEncoder: EntityEncoder[ChannelIDParam] = jsonEncoderOf[ChannelIDParam]
}
