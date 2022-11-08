package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import IpfsListPinStatusResponse._

case class IpfsListPinStatusResponse (
  count: Option[Integer],
results: Option[List[IpfsPinStatusResponse]])

object IpfsListPinStatusResponse {
  import DateTimeCodecs._

  implicit val IpfsListPinStatusResponseCodecJson: CodecJson[IpfsListPinStatusResponse] = CodecJson.derive[IpfsListPinStatusResponse]
  implicit val IpfsListPinStatusResponseDecoder: EntityDecoder[IpfsListPinStatusResponse] = jsonOf[IpfsListPinStatusResponse]
  implicit val IpfsListPinStatusResponseEncoder: EntityEncoder[IpfsListPinStatusResponse] = jsonEncoderOf[IpfsListPinStatusResponse]
}
