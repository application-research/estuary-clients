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

class PublicApi(
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
  val helper = new PublicApiAsyncHelper(client, config)

  /**
   * Get Content by Cid
   * This endpoint returns the content associated with a CID
   *
   * @param cid Cid 
   * @return void
   */
  def publicByCidCidGet(cid: String) = {
    val await = Try(Await.result(publicByCidCidGetAsync(cid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Content by Cid asynchronously
   * This endpoint returns the content associated with a CID
   *
   * @param cid Cid 
   * @return Future(void)
   */
  def publicByCidCidGetAsync(cid: String) = {
      helper.publicByCidCidGet(cid)
  }

  /**
   * Get public node info
   * This endpoint returns information about the node
   *
   * @return void
   */
  def publicInfoGet() = {
    val await = Try(Await.result(publicInfoGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get public node info asynchronously
   * This endpoint returns information about the node
   *
   * @return Future(void)
   */
  def publicInfoGetAsync() = {
      helper.publicInfoGet()
  }

  /**
   * Get deal metrics
   * This endpoint is used to get deal metrics
   *
   * @return void
   */
  def publicMetricsDealsOnChainGet() = {
    val await = Try(Await.result(publicMetricsDealsOnChainGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get deal metrics asynchronously
   * This endpoint is used to get deal metrics
   *
   * @return Future(void)
   */
  def publicMetricsDealsOnChainGetAsync() = {
      helper.publicMetricsDealsOnChainGet()
  }

  /**
   * Get all miners deals
   * This endpoint returns all miners deals
   *
   * @param miner Filter by miner 
   * @param ignoreFailed Ignore Failed (optional)
   * @return void
   */
  def publicMinersDealsMinerGet(miner: String, ignoreFailed: Option[String] = None) = {
    val await = Try(Await.result(publicMinersDealsMinerGetAsync(miner, ignoreFailed), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all miners deals asynchronously
   * This endpoint returns all miners deals
   *
   * @param miner Filter by miner 
   * @param ignoreFailed Ignore Failed (optional)
   * @return Future(void)
   */
  def publicMinersDealsMinerGetAsync(miner: String, ignoreFailed: Option[String] = None) = {
      helper.publicMinersDealsMinerGet(miner, ignoreFailed)
  }

  /**
   * Get all miners
   * This endpoint returns all miners
   *
   * @param miner Filter by miner 
   * @return void
   */
  def publicMinersFailuresMinerGet(miner: String) = {
    val await = Try(Await.result(publicMinersFailuresMinerGetAsync(miner), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all miners asynchronously
   * This endpoint returns all miners
   *
   * @param miner Filter by miner 
   * @return Future(void)
   */
  def publicMinersFailuresMinerGetAsync(miner: String) = {
      helper.publicMinersFailuresMinerGet(miner)
  }

  /**
   * Get all miners
   * This endpoint returns all miners
   *
   * @return void
   */
  def publicMinersGet() = {
    val await = Try(Await.result(publicMinersGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get all miners asynchronously
   * This endpoint returns all miners
   *
   * @return Future(void)
   */
  def publicMinersGetAsync() = {
      helper.publicMinersGet()
  }

  /**
   * Get miner stats
   * This endpoint returns miner stats
   *
   * @param miner Filter by miner 
   * @return void
   */
  def publicMinersStatsMinerGet(miner: String) = {
    val await = Try(Await.result(publicMinersStatsMinerGetAsync(miner), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get miner stats asynchronously
   * This endpoint returns miner stats
   *
   * @param miner Filter by miner 
   * @return Future(void)
   */
  def publicMinersStatsMinerGetAsync(miner: String) = {
      helper.publicMinersStatsMinerGet(miner)
  }

  /**
   * Net Addrs
   * This endpoint is used to get net addrs
   *
   * @return List[String]
   */
  def publicNetAddrsGet(): Option[List[String]] = {
    val await = Try(Await.result(publicNetAddrsGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Net Addrs asynchronously
   * This endpoint is used to get net addrs
   *
   * @return Future(List[String])
   */
  def publicNetAddrsGetAsync(): Future[List[String]] = {
      helper.publicNetAddrsGet()
  }

  /**
   * Net Peers
   * This endpoint is used to get net peers
   *
   * @return List[String]
   */
  def publicNetPeersGet(): Option[List[String]] = {
    val await = Try(Await.result(publicNetPeersGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Net Peers asynchronously
   * This endpoint is used to get net peers
   *
   * @return Future(List[String])
   */
  def publicNetPeersGetAsync(): Future[List[String]] = {
      helper.publicNetPeersGet()
  }

  /**
   * Public stats
   * This endpoint is used to get public stats.
   *
   * @return void
   */
  def publicStatsGet() = {
    val await = Try(Await.result(publicStatsGetAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Public stats asynchronously
   * This endpoint is used to get public stats.
   *
   * @return Future(void)
   */
  def publicStatsGetAsync() = {
      helper.publicStatsGet()
  }

}

class PublicApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def publicByCidCidGet(cid: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/by-cid/{cid}")
      replaceAll("\\{" + "cid" + "\\}", cid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (cid == null) throw new Exception("Missing required parameter 'cid' when calling PublicApi->publicByCidCidGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicInfoGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/info"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicMetricsDealsOnChainGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/metrics/deals-on-chain"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicMinersDealsMinerGet(miner: String,
    ignoreFailed: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/miners/deals/{miner}")
      replaceAll("\\{" + "miner" + "\\}", miner.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (miner == null) throw new Exception("Missing required parameter 'miner' when calling PublicApi->publicMinersDealsMinerGet")

    ignoreFailed match {
      case Some(param) => queryParams += "ignore-failed" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicMinersFailuresMinerGet(miner: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/miners/failures/{miner}")
      replaceAll("\\{" + "miner" + "\\}", miner.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (miner == null) throw new Exception("Missing required parameter 'miner' when calling PublicApi->publicMinersFailuresMinerGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicMinersGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/miners"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicMinersStatsMinerGet(miner: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/miners/stats/{miner}")
      replaceAll("\\{" + "miner" + "\\}", miner.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (miner == null) throw new Exception("Missing required parameter 'miner' when calling PublicApi->publicMinersStatsMinerGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicNetAddrsGet()(implicit reader: ClientResponseReader[List[String]]): Future[List[String]] = {
    // create path and map variables
    val path = (addFmt("/public/net/addrs"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicNetPeersGet()(implicit reader: ClientResponseReader[List[String]]): Future[List[String]] = {
    // create path and map variables
    val path = (addFmt("/public/net/peers"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def publicStatsGet()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/public/stats"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
