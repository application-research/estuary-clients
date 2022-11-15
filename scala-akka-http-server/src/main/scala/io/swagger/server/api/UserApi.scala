package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.main.getApiKeysResp
import io.swagger.server.model.util.HttpError

class UserApi(
    userService: UserApiService,
    userMarshaller: UserApiMarshaller
) {
  import userMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userApiKeysGet()
               
             
            }
         
        }
      }
    } ~
    path() { (keyOrHash) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userApiKeysKeyOrHashDelete(keyOrHash = keyOrHash)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("expiry".as[String].?, "perms".as[String].?) { (expiry, perms) =>
          
            formFields() { () =>
              
                
                  userService.userApiKeysPost(expiry = expiry, perms = perms)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userExportGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  userService.userStatsGet()
               
             
            }
         
        }
      }
    }
}

trait UserApiService {

  def userApiKeysGet200(responsemain.getApiKeysResparray: List[List[main.getApiKeysResp]])(implicit toEntityMarshallermain.getApiKeysResparray: ToEntityMarshaller[List[List[main.getApiKeysResp]]]): Route =
    complete((200, responsemain.getApiKeysResparray))
  def userApiKeysGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userApiKeysGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def userApiKeysGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[List[main.getApiKeysResp]]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userApiKeysGet()
      (implicit toEntityMarshallermain.getApiKeysResparray: ToEntityMarshaller[List[List[main.getApiKeysResp]]], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def userApiKeysKeyOrHashDelete200(responseString: String): Route =
    complete((200, responseString))
  def userApiKeysKeyOrHashDelete400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userApiKeysKeyOrHashDelete500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userApiKeysKeyOrHashDelete(keyOrHash: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def userApiKeysPost200(responsemain.getApiKeysResp: main.getApiKeysResp)(implicit toEntityMarshallermain.getApiKeysResp: ToEntityMarshaller[main.getApiKeysResp]): Route =
    complete((200, responsemain.getApiKeysResp))
  def userApiKeysPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userApiKeysPost404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def userApiKeysPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: main.getApiKeysResp
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userApiKeysPost(expiry: Option[String], perms: Option[String])
      (implicit toEntityMarshallermain.getApiKeysResp: ToEntityMarshaller[main.getApiKeysResp], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def userExportGet200(responseString: String): Route =
    complete((200, responseString))
  def userExportGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userExportGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userExportGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def userStatsGet200(responseString: String): Route =
    complete((200, responseString))
  def userStatsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def userStatsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def userStatsGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait UserApiMarshaller {

  implicit def toEntityMarshallermain.getApiKeysResparray: ToEntityMarshaller[List[List[main.getApiKeysResp]]]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallermain.getApiKeysResp: ToEntityMarshaller[main.getApiKeysResp]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

