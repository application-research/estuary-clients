package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import UserStatsResponse._

case class UserStatsResponse (
  numPins: Option[Integer],
totalSize: Option[Integer])

object UserStatsResponse {
  import DateTimeCodecs._

  implicit val UserStatsResponseCodecJson: CodecJson[UserStatsResponse] = CodecJson.derive[UserStatsResponse]
  implicit val UserStatsResponseDecoder: EntityDecoder[UserStatsResponse] = jsonOf[UserStatsResponse]
  implicit val UserStatsResponseEncoder: EntityEncoder[UserStatsResponse] = jsonEncoderOf[UserStatsResponse]
}
