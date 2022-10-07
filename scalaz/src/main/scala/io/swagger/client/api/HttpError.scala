package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import HttpError._

case class HttpError (
  code: Option[Integer],
details: Option[String],
reason: Option[String])

object HttpError {
  import DateTimeCodecs._

  implicit val HttpErrorCodecJson: CodecJson[HttpError] = CodecJson.derive[HttpError]
  implicit val HttpErrorDecoder: EntityDecoder[HttpError] = jsonOf[HttpError]
  implicit val HttpErrorEncoder: EntityEncoder[HttpError] = jsonEncoderOf[HttpError]
}
