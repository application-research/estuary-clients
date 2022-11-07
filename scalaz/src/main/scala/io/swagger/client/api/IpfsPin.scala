package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import IpfsPin._

case class IpfsPin (
  cid: Option[String],
meta: Option[Any],
name: Option[String],
origins: Option[List[String]])

object IpfsPin {
  import DateTimeCodecs._

  implicit val IpfsPinCodecJson: CodecJson[IpfsPin] = CodecJson.derive[IpfsPin]
  implicit val IpfsPinDecoder: EntityDecoder[IpfsPin] = jsonOf[IpfsPin]
  implicit val IpfsPinEncoder: EntityEncoder[IpfsPin] = jsonEncoderOf[IpfsPin]
}
