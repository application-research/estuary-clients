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

object CollectionsApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def collectionsColuuidCommitPost(host: String, coluuid: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/collections/{coluuid}/commit".replaceAll("\\{" + "coluuid" + "\\}",escape(coluuid.toString))
    
    val httpMethod = Method.POST
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
  
  def collectionsColuuidDelete(host: String, coluuid: String): Task[Unit] = {
    val path = "/collections/{coluuid}".replaceAll("\\{" + "coluuid" + "\\}",escape(coluuid.toString))
    
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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def collectionsColuuidGet(host: String, coluuid: String, dir: String)(implicit coluuidQuery: QueryParam[String], dirQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/collections/{coluuid}"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("coluuid", Some(coluuidQuery.toParamString(coluuid))), ("dir", Some(dirQuery.toParamString(dir))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def collectionsColuuidPost(host: String, body: List[Integer]): Task[Map[String, String]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, String]] = jsonOf[Map[String, String]]

    val path = "/collections/{coluuid}"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[Map[String, String]](req)

    } yield resp
  }
  
  def collectionsFsAddPost(host: String, coluuid: String, content: String, `path`: String)(implicit coluuidQuery: QueryParam[String], contentQuery: QueryParam[String], `path`Query: QueryParam[String]): Task[Unit] = {
    val path = "/collections/fs/add"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("coluuid", Some(coluuidQuery.toParamString(coluuid))), ("content", Some(contentQuery.toParamString(content))), ("`path`", Some(pathQuery.toParamString(path))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def collectionsGet(host: String, id: Integer): Task[List[Collection]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Collection]] = jsonOf[List[Collection]]

    val path = "/collections/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))
    
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
      resp          <- client.expect[List[Collection]](req)

    } yield resp
  }
  
  def collectionsPost(host: String, body: CreateCollectionBody): Task[Collection] = {
    implicit val returnTypeDecoder: EntityDecoder[Collection] = jsonOf[Collection]

    val path = "/collections/"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[Collection](req)

    } yield resp
  }
  
}

class HttpServiceCollectionsApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def collectionsColuuidCommitPost(coluuid: String): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/collections/{coluuid}/commit".replaceAll("\\{" + "coluuid" + "\\}",escape(coluuid.toString))
    
    val httpMethod = Method.POST
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
  
  def collectionsColuuidDelete(coluuid: String): Task[Unit] = {
    val path = "/collections/{coluuid}".replaceAll("\\{" + "coluuid" + "\\}",escape(coluuid.toString))
    
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
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def collectionsColuuidGet(coluuid: String, dir: String)(implicit coluuidQuery: QueryParam[String], dirQuery: QueryParam[String]): Task[String] = {
    implicit val returnTypeDecoder: EntityDecoder[String] = jsonOf[String]

    val path = "/collections/{coluuid}"
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("coluuid", Some(coluuidQuery.toParamString(coluuid))), ("dir", Some(dirQuery.toParamString(dir))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[String](req)

    } yield resp
  }
  
  def collectionsColuuidPost(body: List[Integer]): Task[Map[String, String]] = {
    implicit val returnTypeDecoder: EntityDecoder[Map[String, String]] = jsonOf[Map[String, String]]

    val path = "/collections/{coluuid}"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[Map[String, String]](req)

    } yield resp
  }
  
  def collectionsFsAddPost(coluuid: String, content: String, `path`: String)(implicit coluuidQuery: QueryParam[String], contentQuery: QueryParam[String], `path`Query: QueryParam[String]): Task[Unit] = {
    val path = "/collections/fs/add"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("coluuid", Some(coluuidQuery.toParamString(coluuid))), ("content", Some(contentQuery.toParamString(content))), ("`path`", Some(pathQuery.toParamString(path))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }
  
  def collectionsGet(id: Integer): Task[List[Collection]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[Collection]] = jsonOf[List[Collection]]

    val path = "/collections/".replaceAll("\\{" + "id" + "\\}",escape(id.toString))
    
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
      resp          <- client.expect[List[Collection]](req)

    } yield resp
  }
  
  def collectionsPost(body: CreateCollectionBody): Task[Collection] = {
    implicit val returnTypeDecoder: EntityDecoder[Collection] = jsonOf[Collection]

    val path = "/collections/"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(body)
      resp          <- client.expect[Collection](req)

    } yield resp
  }
  
}
