package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.util.HttpError
import io.swagger.server.model.util.ViewerResponse

class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {
  import defaultMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  defaultService.viewerGet()
               
             
            }
         
        }
      }
    }
}

trait DefaultApiService {

  def viewerGet200(responseutil.ViewerResponse: util.ViewerResponse)(implicit toEntityMarshallerutil.ViewerResponse: ToEntityMarshaller[util.ViewerResponse]): Route =
    complete((200, responseutil.ViewerResponse))
  def viewerGet401(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((401, responseutil.HttpError))
  def viewerGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: util.ViewerResponse
   * Code: 401, Message: Unauthorized, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def viewerGet()
      (implicit toEntityMarshallerutil.ViewerResponse: ToEntityMarshaller[util.ViewerResponse], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait DefaultApiMarshaller {

  implicit def toEntityMarshallerutil.ViewerResponse: ToEntityMarshaller[util.ViewerResponse]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

