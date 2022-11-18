/**
 * Estuary API
 * This is the API for the Estuary application.
 *
 * OpenAPI spec version: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Array[Byte]
import io.swagger.client.model.ContentAddIpfsBody
import io.swagger.client.model.ContentCreateBody
import io.swagger.client.model.ImportDealBody
import io.swagger.client.model.util.ContentAddResponse
import io.swagger.client.model.util.HttpError
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class ContentApi(
  val defBasePath: String = "//api.estuary.tech/",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new ContentApiAsyncHelper(client, config)

  /**
   * Add Car object
   * This endpoint is used to add a car object to the network. The object can be a file or a directory.
   *
   * @param body Car 
   * @param ignoreDupes Ignore Dupes (optional)
   * @param filename Filename (optional)
   * @return util.ContentAddResponse
   */
  def contentAddCarPost(body: String, ignoreDupes: Option[String] = None, filename: Option[String] = None): Option[util.ContentAddResponse] = {
    val await = Try(Await.result(contentAddCarPostAsync(body, ignoreDupes, filename), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add Car object asynchronously
   * This endpoint is used to add a car object to the network. The object can be a file or a directory.
   *
   * @param body Car 
   * @param ignoreDupes Ignore Dupes (optional)
   * @param filename Filename (optional)
   * @return Future(util.ContentAddResponse)
   */
  def contentAddCarPostAsync(body: String, ignoreDupes: Option[String] = None, filename: Option[String] = None): Future[util.ContentAddResponse] = {
      helper.contentAddCarPost(body, ignoreDupes, filename)
  }

  /**
   * Add IPFS object
   * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
   *
   * @param body IPFS Body 
   * @param ignoreDupes Ignore Dupes (optional)
   * @return String
   */
  def contentAddIpfsPost(body: ContentAddIpfsBody, ignoreDupes: Option[String] = None): Option[String] = {
    val await = Try(Await.result(contentAddIpfsPostAsync(body, ignoreDupes), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add IPFS object asynchronously
   * This endpoint is used to add an IPFS object to the network. The object can be a file or a directory.
   *
   * @param body IPFS Body 
   * @param ignoreDupes Ignore Dupes (optional)
   * @return Future(String)
   */
  def contentAddIpfsPostAsync(body: ContentAddIpfsBody, ignoreDupes: Option[String] = None): Future[String] = {
      helper.contentAddIpfsPost(body, ignoreDupes)
  }

  /**
   * Add new content
   * This endpoint is used to upload new content.
   *
   * @param data  
   * @param filename  
   * @param coluuid Collection UUID (optional)
   * @param replication Replication value (optional)
   * @param ignoreDupes Ignore Dupes true/false (optional)
   * @param lazyProvide Lazy Provide true/false (optional)
   * @param dir Directory (optional)
   * @return util.ContentAddResponse
   */
  def contentAddPost(data: Array[Byte], filename: String, coluuid: Option[String] = None, replication: Option[Integer] = None, ignoreDupes: Option[String] = None, lazyProvide: Option[String] = None, dir: Option[String] = None): Option[util.ContentAddResponse] = {
    val await = Try(Await.result(contentAddPostAsync(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add new content asynchronously
   * This endpoint is used to upload new content.
   *
   * @param data  
   * @param filename  
   * @param coluuid Collection UUID (optional)
   * @param replication Replication value (optional)
   * @param ignoreDupes Ignore Dupes true/false (optional)
   * @param lazyProvide Lazy Provide true/false (optional)
   * @param dir Directory (optional)
   * @return Future(util.ContentAddResponse)
   */
  def contentAddPostAsync(data: Array[Byte], filename: String, coluuid: Option[String] = None, replication: Option[Integer] = None, ignoreDupes: Option[String] = None, lazyProvide: Option[String] = None, dir: Option[String] = None): Future[util.ContentAddResponse] = {
      helper.contentAddPost(data, filename, coluuid, replication, ignoreDupes, lazyProvide, dir)
  }

  /**
   * Get aggregated content stats
   * This endpoint returns aggregated content stats
   *
   * @param content Content ID 
   * @return String
   */
  def contentAggregatedContentGet(content: String): Option[String] = {
    val await = Try(Await.result(contentAggregatedContentGetAsync(content), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get aggregated content stats asynchronously
   * This endpoint returns aggregated content stats
   *
   * @param content Content ID 
   * @return Future(String)
   */
  def contentAggregatedContentGetAsync(content: String): Future[String] = {
      helper.contentAggregatedContentGet(content)
  }

  /**
   * Get all deals for a user
   * This endpoint is used to get all deals for a user
   *
   * @param begin Begin 
   * @param duration Duration 
   * @param all All 
   * @return String
   */
  def contentAllDealsGet(begin: String, duration: String, all: String): Option[String] = {
    val await = Try(Await.result(contentAllDealsGetAsync(begin, duration, all), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all deals for a user asynchronously
   * This endpoint is used to get all deals for a user
   *
   * @param begin Begin 
   * @param duration Duration 
   * @param all All 
   * @return Future(String)
   */
  def contentAllDealsGetAsync(begin: String, duration: String, all: String): Future[String] = {
      helper.contentAllDealsGet(begin, duration, all)
  }

  /**
   * Get content bandwidth
   * This endpoint returns content bandwidth
   *
   * @param content Content ID 
   * @return String
   */
  def contentBwUsageContentGet(content: String): Option[String] = {
    val await = Try(Await.result(contentBwUsageContentGetAsync(content), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get content bandwidth asynchronously
   * This endpoint returns content bandwidth
   *
   * @param content Content ID 
   * @return Future(String)
   */
  def contentBwUsageContentGetAsync(content: String): Future[String] = {
      helper.contentBwUsageContentGet(content)
  }

  /**
   * Add a new content
   * This endpoint adds a new content
   *
   * @param body Content 
   * @param ignoreDupes Ignore Dupes (optional)
   * @return String
   */
  def contentCreatePost(body: ContentCreateBody, ignoreDupes: Option[String] = None): Option[String] = {
    val await = Try(Await.result(contentCreatePostAsync(body, ignoreDupes), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a new content asynchronously
   * This endpoint adds a new content
   *
   * @param body Content 
   * @param ignoreDupes Ignore Dupes (optional)
   * @return Future(String)
   */
  def contentCreatePostAsync(body: ContentCreateBody, ignoreDupes: Option[String] = None): Future[String] = {
      helper.contentCreatePost(body, ignoreDupes)
  }

  /**
   * Content with deals
   * This endpoint lists all content with deals
   *
   * @param limit Limit (optional)
   * @param offset Offset (optional)
   * @return String
   */
  def contentDealsGet(limit: Option[Integer] = None, offset: Option[Integer] = None): Option[String] = {
    val await = Try(Await.result(contentDealsGetAsync(limit, offset), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Content with deals asynchronously
   * This endpoint lists all content with deals
   *
   * @param limit Limit (optional)
   * @param offset Offset (optional)
   * @return Future(String)
   */
  def contentDealsGetAsync(limit: Option[Integer] = None, offset: Option[Integer] = None): Future[String] = {
      helper.contentDealsGet(limit, offset)
  }

  /**
   * Ensure Replication
   * This endpoint ensures that the content is replicated to the specified number of providers
   *
   * @param datacid Data CID 
   * @return String
   */
  def contentEnsureReplicationDatacidGet(datacid: String): Option[String] = {
    val await = Try(Await.result(contentEnsureReplicationDatacidGetAsync(datacid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Ensure Replication asynchronously
   * This endpoint ensures that the content is replicated to the specified number of providers
   *
   * @param datacid Data CID 
   * @return Future(String)
   */
  def contentEnsureReplicationDatacidGetAsync(datacid: String): Future[String] = {
      helper.contentEnsureReplicationDatacidGet(datacid)
  }

  /**
   * List all failures for a content
   * This endpoint returns all failures for a content
   *
   * @param content Content ID 
   * @return String
   */
  def contentFailuresContentGet(content: String): Option[String] = {
    val await = Try(Await.result(contentFailuresContentGetAsync(content), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List all failures for a content asynchronously
   * This endpoint returns all failures for a content
   *
   * @param content Content ID 
   * @return Future(String)
   */
  def contentFailuresContentGetAsync(content: String): Future[String] = {
      helper.contentFailuresContentGet(content)
  }

  /**
   * Content
   * This endpoint returns a content by its ID
   *
   * @param id Content ID 
   * @return String
   */
  def contentIdGet(id: Integer): Option[String] = {
    val await = Try(Await.result(contentIdGetAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Content asynchronously
   * This endpoint returns a content by its ID
   *
   * @param id Content ID 
   * @return Future(String)
   */
  def contentIdGetAsync(id: Integer): Future[String] = {
      helper.contentIdGet(id)
  }

  /**
   * Import a deal
   * This endpoint imports a deal into the shuttle.
   *
   * @param body Import a deal 
   * @return String
   */
  def contentImportdealPost(body: ImportDealBody): Option[String] = {
    val await = Try(Await.result(contentImportdealPostAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Import a deal asynchronously
   * This endpoint imports a deal into the shuttle.
   *
   * @param body Import a deal 
   * @return Future(String)
   */
  def contentImportdealPostAsync(body: ImportDealBody): Future[String] = {
      helper.contentImportdealPost(body)
  }

  /**
   * List all pinned content
   * This endpoint lists all content
   *
   * @return String
   */
  def contentListGet(): Option[String] = {
    val await = Try(Await.result(contentListGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List all pinned content asynchronously
   * This endpoint lists all content
   *
   * @return Future(String)
   */
  def contentListGetAsync(): Future[String] = {
      helper.contentListGet()
  }

  /**
   * Read content
   * This endpoint reads content from the blockstore
   *
   * @param cont CID 
   * @return String
   */
  def contentReadContGet(cont: String): Option[String] = {
    val await = Try(Await.result(contentReadContGetAsync(cont), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Read content asynchronously
   * This endpoint reads content from the blockstore
   *
   * @param cont CID 
   * @return Future(String)
   */
  def contentReadContGetAsync(cont: String): Future[String] = {
      helper.contentReadContGet(cont)
  }

  /**
   * Get staging zone for user
   * This endpoint is used to get staging zone for user.
   *
   * @return String
   */
  def contentStagingZonesGet(): Option[String] = {
    val await = Try(Await.result(contentStagingZonesGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get staging zone for user asynchronously
   * This endpoint is used to get staging zone for user.
   *
   * @return Future(String)
   */
  def contentStagingZonesGetAsync(): Future[String] = {
      helper.contentStagingZonesGet()
  }

  /**
   * Get content statistics
   * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
   *
   * @param limit limit 
   * @param offset offset 
   * @return String
   */
  def contentStatsGet(limit: String, offset: String): Option[String] = {
    val await = Try(Await.result(contentStatsGetAsync(limit, offset), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get content statistics asynchronously
   * This endpoint is used to get content statistics. Every content stored in the network (estuary) is tracked by a unique ID which can be used to get information about the content. This endpoint will allow the consumer to get the collected stats of a conten
   *
   * @param limit limit 
   * @param offset offset 
   * @return Future(String)
   */
  def contentStatsGetAsync(limit: String, offset: String): Future[String] = {
      helper.contentStatsGet(limit, offset)
  }

  /**
   * Content Status
   * This endpoint returns the status of a content
   *
   * @param id Content ID 
   * @return String
   */
  def contentStatusIdGet(id: Integer): Option[String] = {
    val await = Try(Await.result(contentStatusIdGetAsync(id), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Content Status asynchronously
   * This endpoint returns the status of a content
   *
   * @param id Content ID 
   * @return Future(String)
   */
  def contentStatusIdGetAsync(id: Integer): Future[String] = {
      helper.contentStatusIdGet(id)
  }

}

class ContentApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def contentAddCarPost(body: String,
    ignoreDupes: Option[String] = None,
    filename: Option[String] = None
    )(implicit reader: ClientResponseReader[util.ContentAddResponse], writer: RequestWriter[String]): Future[util.ContentAddResponse] = {
    // create path and map variables
    val path = (addFmt("/content/add-car"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ContentApi->contentAddCarPost")
    ignoreDupes match {
      case Some(param) => queryParams += "ignore-dupes" -> param.toString
      case _ => queryParams
    }
    filename match {
      case Some(param) => queryParams += "filename" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentAddIpfsPost(body: ContentAddIpfsBody,
    ignoreDupes: Option[String] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[ContentAddIpfsBody]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/add-ipfs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ContentApi->contentAddIpfsPost")
    ignoreDupes match {
      case Some(param) => queryParams += "ignore-dupes" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentAddPost(data: Array[Byte],
    filename: String,
    coluuid: Option[String] = None,
    replication: Option[Integer] = None,
    ignoreDupes: Option[String] = None,
    lazyProvide: Option[String] = None,
    dir: Option[String] = None
    )(implicit reader: ClientResponseReader[util.ContentAddResponse]): Future[util.ContentAddResponse] = {
    // create path and map variables
    val path = (addFmt("/content/add"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (data == null) throw new Exception("Missing required parameter 'data' when calling ContentApi->contentAddPost")

    if (filename == null) throw new Exception("Missing required parameter 'filename' when calling ContentApi->contentAddPost")

    coluuid match {
      case Some(param) => queryParams += "coluuid" -> param.toString
      case _ => queryParams
    }
    replication match {
      case Some(param) => queryParams += "replication" -> param.toString
      case _ => queryParams
    }
    ignoreDupes match {
      case Some(param) => queryParams += "ignore-dupes" -> param.toString
      case _ => queryParams
    }
    lazyProvide match {
      case Some(param) => queryParams += "lazy-provide" -> param.toString
      case _ => queryParams
    }
    dir match {
      case Some(param) => queryParams += "dir" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentAggregatedContentGet(content: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/aggregated/{content}")
      replaceAll("\\{" + "content" + "\\}", content.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (content == null) throw new Exception("Missing required parameter 'content' when calling ContentApi->contentAggregatedContentGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentAllDealsGet(begin: String,
    duration: String,
    all: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/all-deals"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (begin == null) throw new Exception("Missing required parameter 'begin' when calling ContentApi->contentAllDealsGet")

    if (duration == null) throw new Exception("Missing required parameter 'duration' when calling ContentApi->contentAllDealsGet")

    if (all == null) throw new Exception("Missing required parameter 'all' when calling ContentApi->contentAllDealsGet")

    queryParams += "begin" -> begin.toString
    queryParams += "duration" -> duration.toString
    queryParams += "all" -> all.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentBwUsageContentGet(content: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/bw-usage/{content}")
      replaceAll("\\{" + "content" + "\\}", content.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (content == null) throw new Exception("Missing required parameter 'content' when calling ContentApi->contentBwUsageContentGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentCreatePost(body: ContentCreateBody,
    ignoreDupes: Option[String] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[ContentCreateBody]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/create"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ContentApi->contentCreatePost")
    ignoreDupes match {
      case Some(param) => queryParams += "ignore-dupes" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentDealsGet(limit: Option[Integer] = None,
    offset: Option[Integer] = None
    )(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/deals"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    offset match {
      case Some(param) => queryParams += "offset" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentEnsureReplicationDatacidGet(datacid: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/ensure-replication/{datacid}")
      replaceAll("\\{" + "datacid" + "\\}", datacid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (datacid == null) throw new Exception("Missing required parameter 'datacid' when calling ContentApi->contentEnsureReplicationDatacidGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentFailuresContentGet(content: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/failures/{content}")
      replaceAll("\\{" + "content" + "\\}", content.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (content == null) throw new Exception("Missing required parameter 'content' when calling ContentApi->contentFailuresContentGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentIdGet(id: Integer)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentImportdealPost(body: ImportDealBody)(implicit reader: ClientResponseReader[String], writer: RequestWriter[ImportDealBody]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/importdeal"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ContentApi->contentImportdealPost")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentListGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/list"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentReadContGet(cont: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/read/{cont}")
      replaceAll("\\{" + "cont" + "\\}", cont.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (cont == null) throw new Exception("Missing required parameter 'cont' when calling ContentApi->contentReadContGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentStagingZonesGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/staging-zones"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentStatsGet(limit: String,
    offset: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/stats"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (limit == null) throw new Exception("Missing required parameter 'limit' when calling ContentApi->contentStatsGet")

    if (offset == null) throw new Exception("Missing required parameter 'offset' when calling ContentApi->contentStatsGet")

    queryParams += "limit" -> limit.toString
    queryParams += "offset" -> offset.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentStatusIdGet(id: Integer)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content/status/{id}")
      replaceAll("\\{" + "id" + "\\}", id.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
