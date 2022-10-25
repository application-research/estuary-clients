package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ContentCreateBody._

case class ContentCreateBody (
  coluuid: Option[String],
dir: Option[String],
location: Option[String],
name: Option[String],
root: Option[String],
`type`: Option[Integer])

object ContentCreateBody {
  import DateTimeCodecs._

  implicit val ContentCreateBodyCodecJson: CodecJson[ContentCreateBody] = CodecJson.derive[ContentCreateBody]
  implicit val ContentCreateBodyDecoder: EntityDecoder[ContentCreateBody] = jsonOf[ContentCreateBody]
  implicit val ContentCreateBodyEncoder: EntityEncoder[ContentCreateBody] = jsonEncoderOf[ContentCreateBody]
}
