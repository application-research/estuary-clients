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

import io.swagger.client.model.api.minerResp
import io.swagger.client.model.peering.PeeringPeer
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

class AdminApi(
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
  val helper = new AdminApiAsyncHelper(client, config)

  /**
   * Get all miners
   * This endpoint returns all miners. Note: value may be cached
   *
   * @return api.minerResp
   */
  def adminMinersGet(): Option[api.minerResp] = {
    val await = Try(Await.result(adminMinersGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all miners asynchronously
   * This endpoint returns all miners. Note: value may be cached
   *
   * @return Future(api.minerResp)
   */
  def adminMinersGetAsync(): Future[api.minerResp] = {
      helper.adminMinersGet()
  }

  /**
   * Remove peers on Peering Service
   * This endpoint can be used to remove a Peer from the Peering Service
   *
   * @param body Peer ids 
   * @return String
   */
  def adminPeeringPeersDelete(body: List[String]): Option[String] = {
    val await = Try(Await.result(adminPeeringPeersDeleteAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Remove peers on Peering Service asynchronously
   * This endpoint can be used to remove a Peer from the Peering Service
   *
   * @param body Peer ids 
   * @return Future(String)
   */
  def adminPeeringPeersDeleteAsync(body: List[String]): Future[String] = {
      helper.adminPeeringPeersDelete(body)
  }

  /**
   * List all Peering peers
   * This endpoint can be used to list all peers on Peering Service
   *
   * @return String
   */
  def adminPeeringPeersGet(): Option[String] = {
    val await = Try(Await.result(adminPeeringPeersGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List all Peering peers asynchronously
   * This endpoint can be used to list all peers on Peering Service
   *
   * @return Future(String)
   */
  def adminPeeringPeersGetAsync(): Future[String] = {
      helper.adminPeeringPeersGet()
  }

  /**
   * Add peers on Peering Service
   * This endpoint can be used to add a Peer from the Peering Service
   *
   * @param body Peering Peer array 
   * @return String
   */
  def adminPeeringPeersPost(body: List[peering.PeeringPeer]): Option[String] = {
    val await = Try(Await.result(adminPeeringPeersPostAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add peers on Peering Service asynchronously
   * This endpoint can be used to add a Peer from the Peering Service
   *
   * @param body Peering Peer array 
   * @return Future(String)
   */
  def adminPeeringPeersPostAsync(body: List[peering.PeeringPeer]): Future[String] = {
      helper.adminPeeringPeersPost(body)
  }

  /**
   * Start Peering
   * This endpoint can be used to start the Peering Service
   *
   * @return String
   */
  def adminPeeringStartPost(): Option[String] = {
    val await = Try(Await.result(adminPeeringStartPostAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Start Peering asynchronously
   * This endpoint can be used to start the Peering Service
   *
   * @return Future(String)
   */
  def adminPeeringStartPostAsync(): Future[String] = {
      helper.adminPeeringStartPost()
  }

  /**
   * Check Peering Status
   * This endpoint can be used to check the Peering status
   *
   * @return String
   */
  def adminPeeringStatusGet(): Option[String] = {
    val await = Try(Await.result(adminPeeringStatusGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Check Peering Status asynchronously
   * This endpoint can be used to check the Peering status
   *
   * @return Future(String)
   */
  def adminPeeringStatusGetAsync(): Future[String] = {
      helper.adminPeeringStatusGet()
  }

  /**
   * Stop Peering
   * This endpoint can be used to stop the Peering Service
   *
   * @return String
   */
  def adminPeeringStopPost(): Option[String] = {
    val await = Try(Await.result(adminPeeringStopPostAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Stop Peering asynchronously
   * This endpoint can be used to stop the Peering Service
   *
   * @return Future(String)
   */
  def adminPeeringStopPostAsync(): Future[String] = {
      helper.adminPeeringStopPost()
  }

  /**
   * Get systems(estuary/shuttle) config
   * This endpoint is used to get system configs.
   *
   * @return String
   */
  def adminSystemConfigGet(): Option[String] = {
    val await = Try(Await.result(adminSystemConfigGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get systems(estuary/shuttle) config asynchronously
   * This endpoint is used to get system configs.
   *
   * @return Future(String)
   */
  def adminSystemConfigGetAsync(): Future[String] = {
      helper.adminSystemConfigGet()
  }

  /**
   * Get all users
   * This endpoint is used to get all users.
   *
   * @return String
   */
  def adminUsersGet(): Option[String] = {
    val await = Try(Await.result(adminUsersGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all users asynchronously
   * This endpoint is used to get all users.
   *
   * @return Future(String)
   */
  def adminUsersGetAsync(): Future[String] = {
      helper.adminUsersGet()
  }

}

class AdminApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def adminMinersGet()(implicit reader: ClientResponseReader[api.minerResp]): Future[api.minerResp] = {
    // create path and map variables
    val path = (addFmt("/admin/miners/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminPeeringPeersDelete(body: List[String])(implicit reader: ClientResponseReader[String], writer: RequestWriter[List[String]]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/peering/peers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AdminApi->adminPeeringPeersDelete")

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminPeeringPeersGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/peering/peers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminPeeringPeersPost(body: List[peering.PeeringPeer])(implicit reader: ClientResponseReader[String], writer: RequestWriter[List[peering.PeeringPeer]]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/peering/peers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AdminApi->adminPeeringPeersPost")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminPeeringStartPost()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/peering/start"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminPeeringStatusGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/peering/status"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminPeeringStopPost()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/peering/stop"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminSystemConfigGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/system/config"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def adminUsersGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/admin/users"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
