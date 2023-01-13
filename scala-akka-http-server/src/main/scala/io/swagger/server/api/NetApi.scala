package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.api.minerResp
import io.swagger.server.model.util.HttpError

class NetApi(
    netService: NetApiService,
    netMarshaller: NetApiMarshaller
) {
  import netMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.adminMinersGet()
               
             
            }
         
        }
      }
    } ~
    path() { (miner) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicMinersFailuresMinerGet(miner = miner)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicNetAddrsGet()
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  netService.publicNetPeersGet()
               
             
            }
         
        }
      }
    }
}

trait NetApiService {

  def adminMinersGet200(responseapi.minerResp: api.minerResp)(implicit toEntityMarshallerapi.minerResp: ToEntityMarshaller[api.minerResp]): Route =
    complete((200, responseapi.minerResp))
  def adminMinersGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def adminMinersGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: api.minerResp
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def adminMinersGet()
      (implicit toEntityMarshallerapi.minerResp: ToEntityMarshaller[api.minerResp], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def publicMinersFailuresMinerGet200(responseString: String): Route =
    complete((200, responseString))
  def publicMinersFailuresMinerGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def publicMinersFailuresMinerGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def publicMinersFailuresMinerGet(miner: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def publicNetAddrsGet200(responseStringarray: List[String]): Route =
    complete((200, responseStringarray))
  /**
   * Code: 200, Message: OK, DataType: List[String]
   */
  def publicNetAddrsGet()
      (implicit ): Route

  def publicNetPeersGet200(responseStringarray: List[String]): Route =
    complete((200, responseStringarray))
  def publicNetPeersGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def publicNetPeersGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: List[String]
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def publicNetPeersGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait NetApiMarshaller {

  implicit def toEntityMarshallerapi.minerResp: ToEntityMarshaller[api.minerResp]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

