package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ContentAddResponse._

case class ContentAddResponse (
  cid: Option[String],
estuaryId: Option[Integer],
providers: Option[List[String]],
retrievalUrl: Option[String])

object ContentAddResponse {
  import DateTimeCodecs._

  implicit val ContentAddResponseCodecJson: CodecJson[ContentAddResponse] = CodecJson.derive[ContentAddResponse]
  implicit val ContentAddResponseDecoder: EntityDecoder[ContentAddResponse] = jsonOf[ContentAddResponse]
  implicit val ContentAddResponseEncoder: EntityEncoder[ContentAddResponse] = jsonEncoderOf[ContentAddResponse]
}
