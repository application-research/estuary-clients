package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.Pinner.IpfsPin
import io.swagger.server.model.pinner.IpfsListPinStatusResponse
import io.swagger.server.model.pinner.IpfsPinStatusResponse
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
              
                entity(as[Pinner.IpfsPin]){ body =>
                  pinningService.pinningPinsPinidPost(body = body, pinid = pinid)
                }
             
            }
         
        }
      }
    } ~
    path() { () => 
      post {
        parameters("ignore-dupes".as[String].?, "overwrite".as[String].?) { (ignoreDupes, overwrite) =>
          
            formFields() { () =>
              
                entity(as[Pinner.IpfsPin]){ body =>
                  pinningService.pinningPinsPost(body = body, ignoreDupes = ignoreDupes, overwrite = overwrite)
                }
             
            }
         
        }
      }
    }
}

trait PinningApiService {

  def pinningPinsGet200(responsepinner.IpfsListPinStatusResponse: pinner.IpfsListPinStatusResponse)(implicit toEntityMarshallerpinner.IpfsListPinStatusResponse: ToEntityMarshaller[pinner.IpfsListPinStatusResponse]): Route =
    complete((200, responsepinner.IpfsListPinStatusResponse))
  def pinningPinsGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def pinningPinsGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: pinner.IpfsListPinStatusResponse
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsGet()
      (implicit toEntityMarshallerpinner.IpfsListPinStatusResponse: ToEntityMarshaller[pinner.IpfsListPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPinidDelete202: Route =
    complete((202, "Accepted"))
  def pinningPinsPinidDelete500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 202, Message: Accepted
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPinidDelete(pinid: String)
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPinidGet200(responsepinner.IpfsPinStatusResponse: pinner.IpfsPinStatusResponse)(implicit toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse]): Route =
    complete((200, responsepinner.IpfsPinStatusResponse))
  def pinningPinsPinidGet404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def pinningPinsPinidGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: pinner.IpfsPinStatusResponse
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPinidGet(pinid: String)
      (implicit toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPinidPost202(responsepinner.IpfsPinStatusResponse: pinner.IpfsPinStatusResponse)(implicit toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse]): Route =
    complete((202, responsepinner.IpfsPinStatusResponse))
  def pinningPinsPinidPost404(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((404, responseutil.HttpError))
  def pinningPinsPinidPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 202, Message: Accepted, DataType: pinner.IpfsPinStatusResponse
   * Code: 404, Message: Not Found, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPinidPost(body: Pinner.IpfsPin, pinid: String)
      (implicit toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

  def pinningPinsPost202(responsepinner.IpfsPinStatusResponse: pinner.IpfsPinStatusResponse)(implicit toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse]): Route =
    complete((202, responsepinner.IpfsPinStatusResponse))
  def pinningPinsPost500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 202, Message: Accepted, DataType: pinner.IpfsPinStatusResponse
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def pinningPinsPost(body: Pinner.IpfsPin, ignoreDupes: Option[String], overwrite: Option[String])
      (implicit toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait PinningApiMarshaller {
  implicit def fromRequestUnmarshallerPinner.IpfsPin: FromRequestUnmarshaller[Pinner.IpfsPin]


  implicit def toEntityMarshallerpinner.IpfsListPinStatusResponse: ToEntityMarshaller[pinner.IpfsListPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerpinner.IpfsPinStatusResponse: ToEntityMarshaller[pinner.IpfsPinStatusResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

