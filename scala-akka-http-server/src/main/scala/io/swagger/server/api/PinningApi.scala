package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Types.IpfsPin
import io.swagger.server.model.types.IpfsListPinStatusResponse
import io.swagger.server.model.types.IpfsPinStatusResponse
import io.swagger.server.model.util.HttpError

class PinningApi(
    pinningService: PinningApiService,
    pinningMarshaller: PinningApiMarshaller
) {
  import pinningMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsGet()
               
             
            }
         
        }
      }
    } ~
    path() { (pinid) => 
      delete {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsPinidDelete(pinid = pinid)
               
             
            }
         
        }
      }
    } ~
    path() { (pinid) => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  pinningService.pinningPinsPinidGet(pinid = pinid)
               
             
            }
         
        }
      }
    } ~
    path() { (pinid) => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[String]){ body =>
                  pinningService.pinningPinsPinidPost(pinid = pinid, body = body)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters() { () =>
          
            formFields() { () =>
              
                entity(as[Types.IpfsPin]){ body =>
                  pinningService.pinningPinsPost(body = body)
                }
             
            }
         
        }
      }
    }
}

trait PinningApiService {

  def pinningPinsGet200(responsetypes.IpfsListPinStatusResponse: types.IpfsListPinStatusResponse)(implicit toEntityMarshallertypes.IpfsListPinStatusResponse: ToEntityMarshaller[types.IpfsListPinStatusResponse]): Route =
    complete((200, responsetypes.IpfsListPinStatusResponse))
  def pinningPinsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def pinningPinsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: types.IpfsListPinStatusResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsGet()
      (implicit toEntityMarshallertypes.IpfsListPinStatusResponse: ToEntityMarshaller[types.IpfsListPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPinidDelete202: Route =
    complete((202, ""))
  def pinningPinsPinidDelete500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 202
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPinidDelete(pinid: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPinidGet200(responsetypes.IpfsPinStatusResponse: types.IpfsPinStatusResponse)(implicit toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse]): Route =
    complete((200, responsetypes.IpfsPinStatusResponse))
  def pinningPinsPinidGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def pinningPinsPinidGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: types.IpfsPinStatusResponse
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPinidGet(pinid: String)
      (implicit toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPinidPost202(responsetypes.IpfsPinStatusResponse: types.IpfsPinStatusResponse)(implicit toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse]): Route =
    complete((202, responsetypes.IpfsPinStatusResponse))
  def pinningPinsPinidPost404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def pinningPinsPinidPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 202, Message: Accepted, DataType: types.IpfsPinStatusResponse
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPinidPost(pinid: String, body: String)
      (implicit toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPost202(responsetypes.IpfsPinStatusResponse: types.IpfsPinStatusResponse)(implicit toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse]): Route =
    complete((202, responsetypes.IpfsPinStatusResponse))
  def pinningPinsPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 202, Message: Accepted, DataType: types.IpfsPinStatusResponse
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPost(body: Types.IpfsPin)
      (implicit toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait PinningApiMarshaller {
  implicit def fromRequestUnmarshallerTypes.IpfsPin: FromRequestUnmarshaller[Types.IpfsPin]

  implicit def fromRequestUnmarshallerString: FromRequestUnmarshaller[String]


  implicit def toEntityMarshallertypes.IpfsListPinStatusResponse: ToEntityMarshaller[types.IpfsListPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallertypes.IpfsPinStatusResponse: ToEntityMarshaller[types.IpfsPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

