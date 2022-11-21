package io.swagger.server.model


/**
 * @param cid 
 * @param estuaryId 
 * @param estuary_retrieval_url 
 * @param providers 
 * @param retrieval_url 
 */
case class Util.ContentAddResponse (
  cid: Option[String],
  estuaryId: Option[Int],
  estuary_retrieval_url: Option[String],
  providers: Option[List[String]],
  retrieval_url: Option[String]
)

