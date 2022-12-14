package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Api.createCollectionBody
import io.swagger.server.model.Api.deleteContentFromCollectionBody
import io.swagger.server.model.collections.Collection
import io.swagger.server.model.collections.CollectionListResponse
import io.swagger.server.model.util.HttpError

class CollectionsApi(
    collectionsService: CollectionsApiService,
    collectionsMarshaller: CollectionsApiMarshaller
) {
  import collectionsMarshaller._

  lazy val route: Route =
    path() { (coluuid) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsColuuidCommitPost(coluuid = coluuid)
               
             
            }
         
        }
      }
    } ~
    path() { (coluuid) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Api.deleteContentFromCollectionBody]){ body =>
                  collectionsService.collectionsColuuidContentsDelete(body = body, coluuid = coluuid)
                }
             
            }
         
        }
      }
    } ~
    path() { (coluuid) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsColuuidDelete(coluuid = coluuid)
               
             
            }
         
        }
      }
    } ~
    path() { (coluuid) => 
      get {
        parameters("dir".as[String].?) { (dir) =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsColuuidGet(coluuid = coluuid, dir = dir)
               
             
            }
         
        }
      }
    } ~
    path() { (coluuid) => 
      post {
        parameters("dir".as[String].?, "overwrite".as[String].?) { (dir, overwrite) =>
          
            formFields() { () =>
              
                entity(as[List[Int]]){ body =>
                  collectionsService.collectionsColuuidPost(body = body, coluuid = coluuid, dir = dir, overwrite = overwrite)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("coluuid".as[String], "content".as[String], "dir".as[String].?, "overwrite".as[String].?) { (coluuid, content, dir, overwrite) =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsFsAddPost(coluuid = coluuid, content = content, dir = dir, overwrite = overwrite)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Api.createCollectionBody]){ body =>
                  collectionsService.collectionsPost(body = body)
                }
             
            }
         
        }
      }
    }
}

trait CollectionsApiService {

  def collectionsColuuidCommitPost200(responseString: String): Route =
    complete((200, responseString))
  def collectionsColuuidCommitPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsColuuidCommitPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsColuuidCommitPost(coluuid: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsColuuidContentsDelete200(responseString: String): Route =
    complete((200, responseString))
  def collectionsColuuidContentsDelete400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsColuuidContentsDelete500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsColuuidContentsDelete(body: Api.deleteContentFromCollectionBody, coluuid: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsColuuidDelete200(responseString: String): Route =
    complete((200, responseString))
  def collectionsColuuidDelete400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsColuuidDelete500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsColuuidDelete(coluuid: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsColuuidGet200(responsecollections.CollectionListResponsearray: List[collections.CollectionListResponse])(implicit toEntityMarshallercollections.CollectionListResponsearray: ToEntityMarshaller[List[collections.CollectionListResponse]]): Route =
    complete((200, responsecollections.CollectionListResponsearray))
  def collectionsColuuidGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsColuuidGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[collections.CollectionListResponse]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsColuuidGet(coluuid: String, dir: Option[String])
      (implicit toEntityMarshallercollections.CollectionListResponsearray: ToEntityMarshaller[List[collections.CollectionListResponse]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsColuuidPost200(responseString: String): Route =
    complete((200, responseString))
  def collectionsColuuidPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsColuuidPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsColuuidPost(body: List[Int], coluuid: String, dir: Option[String], overwrite: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsFsAddPost200(responseString: String): Route =
    complete((200, responseString))
  def collectionsFsAddPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsFsAddPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsFsAddPost(coluuid: String, content: String, dir: Option[String], overwrite: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsGet200(responsecollections.Collectionarray: List[collections.Collection])(implicit toEntityMarshallercollections.Collectionarray: ToEntityMarshaller[List[collections.Collection]]): Route =
    complete((200, responsecollections.Collectionarray))
  def collectionsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def collectionsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[collections.Collection]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsGet()
      (implicit toEntityMarshallercollections.Collectionarray: ToEntityMarshaller[List[collections.Collection]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsPost200(responsecollections.Collection: collections.Collection)(implicit toEntityMarshallercollections.Collection: ToEntityMarshaller[collections.Collection]): Route =
    complete((200, responsecollections.Collection))
  def collectionsPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsPost404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def collectionsPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: collections.Collection
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsPost(body: Api.createCollectionBody)
      (implicit toEntityMarshallercollections.Collection: ToEntityMarshaller[collections.Collection], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait CollectionsApiMarshaller {
  implicit def fromRequestUnmarshallerApi.deleteContentFromCollectionBody: FromRequestUnmarshaller[Api.deleteContentFromCollectionBody]

  implicit def fromRequestUnmarshallerList[Int]: FromRequestUnmarshaller[List[Int]]

  implicit def fromRequestUnmarshallerApi.createCollectionBody: FromRequestUnmarshaller[Api.createCollectionBody]


  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallercollections.CollectionListResponsearray: ToEntityMarshaller[List[collections.CollectionListResponse]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallercollections.Collectionarray: ToEntityMarshaller[List[collections.Collection]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallercollections.Collection: ToEntityMarshaller[collections.Collection]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

