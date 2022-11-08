package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import IpfsPinStatusResponse._

case class IpfsPinStatusResponse (
  created: Option[String],
delegates: Option[List[String]],
info: Option[Any],
pin: Option[IpfsPin],
requestid: Option[String],
status: Option[String])

object IpfsPinStatusResponse {
  import DateTimeCodecs._

  implicit val IpfsPinStatusResponseCodecJson: CodecJson[IpfsPinStatusResponse] = CodecJson.derive[IpfsPinStatusResponse]
  implicit val IpfsPinStatusResponseDecoder: EntityDecoder[IpfsPinStatusResponse] = jsonOf[IpfsPinStatusResponse]
  implicit val IpfsPinStatusResponseEncoder: EntityEncoder[IpfsPinStatusResponse] = jsonEncoderOf[IpfsPinStatusResponse]
}
