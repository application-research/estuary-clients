package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import DeleteContentFromCollectionBody._

case class DeleteContentFromCollectionBody (
  by: Option[String],
value: Option[String])

object DeleteContentFromCollectionBody {
  import DateTimeCodecs._

  implicit val DeleteContentFromCollectionBodyCodecJson: CodecJson[DeleteContentFromCollectionBody] = CodecJson.derive[DeleteContentFromCollectionBody]
  implicit val DeleteContentFromCollectionBodyDecoder: EntityDecoder[DeleteContentFromCollectionBody] = jsonOf[DeleteContentFromCollectionBody]
  implicit val DeleteContentFromCollectionBodyEncoder: EntityEncoder[DeleteContentFromCollectionBody] = jsonEncoderOf[DeleteContentFromCollectionBody]
}
