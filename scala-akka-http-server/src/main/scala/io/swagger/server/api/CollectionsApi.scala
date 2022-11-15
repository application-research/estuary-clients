package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Main.createCollectionBody
import io.swagger.server.model.Main.deleteContentFromCollectionBody
import io.swagger.server.model.collections.Collection
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
    path() { (coluuid, contentid) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Main.deleteContentFromCollectionBody]){ body =>
                  collectionsService.collectionsColuuidContentsDelete(body = body, coluuid = coluuid, contentid = contentid)
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
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[List[Int]]){ body =>
                  collectionsService.collectionsColuuidPost(body = body, coluuid = coluuid)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("coluuid".as[String], "content".as[String], "path".as[String]) { (coluuid, content, path) =>
          
            formFields() { () =>
              
                
                  collectionsService.collectionsFsAddPost(coluuid = coluuid, content = content, path = path)
               
             
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
              
                entity(as[Main.createCollectionBody]){ body =>
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
  def collectionsColuuidContentsDelete(body: Main.deleteContentFromCollectionBody, coluuid: String, contentid: String)
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

  def collectionsColuuidGet200(responseString: String): Route =
    complete((200, responseString))
  def collectionsColuuidGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsColuuidGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsColuuidGet(coluuid: String, dir: Option[String])
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

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
  def collectionsColuuidPost(body: List[Int], coluuid: String)
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
  def collectionsFsAddPost(coluuid: String, content: String, path: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def collectionsGet200(responsecollections.Collectionarray: List[List[collections.Collection]])(implicit toEntityMarshallercollections.Collectionarray: ToEntityMarshaller[List[List[collections.Collection]]]): Route =
    complete((200, responsecollections.Collectionarray))
  def collectionsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def collectionsGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def collectionsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[List[collections.Collection]]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def collectionsGet()
      (implicit toEntityMarshallercollections.Collectionarray: ToEntityMarshaller[List[List[collections.Collection]]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

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
  def collectionsPost(body: Main.createCollectionBody)
      (implicit toEntityMarshallercollections.Collection: ToEntityMarshaller[collections.Collection], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait CollectionsApiMarshaller {
  implicit def fromRequestUnmarshallerMain.deleteContentFromCollectionBody: FromRequestUnmarshaller[Main.deleteContentFromCollectionBody]

  implicit def fromRequestUnmarshallerList[Int]: FromRequestUnmarshaller[List[Int]]

  implicit def fromRequestUnmarshallerMain.createCollectionBody: FromRequestUnmarshaller[Main.createCollectionBody]


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

  implicit def toEntityMarshallercollections.Collectionarray: ToEntityMarshaller[List[List[collections.Collection]]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallercollections.Collection: ToEntityMarshaller[collections.Collection]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

