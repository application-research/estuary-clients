package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ContentAddIpfsBody._

case class ContentAddIpfsBody (
  coluuid: Option[String],
dir: Option[String],
filename: Option[String],
peers: Option[List[String]],
root: Option[String])

object ContentAddIpfsBody {
  import DateTimeCodecs._

  implicit val ContentAddIpfsBodyCodecJson: CodecJson[ContentAddIpfsBody] = CodecJson.derive[ContentAddIpfsBody]
  implicit val ContentAddIpfsBodyDecoder: EntityDecoder[ContentAddIpfsBody] = jsonOf[ContentAddIpfsBody]
  implicit val ContentAddIpfsBodyEncoder: EntityEncoder[ContentAddIpfsBody] = jsonEncoderOf[ContentAddIpfsBody]
}
