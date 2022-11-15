package io.swagger.server.model


/**
 * @param data File to upload
 * @param filename Filenam to use for upload
 */
case class Content_add_body (
  data: byte[],
  filename: Option[String]
)

