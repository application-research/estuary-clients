package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import GetApiKeysResp._

case class GetApiKeysResp (
  expiry: Option[String],
label: Option[String],
token: Option[String],
tokenHash: Option[String])

object GetApiKeysResp {
  import DateTimeCodecs._

  implicit val GetApiKeysRespCodecJson: CodecJson[GetApiKeysResp] = CodecJson.derive[GetApiKeysResp]
  implicit val GetApiKeysRespDecoder: EntityDecoder[GetApiKeysResp] = jsonOf[GetApiKeysResp]
  implicit val GetApiKeysRespEncoder: EntityEncoder[GetApiKeysResp] = jsonEncoderOf[GetApiKeysResp]
}
