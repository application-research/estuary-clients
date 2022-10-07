package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import Collection._

case class Collection (
  cid: Option[String],
createdAt: Option[String],
description: Option[String],
name: Option[String],
userId: Option[Integer],
uuid: Option[String])

object Collection {
  import DateTimeCodecs._

  implicit val CollectionCodecJson: CodecJson[Collection] = CodecJson.derive[Collection]
  implicit val CollectionDecoder: EntityDecoder[Collection] = jsonOf[Collection]
  implicit val CollectionEncoder: EntityEncoder[Collection] = jsonEncoderOf[Collection]
}
