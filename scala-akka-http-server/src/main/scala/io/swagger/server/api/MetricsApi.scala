package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.util.HttpError

class MetricsApi(
    metricsService: MetricsApiService,
    metricsMarshaller: MetricsApiMarshaller
) {
  import metricsMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters() { () =>
          
            formFields() { () =>
              
                
                  metricsService.publicMetricsDealsOnChainGet()
               
             
            }
         
        }
      }
    }
}

trait MetricsApiService {

  def publicMetricsDealsOnChainGet200(responseString: String): Route =
    complete((200, responseString))
  def publicMetricsDealsOnChainGet400(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((400, responseutil.HttpError))
  def publicMetricsDealsOnChainGet500(responseutil.HttpError: util.HttpError)(implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route =
    complete((500, responseutil.HttpError))
  /**
   * Code: 200, Message: OK, DataType: String
   * Code: 400, Message: Bad Request, DataType: util.HttpError
   * Code: 500, Message: Internal Server Error, DataType: util.HttpError
   */
  def publicMetricsDealsOnChainGet()
      (implicit toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError], toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]): Route

}

trait MetricsApiMarshaller {

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

  implicit def toEntityMarshallerutil.HttpError: ToEntityMarshaller[util.HttpError]

}

