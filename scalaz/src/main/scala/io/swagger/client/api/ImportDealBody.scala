package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ImportDealBody._

case class ImportDealBody (
  coluuid: Option[String],
dealIDs: Option[List[Integer]],
dir: Option[String],
name: Option[String])

object ImportDealBody {
  import DateTimeCodecs._

  implicit val ImportDealBodyCodecJson: CodecJson[ImportDealBody] = CodecJson.derive[ImportDealBody]
  implicit val ImportDealBodyDecoder: EntityDecoder[ImportDealBody] = jsonOf[ImportDealBody]
  implicit val ImportDealBodyEncoder: EntityEncoder[ImportDealBody] = jsonEncoderOf[ImportDealBody]
}
