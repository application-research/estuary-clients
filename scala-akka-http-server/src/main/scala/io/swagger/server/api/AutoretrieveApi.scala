package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.util.HttpError

class AutoretrieveApi(
    autoretrieveService: AutoretrieveApiService,
    autoretrieveMarshaller: AutoretrieveApiMarshaller
) {
  import autoretrieveMarshaller._

  lazy val route: Route =
    path() { () => 
      post {
        parameters() { () =>
          
            formFields("addresses".as[String], "pubKey".as[String]) { (addresses, pubKey) =>
              
                
                  autoretrieveService.adminAutoretrieveInitPost(addresses = addresses, pubKey = pubKey)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  autoretrieveService.adminAutoretrieveListGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          headerValueByName("token") { token => 
            formFields() { () =>
              
                
                  autoretrieveService.autoretrieveHeartbeatPost(token = token)
               
             
            }
          }
        }
      }
    }
}

trait AutoretrieveApiService {

  def adminAutoretrieveInitPost200(responseString: String): Route =
    complete((200, responseString))
  def adminAutoretrieveInitPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def adminAutoretrieveInitPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def adminAutoretrieveInitPost(addresses: String, pubKey: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def adminAutoretrieveListGet200(responseString: String): Route =
    complete((200, responseString))
  def adminAutoretrieveListGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def adminAutoretrieveListGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def adminAutoretrieveListGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def autoretrieveHeartbeatPost200(responseString: String): Route =
    complete((200, responseString))
  def autoretrieveHeartbeatPost400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def autoretrieveHeartbeatPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def autoretrieveHeartbeatPost(token: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait AutoretrieveApiMarshaller {

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

