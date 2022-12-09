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

import io.swagger.client.model.CreateCollectionBody
import io.swagger.client.model.DeleteContentFromCollectionBody
import io.swagger.client.model.collections.Collection
import io.swagger.client.model.collections.CollectionListResponse
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

class CollectionsApi(
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
  val helper = new CollectionsApiAsyncHelper(client, config)

  /**
   * Produce a CID of the collection contents
   * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
   *
   * @param coluuid coluuid 
   * @return String
   */
  def collectionsColuuidCommitPost(coluuid: String): Option[String] = {
    val await = Try(Await.result(collectionsColuuidCommitPostAsync(coluuid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Produce a CID of the collection contents asynchronously
   * This endpoint is used to save the contents in a collection, producing a top-level CID that references all the current CIDs in the collection.
   *
   * @param coluuid coluuid 
   * @return Future(String)
   */
  def collectionsColuuidCommitPostAsync(coluuid: String): Future[String] = {
      helper.collectionsColuuidCommitPost(coluuid)
  }

  /**
   * Deletes a content from a collection
   * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
   *
   * @param body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;) 
   * @param coluuid Collection ID 
   * @return String
   */
  def collectionsColuuidContentsDelete(body: DeleteContentFromCollectionBody, coluuid: String): Option[String] = {
    val await = Try(Await.result(collectionsColuuidContentsDeleteAsync(body, coluuid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Deletes a content from a collection asynchronously
   * This endpoint is used to delete an existing content from an existing collection. If two or more files with the same contentid exist in the collection, delete the one in the specified path
   *
   * @param body Variable to use when filtering for files (must be either &#x27;path&#x27; or &#x27;content_id&#x27;) 
   * @param coluuid Collection ID 
   * @return Future(String)
   */
  def collectionsColuuidContentsDeleteAsync(body: DeleteContentFromCollectionBody, coluuid: String): Future[String] = {
      helper.collectionsColuuidContentsDelete(body, coluuid)
  }

  /**
   * Deletes a collection
   * This endpoint is used to delete an existing collection.
   *
   * @param coluuid Collection ID 
   * @return String
   */
  def collectionsColuuidDelete(coluuid: String): Option[String] = {
    val await = Try(Await.result(collectionsColuuidDeleteAsync(coluuid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Deletes a collection asynchronously
   * This endpoint is used to delete an existing collection.
   *
   * @param coluuid Collection ID 
   * @return Future(String)
   */
  def collectionsColuuidDeleteAsync(coluuid: String): Future[String] = {
      helper.collectionsColuuidDelete(coluuid)
  }

  /**
   * Get contents in a collection
   * This endpoint is used to get contents in a collection. If no colpath query param is passed
   *
   * @param coluuid coluuid 
   * @param dir Directory (optional)
   * @return List[collections.CollectionListResponse]
   */
  def collectionsColuuidGet(coluuid: String, dir: Option[String] = None): Option[List[collections.CollectionListResponse]] = {
    val await = Try(Await.result(collectionsColuuidGetAsync(coluuid, dir), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get contents in a collection asynchronously
   * This endpoint is used to get contents in a collection. If no colpath query param is passed
   *
   * @param coluuid coluuid 
   * @param dir Directory (optional)
   * @return Future(List[collections.CollectionListResponse])
   */
  def collectionsColuuidGetAsync(coluuid: String, dir: Option[String] = None): Future[List[collections.CollectionListResponse]] = {
      helper.collectionsColuuidGet(coluuid, dir)
  }

  /**
   * Add contents to a collection
   * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
   *
   * @param body Content IDs to add to collection 
   * @param coluuid Collection UUID 
   * @param dir Directory (optional)
   * @return String
   */
  def collectionsColuuidPost(body: List[Integer], coluuid: String, dir: Option[String] = None): Option[String] = {
    val await = Try(Await.result(collectionsColuuidPostAsync(body, coluuid, dir), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add contents to a collection asynchronously
   * This endpoint adds already-pinned contents (that have ContentIDs) to a collection.
   *
   * @param body Content IDs to add to collection 
   * @param coluuid Collection UUID 
   * @param dir Directory (optional)
   * @return Future(String)
   */
  def collectionsColuuidPostAsync(body: List[Integer], coluuid: String, dir: Option[String] = None): Future[String] = {
      helper.collectionsColuuidPost(body, coluuid, dir)
  }

  /**
   * Add a file to a collection
   * This endpoint adds a file to a collection
   *
   * @param coluuid Collection ID 
   * @param content Content 
   * @param &#x60;path&#x60; Path to file 
   * @return String
   */
  def collectionsFsAddPost(coluuid: String, content: String, &#x60;path&#x60;: String): Option[String] = {
    val await = Try(Await.result(collectionsFsAddPostAsync(coluuid, content, &#x60;path&#x60;), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a file to a collection asynchronously
   * This endpoint adds a file to a collection
   *
   * @param coluuid Collection ID 
   * @param content Content 
   * @param &#x60;path&#x60; Path to file 
   * @return Future(String)
   */
  def collectionsFsAddPostAsync(coluuid: String, content: String, &#x60;path&#x60;: String): Future[String] = {
      helper.collectionsFsAddPost(coluuid, content, &#x60;path&#x60;)
  }

  /**
   * List all collections
   * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
   *
   * @return List[collections.Collection]
   */
  def collectionsGet(): Option[List[collections.Collection]] = {
    val await = Try(Await.result(collectionsGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List all collections asynchronously
   * This endpoint is used to list all collections. Whenever a user logs on estuary, it will list all collections that the user has access to. This endpoint provides a way to list all collections to the user.
   *
   * @return Future(List[collections.Collection])
   */
  def collectionsGetAsync(): Future[List[collections.Collection]] = {
      helper.collectionsGet()
  }

  /**
   * Create a new collection
   * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
   *
   * @param body Collection name and description 
   * @return collections.Collection
   */
  def collectionsPost(body: CreateCollectionBody): Option[collections.Collection] = {
    val await = Try(Await.result(collectionsPostAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create a new collection asynchronously
   * This endpoint is used to create a new collection. A collection is a representaion of a group of objects added on the estuary. This endpoint can be used to create a new collection.
   *
   * @param body Collection name and description 
   * @return Future(collections.Collection)
   */
  def collectionsPostAsync(body: CreateCollectionBody): Future[collections.Collection] = {
      helper.collectionsPost(body)
  }

}

class CollectionsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def collectionsColuuidCommitPost(coluuid: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/collections/{coluuid}/commit")
      replaceAll("\\{" + "coluuid" + "\\}", coluuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (coluuid == null) throw new Exception("Missing required parameter 'coluuid' when calling CollectionsApi->collectionsColuuidCommitPost")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsColuuidContentsDelete(body: DeleteContentFromCollectionBody,
    coluuid: String)(implicit reader: ClientResponseReader[String], writer: RequestWriter[DeleteContentFromCollectionBody]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/collections/{coluuid}/contents")
      replaceAll("\\{" + "coluuid" + "\\}", coluuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CollectionsApi->collectionsColuuidContentsDelete")
    if (coluuid == null) throw new Exception("Missing required parameter 'coluuid' when calling CollectionsApi->collectionsColuuidContentsDelete")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsColuuidDelete(coluuid: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/collections/{coluuid}")
      replaceAll("\\{" + "coluuid" + "\\}", coluuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (coluuid == null) throw new Exception("Missing required parameter 'coluuid' when calling CollectionsApi->collectionsColuuidDelete")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsColuuidGet(coluuid: String,
    dir: Option[String] = None
    )(implicit reader: ClientResponseReader[List[collections.CollectionListResponse]]): Future[List[collections.CollectionListResponse]] = {
    // create path and map variables
    val path = (addFmt("/collections/{coluuid}")
      replaceAll("\\{" + "coluuid" + "\\}", coluuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (coluuid == null) throw new Exception("Missing required parameter 'coluuid' when calling CollectionsApi->collectionsColuuidGet")

    dir match {
      case Some(param) => queryParams += "dir" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsColuuidPost(body: List[Integer],
    coluuid: String,
    dir: Option[String] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[List[Integer]]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/collections/{coluuid}")
      replaceAll("\\{" + "coluuid" + "\\}", coluuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CollectionsApi->collectionsColuuidPost")
    if (coluuid == null) throw new Exception("Missing required parameter 'coluuid' when calling CollectionsApi->collectionsColuuidPost")

    dir match {
      case Some(param) => queryParams += "dir" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsFsAddPost(coluuid: String,
    content: String,
    &#x60;path&#x60;: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/collections/fs/add"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (coluuid == null) throw new Exception("Missing required parameter 'coluuid' when calling CollectionsApi->collectionsFsAddPost")

    if (content == null) throw new Exception("Missing required parameter 'content' when calling CollectionsApi->collectionsFsAddPost")

    if (&#x60;path&#x60; == null) throw new Exception("Missing required parameter '&#x60;path&#x60;' when calling CollectionsApi->collectionsFsAddPost")

    queryParams += "coluuid" -> coluuid.toString
    queryParams += "content" -> content.toString
    queryParams += "path" -> &#x60;path&#x60;.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsGet()(implicit reader: ClientResponseReader[List[collections.Collection]]): Future[List[collections.Collection]] = {
    // create path and map variables
    val path = (addFmt("/collections/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def collectionsPost(body: CreateCollectionBody)(implicit reader: ClientResponseReader[collections.Collection], writer: RequestWriter[CreateCollectionBody]): Future[collections.Collection] = {
    // create path and map variables
    val path = (addFmt("/collections/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CollectionsApi->collectionsPost")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
