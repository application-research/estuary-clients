package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import EstimateDealBody._

case class EstimateDealBody (
  durationBlks: Option[Integer],
replication: Option[Integer],
size: Option[Integer],
verified: Option[Boolean])

object EstimateDealBody {
  import DateTimeCodecs._

  implicit val EstimateDealBodyCodecJson: CodecJson[EstimateDealBody] = CodecJson.derive[EstimateDealBody]
  implicit val EstimateDealBodyDecoder: EntityDecoder[EstimateDealBody] = jsonOf[EstimateDealBody]
  implicit val EstimateDealBodyEncoder: EntityEncoder[EstimateDealBody] = jsonEncoderOf[EstimateDealBody]
}
