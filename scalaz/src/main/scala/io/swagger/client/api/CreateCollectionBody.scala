package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import CreateCollectionBody._

case class CreateCollectionBody (
  description: Option[String],
name: Option[String])

object CreateCollectionBody {
  import DateTimeCodecs._

  implicit val CreateCollectionBodyCodecJson: CodecJson[CreateCollectionBody] = CodecJson.derive[CreateCollectionBody]
  implicit val CreateCollectionBodyDecoder: EntityDecoder[CreateCollectionBody] = jsonOf[CreateCollectionBody]
  implicit val CreateCollectionBodyEncoder: EntityEncoder[CreateCollectionBody] = jsonEncoderOf[CreateCollectionBody]
}
