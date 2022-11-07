package io.swagger.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

object UserApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def userApiKeysGet(host: String): Task[List[List[GetApiKeysResp]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[List[GetApiKeysResp]]] = jsonOf[List[List[GetApiKeysResp]]]

    val path = "/user/api-keys"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[List[GetApiKeysResp]]](req)

    } yield resp
  }
  
  def userApiKeysKeyDelete(host: String, key: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/user/api-keys/{key}".replaceAll("\\{" + "key" + "\\}",escape(key.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def userApiKeysPost(host: String, expiry: String, perms: String)(implicit expiryQuery: QueryParam[String], permsQuery: QueryParam[String]): Task[GetApiKeysResp] = {
    implicit val returnTypeDecoder: EntityDecoder[GetApiKeysResp] = jsonOf[GetApiKeysResp]

    val path = "/user/api-keys"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("expiry", Some(expiryQuery.toParamString(expiry))), ("perms", Some(permsQuery.toParamString(perms))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetApiKeysResp](req)

    } yield resp
  }
  
  def userExportGet(host: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/user/export"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def userStatsGet(host: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/user/stats"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
}

class HttpServiceUserApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def userApiKeysGet(): Task[List[List[GetApiKeysResp]]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[List[GetApiKeysResp]]] = jsonOf[List[List[GetApiKeysResp]]]

    val path = "/user/api-keys"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[List[GetApiKeysResp]]](req)

    } yield resp
  }
  
  def userApiKeysKeyDelete(key: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/user/api-keys/{key}".replaceAll("\\{" + "key" + "\\}",escape(key.toString))
    
    val httpMethod = Method.DELETE
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def userApiKeysPost(expiry: String, perms: String)(implicit expiryQuery: QueryParam[String], permsQuery: QueryParam[String]): Task[GetApiKeysResp] = {
    implicit val returnTypeDecoder: EntityDecoder[GetApiKeysResp] = jsonOf[GetApiKeysResp]

    val path = "/user/api-keys"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("expiry", Some(expiryQuery.toParamString(expiry))), ("perms", Some(permsQuery.toParamString(perms))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[GetApiKeysResp](req)

    } yield resp
  }
  
  def userExportGet(): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/user/export"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def userStatsGet(): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/user/stats"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
}
