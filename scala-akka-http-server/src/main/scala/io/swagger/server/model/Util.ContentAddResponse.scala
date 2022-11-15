package io.swagger.server.model


/**
 * @param cid 
 * @param estuaryId 
 * @param providers 
 * @param retrieval_url 
 */
case class Util.ContentAddResponse (
  cid: Option[String],
  estuaryId: Option[Int],
  providers: Option[List[String]],
  retrieval_url: Option[String]
)

