package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Main.importDealBody
import io.swagger.server.model.Util.ContentAddIpfsBody
import io.swagger.server.model.Util.ContentCreateBody
import io.swagger.server.model.byte[]
import io.swagger.server.model.util.ContentAddResponse
import io.swagger.server.model.util.HttpError

class ContentApi(
    contentService: ContentApiService,
    contentMarshaller: ContentApiMarshaller
) {
  import contentMarshaller._

  lazy val route: Route =
    path() { () => 
      post {
        parameters("ignore-dupes".as[String].?, "filename".as[String].?) { (ignoreDupes, filename) =>
          
            formFields() { () =>
              
                entity(as[String]){ body =>
                  contentService.contentAddCarPost(body = body, ignoreDupes = ignoreDupes, filename = filename)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("ignore-dupes".as[String].?) { (ignoreDupes) =>
          
            formFields() { () =>
              
                entity(as[Util.ContentAddIpfsBody]){ body =>
                  contentService.contentAddIpfsPost(body = body, ignoreDupes = ignoreDupes)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("coluuid".as[String].?, "replication".as[Int].?, "ignore-dupes".as[String].?, "lazy-provide".as[String].?, "dir".as[String].?) { (coluuid, replication, ignoreDupes, lazyProvide, dir) =>
          
            formFields("data".as[byte[]], "filename".as[String]) { (data, filename) =>
              
                
                  contentService.contentAddPost(data = data, filename = filename, coluuid = coluuid, replication = replication, ignoreDupes = ignoreDupes, lazyProvide = lazyProvide, dir = dir)
               
             
            }
         
        }
      }
    } ~
    path() { (content) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentAggregatedContentGet(content = content)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("begin".as[String], "duration".as[String], "all".as[String]) { (begin, duration, all) =>
          
            formFields() { () =>
              
                
                  contentService.contentAllDealsGet(begin = begin, duration = duration, all = all)
               
             
            }
         
        }
      }
    } ~
    path() { (content) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentBwUsageContentGet(content = content)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("ignore-dupes".as[String].?) { (ignoreDupes) =>
          
            formFields() { () =>
              
                entity(as[Util.ContentCreateBody]){ body =>
                  contentService.contentCreatePost(body = body, ignoreDupes = ignoreDupes)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("limit".as[Int].?, "offset".as[Int].?) { (limit, offset) =>
          
            formFields() { () =>
              
                
                  contentService.contentDealsGet(limit = limit, offset = offset)
               
             
            }
         
        }
      }
    } ~
    path() { (datacid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentEnsureReplicationDatacidGet(datacid = datacid)
               
             
            }
         
        }
      }
    } ~
    path() { (content) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentFailuresContentGet(content = content)
               
             
            }
         
        }
      }
    } ~
    path() { (id) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentIdGet(id = id)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Main.importDealBody]){ body =>
                  contentService.contentImportdealPost(body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentListGet()
               
             
            }
         
        }
      }
    } ~
    path() { (cont) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentReadContGet(cont = cont)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentStagingZonesGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("limit".as[String], "offset".as[String]) { (limit, offset) =>
          
            formFields() { () =>
              
                
                  contentService.contentStatsGet(limit = limit, offset = offset)
               
             
            }
         
        }
      }
    } ~
    path() { (id) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  contentService.contentStatusIdGet(id = id)
               
             
            }
         
        }
      }
    }
}

trait ContentApiService {

  def contentAddCarPost200(responseString: String): Route =
    complete((200, responseString))
  def contentAddCarPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentAddCarPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentAddCarPost(body: String, ignoreDupes: Option[String], filename: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentAddIpfsPost200(responseString: String): Route =
    complete((200, responseString))
  def contentAddIpfsPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentAddIpfsPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentAddIpfsPost(body: Util.ContentAddIpfsBody, ignoreDupes: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentAddPost200(responseutil.ContentAddResponse: util.ContentAddResponse)(implicit toEntityMarshallerutil.ContentAddResponse: ToEntityMarshaller[util.ContentAddResponse]): Route =
    complete((200, responseutil.ContentAddResponse))
  def contentAddPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentAddPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: util.ContentAddResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentAddPost(data: String, filename: String, coluuid: Option[String], replication: Option[Int], ignoreDupes: Option[String], lazyProvide: Option[String], dir: Option[String])
      (implicit toEntityMarshallerutil.ContentAddResponse: ToEntityMarshaller[util.ContentAddResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentAggregatedContentGet200(responseString: String): Route =
    complete((200, responseString))
  def contentAggregatedContentGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentAggregatedContentGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentAggregatedContentGet(content: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentAllDealsGet200(responseString: String): Route =
    complete((200, responseString))
  def contentAllDealsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentAllDealsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentAllDealsGet(begin: String, duration: String, all: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentBwUsageContentGet200(responseString: String): Route =
    complete((200, responseString))
  def contentBwUsageContentGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentBwUsageContentGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentBwUsageContentGet(content: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentCreatePost200(responseString: String): Route =
    complete((200, responseString))
  def contentCreatePost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentCreatePost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentCreatePost(body: Util.ContentCreateBody, ignoreDupes: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentDealsGet200(responseString: String): Route =
    complete((200, responseString))
  def contentDealsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentDealsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentDealsGet(limit: Option[Int], offset: Option[Int])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentEnsureReplicationDatacidGet200(responseString: String): Route =
    complete((200, responseString))
  def contentEnsureReplicationDatacidGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentEnsureReplicationDatacidGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentEnsureReplicationDatacidGet(datacid: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentFailuresContentGet200(responseString: String): Route =
    complete((200, responseString))
  def contentFailuresContentGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentFailuresContentGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentFailuresContentGet(content: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentIdGet200(responseString: String): Route =
    complete((200, responseString))
  def contentIdGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentIdGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentIdGet(id: Int)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentImportdealPost200(responseString: String): Route =
    complete((200, responseString))
  def contentImportdealPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentImportdealPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentImportdealPost(body: Main.importDealBody)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentListGet200(responseString: String): Route =
    complete((200, responseString))
  def contentListGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentListGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentListGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentReadContGet200(responseString: String): Route =
    complete((200, responseString))
  def contentReadContGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentReadContGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentReadContGet(cont: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentStagingZonesGet200(responseString: String): Route =
    complete((200, responseString))
  def contentStagingZonesGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentStagingZonesGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentStagingZonesGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentStatsGet200(responseString: String): Route =
    complete((200, responseString))
  def contentStatsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentStatsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentStatsGet(limit: String, offset: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def contentStatusIdGet200(responseString: String): Route =
    complete((200, responseString))
  def contentStatusIdGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def contentStatusIdGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def contentStatusIdGet(id: Int)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait ContentApiMarshaller {
  implicit def fromRequestUnmarshallerUtil.ContentAddIpfsBody: FromRequestUnmarshaller[Util.ContentAddIpfsBody]

  implicit def fromRequestUnmarshallerUtil.ContentCreateBody: FromRequestUnmarshaller[Util.ContentCreateBody]

  implicit def fromRequestUnmarshallerString: FromRequestUnmarshaller[String]

  implicit def fromRequestUnmarshallerMain.importDealBody: FromRequestUnmarshaller[Main.importDealBody]


  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.ContentAddResponse: ToEntityMarshaller[util.ContentAddResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

