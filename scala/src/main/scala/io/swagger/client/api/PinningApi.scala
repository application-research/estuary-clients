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

import io.swagger.client.model.HttpError
import io.swagger.client.model.IpfsPin
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

class PinningApi(
  val defBasePath: String = "https://api.estuary.tech",
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
  val helper = new PinningApiAsyncHelper(client, config)

  /**
   * List all pin status objects
   * This endpoint lists all pin status objects
   *
   * @return String
   */
  def pinningPinsGet(): Option[String] = {
    val await = Try(Await.result(pinningPinsGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List all pin status objects asynchronously
   * This endpoint lists all pin status objects
   *
   * @return Future(String)
   */
  def pinningPinsGetAsync(): Future[String] = {
      helper.pinningPinsGet()
  }

  /**
   * Delete a pinned object
   * This endpoint deletes a pinned object.
   *
   * @param pinid Pin ID 
   * @return String
   */
  def pinningPinsPinidDelete(pinid: String): Option[String] = {
    val await = Try(Await.result(pinningPinsPinidDeleteAsync(pinid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete a pinned object asynchronously
   * This endpoint deletes a pinned object.
   *
   * @param pinid Pin ID 
   * @return Future(String)
   */
  def pinningPinsPinidDeleteAsync(pinid: String): Future[String] = {
      helper.pinningPinsPinidDelete(pinid)
  }

  /**
   * Get a pin status object
   * This endpoint returns a pin status object.
   *
   * @param pinid cid 
   * @return String
   */
  def pinningPinsPinidGet(pinid: String): Option[String] = {
    val await = Try(Await.result(pinningPinsPinidGetAsync(pinid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a pin status object asynchronously
   * This endpoint returns a pin status object.
   *
   * @param pinid cid 
   * @return Future(String)
   */
  def pinningPinsPinidGetAsync(pinid: String): Future[String] = {
      helper.pinningPinsPinidGet(pinid)
  }

  /**
   * Replace a pinned object
   * This endpoint replaces a pinned object.
   *
   * @param pinid Pin ID 
   * @param cid CID of new pin 
   * @param name Name (filename) of new pin (optional)
   * @param origins Origins of new pin (optional)
   * @param meta Meta information of new pin (optional)
   * @return String
   */
  def pinningPinsPinidPost(pinid: String, cid: String, name: Option[String] = None, origins: Option[String] = None, meta: Option[String] = None): Option[String] = {
    val await = Try(Await.result(pinningPinsPinidPostAsync(pinid, cid, name, origins, meta), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Replace a pinned object asynchronously
   * This endpoint replaces a pinned object.
   *
   * @param pinid Pin ID 
   * @param cid CID of new pin 
   * @param name Name (filename) of new pin (optional)
   * @param origins Origins of new pin (optional)
   * @param meta Meta information of new pin (optional)
   * @return Future(String)
   */
  def pinningPinsPinidPostAsync(pinid: String, cid: String, name: Option[String] = None, origins: Option[String] = None, meta: Option[String] = None): Future[String] = {
      helper.pinningPinsPinidPost(pinid, cid, name, origins, meta)
  }

  /**
   * Add and pin object
   * This endpoint adds a pin to the IPFS daemon.
   *
   * @param pin Pin Body {cid:cid, name:name} 
   * @return String
   */
  def pinningPinsPost(pin: IpfsPin): Option[String] = {
    val await = Try(Await.result(pinningPinsPostAsync(pin), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add and pin object asynchronously
   * This endpoint adds a pin to the IPFS daemon.
   *
   * @param pin Pin Body {cid:cid, name:name} 
   * @return Future(String)
   */
  def pinningPinsPostAsync(pin: IpfsPin): Future[String] = {
      helper.pinningPinsPost(pin)
  }

}

class PinningApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def pinningPinsGet()(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/pinning/pins"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def pinningPinsPinidDelete(pinid: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/pinning/pins/{pinid}")
      replaceAll("\\{" + "pinid" + "\\}", pinid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (pinid == null) throw new Exception("Missing required parameter 'pinid' when calling PinningApi->pinningPinsPinidDelete")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def pinningPinsPinidGet(pinid: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/pinning/pins/{pinid}")
      replaceAll("\\{" + "pinid" + "\\}", pinid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (pinid == null) throw new Exception("Missing required parameter 'pinid' when calling PinningApi->pinningPinsPinidGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def pinningPinsPinidPost(pinid: String,
    cid: String,
    name: Option[String] = None,
    origins: Option[String] = None,
    meta: Option[String] = None
    )(implicit reader: ClientResponseReader[String], writer: RequestWriter[String], writer: RequestWriter[Option[String]], writer: RequestWriter[Option[String]], writer: RequestWriter[Option[String]]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/pinning/pins/{pinid}")
      replaceAll("\\{" + "pinid" + "\\}", pinid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (pinid == null) throw new Exception("Missing required parameter 'pinid' when calling PinningApi->pinningPinsPinidPost")

    if (cid == null) throw new Exception("Missing required parameter 'cid' when calling PinningApi->pinningPinsPinidPost")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(meta))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def pinningPinsPost(pin: IpfsPin)(implicit reader: ClientResponseReader[String], writer: RequestWriter[IpfsPin]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/pinning/pins"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (pin == null) throw new Exception("Missing required parameter 'pin' when calling PinningApi->pinningPinsPost")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(pin))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
